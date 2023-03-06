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

<form:form action="add" modelAttribute="cliente" method="POST" >

<form:hidden path="idCliente"/>
CEDULA
<form:input path="cedula" type="number" id="cedula" name="cedula" maxLength="10"/>
<br></br>
NOMBRE
<form:input path="nombre" type="text" id="nombre" name="nombre" maxLength="15"/>
<br></br>
APELLIDO
<form:input path="apellido" type="text" id="apellido" name="apellido" maxLength="15"/>
<br></br>
EDAD
<form:input path="edad" type="number" id="edad" name="edad" maxLength="3"/>
FECHA DE NACIMIENTO
<form:input path="fechaNacimiento" type="date" id="fechaNacimiento" name="fechaNacimiento" maxLength="8"/>
<br></br>
DIRECCION
<form:input path="direccion" type="text" id="direccion" name="direccion" maxLength="40"/>
<br></br>
TELEFONO
<form:input path="telefono" type="number" id="telefono" name="telefono" maxLength="15"/>
<br></br>
CORREO
<form:input path="correo" type="email" id="correo" name="correo" maxLength="40"/>
<br></br>


<button type="submit" id="btnGuardar">GUARDAR</button>
<button type="button" id="btnCancelar" onClick="window.location.href='/ismac-spring-factura-web101/clientes'; return false;">CANCELAR </button>
</form:form>


</body>
</html>