<%-- 
    Document   : editarpartes
    Created on : 29/06/2022, 11:15:26 p. m.
    Author     : kevin
--%>

<%@include file="../utilidades/cabecera.jsp" %>
        <form action="${pageContext.request.contextPath}/partes?accion=actualizar" method="post">
            <div class="mb-3">
                
                <input type="text" value="${partes.id}" hidden="hidden" class="form-control" id="id" name="id" aria-describedby="id de partes">
          
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Parte</label>
                <input type="text" value="${partes.parte}" class="form-control" id="parte" name="parte">
            </div>
           
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
<%@include file="../utilidades/pie.jsp" %>    

