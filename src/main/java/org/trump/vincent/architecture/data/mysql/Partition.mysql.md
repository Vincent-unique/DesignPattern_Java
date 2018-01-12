### MySQL分区表
```$
    创建分区表（表数据分区存储 and 存储在不同设备）。
    CREATE TABLE PLUMP_DATA(
           .....
    ) 
    PARTITION BY () 
    ( .... )
    
    
    分区方式：
    1、据（数据列）的范围来分区
    2、据列表分区
    3、据哈希值来分区
    
```

```$
    表（分区）分设备存储：
    1、DATA_DIRECTORY
    
    2、INDEX_DIRECTORY
```