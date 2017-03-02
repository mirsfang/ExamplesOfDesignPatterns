#访问者模式

> 封装一些作用于某些数据结构中的各元素的操作,它可以在不改变数据结构的前提下定义作用于这些元素的新操作


这边我们拿经常遇见的获取用户信息的例子

VisitorMain是用户,他现在想要知道这里面所有用户活动的信息,在当前系统里面有两种用户
* 普通用户 ConcreateElementUser  活动信息只有在线时长  
* 管理员用户 ConcreateElementAdmin 活动信息包括在线时长与系统操作

 如何统一列出他们的信息



| 类名                    | 描述                       |
| --------------------- | ------------------------ |
| Element               | 具体的元素                    |
| IVisitor              | 抽象访问者                    |
| ConcreateElementAdmin | 具体元素--管理员                |
| ConcreateElementUser  | 具体元素--用户                 |
| ObjectStruture        | 结构对象,获取一个Element,现实中的数据源 |
| Visitor               | 具体的访问者                   |

