<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>CLIENTES</h1>

<form:form action="del" modelAttribute="cliente" method="GET">

<form:hidden path="idCliente"/>
<strong><h3>Desea eliminar el registro?</h3></strong>
<br></br>

<button type="submit" id="btnEliminar">ELIMINAR</button>
<button type="button" id="btnCancelar" onClick="window.location.href='/ismac-spring-factura-web101/clientes'; return false;">CANCELAR </button>

</form:form>




</body>
</html>