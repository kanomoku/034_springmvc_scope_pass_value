<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
request:${requestScope.req}<br/>
session:${sessionScope.reqSession}<br/>
sessionParam:${sessionScope.sessionParam}<br/>
application:${applicationScope.application}<br/>
<hr>
map:${mapkey}<br/>
map:${requestScope.mapkey}<br/>
map:${sessionScope.mapkey}<br/>
map:${applicationScope.mapkey}<br/>
<hr>
model:${modelkey}<br/>
model:${requestScope.modelkey}<br/>
model:${sessionScope.modelkey}<br/>
model:${applicationScope.modelkey}<br/>
<hr>
mav:${mavkey}<br/>
mav:${requestScope.mavkey}<br/>
mav:${sessionScope.mavkey}<br/>
mav:${applicationScope.mavkey}<br/>
</body>
</html>