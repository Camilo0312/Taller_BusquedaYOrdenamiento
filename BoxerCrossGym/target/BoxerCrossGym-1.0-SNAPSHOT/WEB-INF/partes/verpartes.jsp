<%-- 
    Document   : verpartes
    Created on : 27/06/2022, 11:37:29 a. m.
    Author     : kevin
--%>

<%@include file="../utilidades/cabecera.jsp" %>    
<h1>Partes</h1>
<a class="btn btn-primary" href="${pageContext.request.contextPath}/partes/agregarpartes.jsp" role="button">Agregar</a>
<table class="table table-dark table-striped">

    <tr>
        <th>Id</th>
        <th>Partes</th>
        <th>Accion</th>

    </tr>

    <c:forEach var="partes" items="${partes}">
        <tr>
            <td>${partes.id}</td>
            <td>${partes.parte}</td>
            
            <td>  
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/partes?accion=eliminar&id=${partes.id}" role="button">Eliminar</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/partes?accion=editar&id=${partes.id}" role="button">Actualizar</a>
            </td> 
        </tr>

    </c:forEach>
</table>
 <%@include file="../utilidades/pie.jsp" %>    

