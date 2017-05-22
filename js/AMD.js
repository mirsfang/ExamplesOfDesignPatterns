/*
 * 创建闭包环境
 * 向闭包中传入模块管理对象F（~屏蔽压缩文件时，前面漏写；报错）
 */
~(function(F){
	//模块缓存器 存储已创建模块
	var moduleCache={}
})
((function(){
	//创建模块管理器对象F，并保存在全局作用域中
	return window.F={};
})());
/*
 * 创建或调用模块方法
 * @param 		url		参数为模块url
 * @param  		deps 		参数为依赖模块
 * @param		callback	参数为模块主函数
 */
F.module=function(url,modDeps,modCallback){
	//将参数转化为数组
	var args=[].slice.call(arguments),
	//获取模块构造函数（参数数组中最后一个参数成员）
	callback=args.pop(),
	//获取依赖模块(紧邻回调函数参数，且数据类型为数组)
	deps=(args.length&&args[args.length-1] instanceof Array)?args.pop():[],
	url=args.length?args.pop():null,
	params=[],
	depsCount=0,
	i=0,
	len;
	if(len==deps.length){
		while(i<len){
			//闭包保存i
			(function(i){
				depsCount++;
				//异步加载依赖模块
				loadModule(deps[i],function(mod){
					params[i]=mod;
					depsCount--;
					//如果依赖模块全部加载
					if (depsCount===0) {
						//在模块缓存器中矫正该模块，并执行构造函数
						setModule(url,params,callback);
					}
				});
			})(i);
			i++
		}
		//无依赖模块，直接执行回调函数
	}else{
		//在模块缓存器中矫正该模式，并执行构造函数
		setModule(url,[],callback);
	}
}

/*
 * 异步加载依赖模块所在文件
 * @param moduleName	模块路径（id）
 * @param callback		模块加载完成回调函数
 * 
 */
var moduleCache={},
setModule=function(moduleName,params,callback){},
loadModule=function(moduleName,callback){
	var _module;
	//如果该模块被加载过
	if(moduleCache[moduleName]){
		_module=moduleCache[moduleName];
		if (_module.status==='loaded') {
			setTimeout(callback(_module.exports),0);
		}else{
			//缓存该模块所处文件加载完成的回调函数
			_module.onload.push(callback);
		}
	}
	else{
		moduleCache[moduleName]={
			moduleName:moduleName,
			status:'loading',
			exports:null,
			onload:[callback]
		};
		loadSript(getUrl(moduleName));
	}
},
getUrl=function(){},
loadSript=function(){};

getUrl=function(moduleName){
	return string(moduleName).replace(/\.js$/g,''+'.js');
},
//加载脚本文件
loadScript=function(src){
	var _script=document.createElement('script');
	_script.type='text/javascript';
	_script.charset='UTF-8';
	_script.async=true;
	_script.src=src;
	document.getElementsByTagName('head')[0].appendChild(_script);
};
