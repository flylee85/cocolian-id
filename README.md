## 一、功能

cocolian-id模块是一个基础功能模块，为其他业务提供id发生器支持。包括如下子模块：
1. cocolian-id-generator：id发生器，这是一个RPC服务； 
2. cocolian-id-facade： id发生器SDK， 提供给需要ID服务的模块使用，对cocolian-id-generator的客户端进行封装，提供实现无关的接口。 
3. cocolian-id-redis： 支持cocolian-id-generator的redis镜像。 