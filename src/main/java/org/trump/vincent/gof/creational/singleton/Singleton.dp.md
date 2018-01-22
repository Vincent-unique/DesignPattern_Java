##Singleton Design Pattern
```
    单例模式的实现方式大致为三种：
    1、[Eager-loading] 饿汉模式，使用类加载器并发安全机制保证实例初始化时的线程安全
    
    2、[Lazy-loading] DCL设计方式，以synchronized、ReentrantLock等+ volatile 并发控制保证实例初始化时的线程安全
    
    3、[Lazy-loading] 内部类方式，依旧使用类加载器的并发安全控制保证实例初始化时的线程安全;但是因为使用内部类的类加载过程，实现了懒加载
```