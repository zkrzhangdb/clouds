http://localhost:5555/api-a/add?a=1&b=2：通过serviceId映射访问service-A中的add服务
http://localhost:5555/api-b/add?a=1&b=2：通过serviceId映射访问service-B中的add服务
http://localhost:5555/api-a-url/add?a=1&b=2：通过url映射访问service-A中的add服务

http://localhost:5555/api-a/add?a=1&b=2：返回401错误
http://localhost:5555/api-a/add?a=1&b=2&accessToken=token：正确路由到server-A，并返回计算内容


http://localhost:5555/dis/from?accessToken=token

配置说明
# routes to url
zuul.routes.api-a-url.path=/api-a-url/**
zuul.routes.api-a-url.url=http://localhost:2222/
也就是说当我们访问http://localhost:5555/api-a-url/add?a=1&b=2的时候，
Zuul会将该请求路由到：http://localhost:2222/add?a=1&b=2上。