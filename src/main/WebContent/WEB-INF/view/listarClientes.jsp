<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Insert title here</title>
        </head>
        <body>
            <h1>Clientes</h1>


            <button><a href="${pageContext.request.contextPath}/clientes/frmAdd">AGREGAR</a></button>

            <table>
                <thead>
                    <tr>

                        <th>idCliente</th>
                        <th>cedula</th>
                        <th>nombre</th>
                        <th>apellido</th>
                        <th>fechanacimiento</th>
                        <th>edad</th>
                        <th>direccion</th>
                        <th>Telefono</th>
                        <th>correo</th>
                        <th>ACCIONES</th>

                    </tr>
                </thead>

                <tbody>

                    <c:forEach var="items" items="${clientes}">
                        <tr>
                            <td>${items.idCliente}</td>
                            <td>${items.cedula}</td>
                            <td>${items.nombre}</td>
                            <td>${items.apellido}</td>
                            <td>${items.fechaNacimiento}</td>
                            <td>${items.edad}</td>
                            <td>${items.direccion}</td>
                            <td>${items.telefono}</td>
                            <td>${items.correo}</td>
                            
                            <td>
                             <button><a href="${pageContext.request.contextPath}/clientes/findOne?idCliente=${items.idCliente}&opcion=1">ACTUALIZAR</a></button>
                             <button><a href="${pageContext.request.contextPath}/clientes/findOne?idCliente=${items.idCliente}&opcion=2">BORRAR</a></button>
                            </td>
                        </tr>

                    </c:forEach>

                </tbody>
            </table>

        </body>

        </html>