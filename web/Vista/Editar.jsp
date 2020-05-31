<%-- 
    Document   : Editar
    Created on : 31-may-2020, 14:05:39
    Author     : willy
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>

        <div class="container">

            <div class="card mt-5" >
                <div class="card-body">
                    <h1 class="text-center my-4">Editar Informacion del Producto</h1>

                    <div class="my-4">
                        <form action="Controlador" method="POST">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Descripcion del Producto</label>
                                <input type="text" name="desc" class="form-control" value="${producto.getDesc()}" >

                            </div>
                            <div class="form-group">
                                <label for="">Stock</label>
                                <input type="number" name="stock" class="form-control" max="1000" min="1" value="${producto.getStock()}">
                            </div>
                            <input type="hidden" name="id" value="${producto.getId()}">
                            <input type="hidden" name="accion" value="update">
                            <button type="submit" class="btn btn-primary">Actualizar</button>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <!-- JS, Popper.js, and jQuery -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </body>
</html>
