<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>despliegue de variables </title>
    </head>
    <body>
        <h1>despliegue de variables</h1>
        variable en el alcance de request: ${mensaje};
        <br>
        <br>
        variable en alcance de sesion:
        <br>
        desplegar base: ${rectangulo.base}
        <br>
        desplegar altura: ${rectangulo.altura}
        <br>
        desplegar area: ${rectangulo.area}
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">regresar</a>
        
    </body>
</html>
