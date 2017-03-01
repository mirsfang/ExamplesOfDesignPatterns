
#装饰器模式

>动态的给一个对象添加一些额外的职责，就增加功能来说，装饰器比生成子类更加灵活

* 尽量使用对象组合，而不是通过继承来扩展和复用功能

感觉直接搞得话太过于抽象，看到《设计模式之禅》上面的例子，感觉不错，借鉴一下


decoratorAbs  这个文件里面都是抽象类等
decoratorIml 这是文件里面都是实现类


| 类名                          | 描述        |
| --------------------------- | --------- |
| SchoolReport                | 抽象成绩单类    |
| FouthGradeSchoolReport      | 四年级的成绩单   |
| SuagrFouthGradeSchoolReport | 继承装饰类     |
| DecoratorMain               | main函数所在类 |
| Decorator                   | 装饰类       |
| GoodBoyDecortaor            | 装饰在学校的表现  |
| RankDecortaor               | 装饰在学校的排名  |



SchoolReport 和 FouthGradeSchoolReport 是通用的



SuagrFouthGradeSchoolReport 这是继承实现的装饰



Decorator是抽象的装饰器 GoodBoyDecortaor和RankDecortaor是他的实现