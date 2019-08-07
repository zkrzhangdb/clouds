http://localhost:5555/api-a/add?a=1&b=2：通过serviceId映射访问service-A中的add服务
http://localhost:5555/api-b/add?a=1&b=2：通过serviceId映射访问service-B中的add服务
http://localhost:5555/api-a-url/add?a=1&b=2：通过url映射访问service-A中的add服务

http://localhost:5555/api-a/add?a=1&b=2：返回401错误
http://localhost:5555/api-a/add?a=1&b=2&accessToken=token：正确路由到server-A，并返回计算内容

