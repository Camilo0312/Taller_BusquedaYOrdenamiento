<%-- 
    Document   : verprogramacion
    Created on : 27/06/2022, 11:37:29 a. m.
    Author     : kevin
--%>

<%@include file="../utilidades/cabecera.jsp" %>    
<h1>Programacion</h1>
<a class="btn btn-primary" href="${pageContext.request.contextPath}/programacion/agregarprogramacion.jsp" role="button">Agregar</a>
<table class="table table-dark table-striped">

    <tr>
        <th>Id</th>
        <th>IdPartes</th>
        <th>Fecha</th>
        <th>IdTipo</th>
        <th>Accion</th>

    </tr>

    <c:forEach var="programacion" items="${programacion}">
        <tr>
            <td>${programacion.id}</td>
            <td>${programacion.idPartes}</td>
            <td>${programacion.fecha}</td>
            <td>${programacion.idTipo}</td>
            <td>  
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/programacion?accion=eliminar&id=${programacion.id}" role="button">Eliminar</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/programacion?accion=editar&id=${programacion.id}" role="button">Actualizar</a>
            </td> 
        </tr>

    </c:forEach>
</table>
 <%@include file="../utilidades/pie.jsp" %>    

