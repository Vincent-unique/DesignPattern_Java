##Decorator Design Pattern
```$xslt
    装饰器模式提供的思路是，在已有的模型基础上，不断的扩展职责（延伸其属性）。
    不如在我的案例里，抽象了一个基本模型 Origin，并提供了一个基本实现（OriginImpl），
    第一次装饰（职责扩展），Decorator 在Origin基础上，扩展了 before职责（添加了info属性）；
    第二次装饰，DoubleDecorator在 Decorator基础上，扩张了 showVD职责（添加了vendor属性）；
    第三次装饰，TripleDecorator在 DoubleDecorator基础上，扩展了 saleTo职责（添加了toCountry属性）
```
```$xslt
    Notice：
    装饰-扩展过程中可能要为模型添加新的属性定义，为了保证后续基于当前模型的扩张的模型能够使用这些属性，应当将其访问控制设置为protected。
```