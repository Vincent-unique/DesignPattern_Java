### 分布式中session一致性同步方案
```$
    分布式session一致性解决方案大致是以下5种：
    1、粘性session (如Nginx配置，或通过前端做LoadBalance,根据sessionId将用户的请求hash到固定的服务器）
    2、服务器session复制功能（服务集群间session互相同步； 存在延迟与网络开销，使用服务器集群节点少，且session量少的场景；所以，大众C端用户的高并发产品不太适用）
    3、session集中管理,session共享（粘性，非粘性）
        基于缓存的session共享，
        基于Zookeeper的session集中管理
    4、数据库，session持久化
    5、Cookie存储所有session数据，并在请求时发送到服务端（千万不要用，low）
    
  
```
```$
  个人理想设计：前端hash 粘性session + redis集中式session共享:
  
```

###分布式环境（session），解决logout问题