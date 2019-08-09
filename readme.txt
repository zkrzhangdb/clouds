依次启动eureka-server、compute-service、eureka-ribbon工程
访问http://localhost:1111/可以看到注册中心的状态
访问http://localhost:3333/add，页面显示：30
关闭compute-service服务后再访问http://localhost:3333/add，页面显示：error
-----------------------------------------------------
RegisterCenter  服务注册中心   多个服务注册中心可以实现高可用
ServiceA ， ServiceB ， ServiceProvider  服务提供者
Ribbon 负载均衡
ConfigServer   配置中心
ConfigTest     配置测试
Zuul 网关
-----------------------------------------------------
