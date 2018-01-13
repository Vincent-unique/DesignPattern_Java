### MySQL索引
```$
    索引在关系型数据库性能考虑上是至关重要的，MySQL索引有如下7种：
    1、主键索引 ( PRIMARY KEY )
    不可重复，不可为空
    
   2、唯一索引 （ UNIQUE ）
    不可重复，可为空（MySQL中，NULL具备特殊意义，NULL与任何值不相等，NULL与NULL不相等；所以判空用 IS NULL 、 IS NOT NULL）
    
   3、常规索引  ( INDEX )
    不唯一，可重复，可为空
   
   4、前缀索引 （ INDEX(n) )
   和常规索引属性类似；
   只是前缀索引只对前n 位建立索引（ 二进制串·前n位二进制串； 非二进制串·前n位字符）
   
   5、全文索引  ( FULLTEXT ）
   支持全文分词检索。
   MyISAM支持；InnoDB下 5.6.4 之后的版本才支持。
   
   6、空间值索引 ( SPATIAL )
    仅 适用于包含 空间值的 MyIASM表
    
   7、HASH索引、USING BTREE
   仅适用 MEMORY 存储引擎 （默认是 HASH索引， 可 USING BTREE）
   
```

```$
    一、修改表的存储引擎：
    1、创建表时，指定存储引擎：
        CREATE TABEL tablename(
            `.....
        ) ENGINE = engine_name;
    
    2、修改表的存储引擎：
        ALTER TABLE tablename ENGINE = engine_name;
        例：
        alter table temp_table engine = memory;
        
        
     3、查看当前表的存储引擎
     SHOW TABLE STATUS FROM db_name WHERE NAME = table_name;
     例：
        show table status from db_test where name = 'temp_table';
        
     Notice :
     SHOW CREATE TABLE table_name 语法查看的 engine 可能有误；
     即，“ show-create-table"语法是查看最初创建该表的DDL真实语义（被保存某张表中）；
     当期间通过 ALTER修改了ENGINE时，该语法查看到的依然是最初的ENGINE。
        
    二、创建索引
    1、create table 时 添加索引 （PRIMARY KEY 与 UNIQUE 可直接在列后加）
    
    2、alter table tablename add UNIQUE indexname ( index_columns );
    
    alter table tablename add INDEX indexname (
     
    3、create UNIQUE/ INDEX/ FULLTEXT/ SPATIAL indexname on tablename ( index_columns); 
    
    三、删除索引
    1、DROP INDEX index_name ON table_name;
    例：
       drop INDEX gen_index on temp_table;
       
       drop INDEX `PRIMARY` on temp_table; // 删除主键
       
       drop INDEX fulltext_index on temp_table; // 删除全文索引
    
    2、ALTER TABLE tablename DROP INDEX index_name;
        
        ALTER TABLE tablename DROP PRIMARY KEY;
    
    
    四、查看索引
    1、SHOW INDEX FROM table_name ( FROM db_name )
    例： 
        show index from temp_table ;
        
    2、SHOW CREATE TABLE table_name;
    例： 
        show create table temp_table;
```