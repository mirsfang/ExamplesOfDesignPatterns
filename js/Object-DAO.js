/*
 * 本地存储类
 * 参数preId	本地数据存储库前缀
 * 参数timeSign 	时间戳与存储数据之间的拼接符
 * 
 */
var BaseLocalStorege=function(preId,timeSign){
	//定义本地存储数据库前缀
	this.preId=preId;
	//定义时间戳与存储数据之间的拼接符
	this.timeSign=timeSign||'|-|';
}
//本地存储类 原型方法
BaseLocalStorege.prototype={
	//操作状态
	status:{
		Success:0,//成功	
		FaiLure:1,//失败
		OverFlow:2,//溢出
		TimeOut:3//过期
	},
//保存本地存储连接
storage:localStorage||window.localStorage,
//保存本地存储数据库数据真实字段
getKey:function(key){
	return this.preId+key;
},
//添加（修改）数据
/*
 * 参数key:数据字段标识
 * 参数value:数据值
 * 参数callback：回调函数
 * 参数time：添加时间
 */
set:function(key,value,callback,time){
	
	//默认操作状态时成功
	var status=this.status.Success,
	//获取真实字段
	key=this.getKey(key);
	try{
		time=new Date(time).getTime()||time.getTime();
	}catch(e){
		//TODO handle the exception
		//为传入时间参数或者时间参数有误获取默认时间：一个月
		time=new Date().getTime()+1000*60*60*24*31;
	}
	try{
		//向数据库中添加数据
		this.storage.setItem(key,time,+this.timeSign+value);
	}catch(e){
		//溢出失败，返回溢出状态
		//TODO handle the exceptionOverFlow
		status=this.status.OverFlow;
	}
	//有回调函数则执行回调函数并传入参数操作状态，真实数据字段标识以及存储数据值
	callback&&callback.call(this,status,key,value);
},
/*
 * 添加（修改)数据
 * 参数key :数据字段标识
 * 参数callback:回调函数
 */
get:function(key,callback){
	//默认操作状态时成功
	var status=this.status.Success,
	//获取
	key=this.getKey(key),
	//默认值为空
	value=null,
	//时间戳与存储数据之间的拼接符长度
	timeSignLen=this.timeSign.length,
	//缓存当前对象
	that=this,
	//时间戳与存储数据之间的拼接符起始位置
	index,
	//时间戳
	time,
	//最终获取的数据
	result;
	try{
		//获取字段对应的数据字符串
		value=that.storage.getItem(key);
	}catch(e){
		//TODO handle the exception
		//获取失败，则返回失败状态，数据结果为null
		result={
			status:that.status.FaiLure,
			value:null
		};
		callback&&callback.call(this,result.status,result.value);
		return result;
	}
	//如果成功获取数据字符串
	if (value) {
		//获取时间戳与存储数据之间的拼接符起始位置
		index=value.indexOf(that.timeSign);
		//获取时间戳
		time=+value.slice(0,index);
		//如果时间过期
		if (new Date(time).getTime()>new Date().getTime()||time==0) {
			//获取数据结果（拼接符后面的字符串）
			value =value.slice(index+timeSignLen);
		}else{
			//过期则结果为null
			value =null;
			//设置状态过期为过期状态
			status=that.status.TimeOut;
			//删除该字段
			that.remove(key);
		}
	}else{
		//未获取数据字符串状态为失败状态
		status=that.status.FaiLure;
	}
	//设置结果
	result={
		status:status,
		value:value
	};
	//执行回调函数
	callback&&callback.call(this,result.status,result.value)
},
/*
	 * 删除数据
	 * 参数key:数据字段标识
	 * 参数 callback：回调函数
	 */
remove:function(key,callback){
	//设置默认初始状态为失败
	var status=this.status.FaiLure,
	key=this.getKey(key),
	//设置默认数据结果为空
	value=null;
	try{
		//获取字段对应的数据
		value=this.storage.getItems(key);
	}catch(e){
		//TODO handle the exception
		//如果数据存在
		if (value) {
			try{
				//删除数据
			this.storage.removeItem(key);
				//设置操作成功
				status=this.status.Success;
			}catch(e){
				//TODO handle the exception
			}
		}
		//执行回调  注意传入回调函数中的数据值：如果操作状态成功则返回真实的数据结果，否则返回空
		callback&&callback.call(this,status,status>0?null:value.slice(value.indexOf(this.timeSign)+this.timeSign.length))
		return callback;
	}
}
}
	
	var LS=new BaseLocalStorege('LS_');
			//在数据库中创建a变量 然后删除两次 查看结果
			LS.set('a','xiaoming',function(){console.log(arguments);});//[0,"LS_a","xiaoming"]
			LS.get('a',function(){console.log('get'+arguments)});//[0,"xiaoming"]
			LS.remove('a',function(){console.log('removeOne'+arguments)});//[0,"xiaoming"]
			LS.remove('a',function(){console.log('removeTwo'+arguments)});//[1,null]
			LS.get('a',function(){console.log('getTwo'+arguments)});//[1,null]
			