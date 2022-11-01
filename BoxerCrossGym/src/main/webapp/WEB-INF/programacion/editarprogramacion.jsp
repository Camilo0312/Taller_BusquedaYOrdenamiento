<%-- 
    Document   : editarprogramacion
    Created on : 29/06/2022, 11:15:26 p. m.
    Author     : kevin
--%>

<%@include file="../utilidades/cabecera.jsp" %>
        <form action="${pageContext.request.contextPath}/programacion?accion=actualizar" method="post">
            <div class="mb-3">
                
                <input type="text" value="${programacion.id}" hidden="hidden" class="form-control" id="id" name="id" aria-describedby="id de programacion">
          
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">IdPartes</label>
                <input type="text" value="${programacion.idPartes}" class="form-control" id="nombre" name="nombre">
            </div>
            
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Fecha</label>
                <input type="text" value="${programacion.fecha}" class="form-control" id="telefono" name="telefono">
            </div>
            
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">IdTipo</label>
                <input type="text" value="${programacion.idTipo}" class="form-control" id="direccion" name="direccion">
            </div>
            
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
<%@include file="../utilidades/pie.jsp" %>    
