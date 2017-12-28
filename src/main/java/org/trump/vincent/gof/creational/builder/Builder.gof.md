#Builder Design Pattern

##构建器模式的优缺点
###优点
```$xslt
    保证复杂参数类型在构建时的数据完整性。
    既避免了写一个超多参数的构造方法，有保证产出的实例对象的属性的完整性（不会缺少必要属性值）
```
```$xslt
    构建器模式能够保证对象属性不被篡改（即，由 Builder构建完成之后，就予Builder失去关联，build生成的实例具备完整的属性，
    且不公开任何修改内部属性的方法，保证了实例一旦构建完成，则内部基本属性不再改变—final）。
    *************************
    为何不使用 final修饰属性呢？
    final属性当然能够保证实例的属性不被改变，但是setter方法不支持final属性赋值；
    支持final属性赋值的方式有：
    1、类加载器初始化（new 方式、静态代码方式）
    2、构造器传参赋值
    显然，上述两种方式，对于内部属性较为丰富的类型定义来说是不太实用的。
```

###缺点
```$xslt
    开销过大。
    需要首先构建一个具有 builder 目标类型的完备的属性的 Builder实例
```