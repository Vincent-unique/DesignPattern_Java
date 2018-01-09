## Template Method Design Patten
```
   模板方法模式，其思想是通过抽象类提供相关方法的默认实现。
   如JDK 中的很多 Abstract 类（AbstractList、AbstractMap）等都是基于这种设计模式，以及 InputStream 、OutputStream等相关类也是这种模式。Spring 中的BeanFactory结构也是。
   当然，IO流类中一个更注目的设计模式是装饰器模式。
```

```$
   JDK1.8开始，interface类型定义中支持 default关键字，定义相关方法的默认实现。
   这是模板方法实现的绝美工具。
```