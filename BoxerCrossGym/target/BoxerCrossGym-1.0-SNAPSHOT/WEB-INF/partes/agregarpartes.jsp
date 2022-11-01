<%-- 
    Document   : agregarpartes
    Created on : 27/06/2022, 11:37:43 a. m.
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/partes?accion=crear" method="post">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Id Partes</label>
                <input type="text" class="form-control" id="id" name="id" aria-describedby="id de partes">
          
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Partes</label>
                <input type="text" class="form-control" id="nombre" name="parte">
            </div>
            
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
