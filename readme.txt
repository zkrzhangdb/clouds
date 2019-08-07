依次启动eureka-server、compute-service、eureka-ribbon工程
访问http://localhost:1111/可以看到注册中心的状态
访问http://localhost:3333/add，页面显示：30
关闭compute-service服务后再访问http://localhost:3333/add，页面显示：error