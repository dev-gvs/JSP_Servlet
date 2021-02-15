<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="App.Result"%>
<%
    request.setCharacterEncoding("UTF-8");
%>

<html>
    
    <head>
        <title>Решение</title>
    </head>
    
    <style>
        h1, h2 {
            text-align: center
        }
        a {
            margin:auto;
            text-align:center;
            display:block
        }
    </style>
    
    <body>
        <h1>Решение квадратного уравнения</h1>
        <h2><%
            Result result = (Result) request.getAttribute("result");
            if (result == null) {
                out.print("Нет решения!");
            } else {
                out.println(String.format("y = %.3f", result.getY()));
            }
            %></h2>
        <a href="javascript:history.back()">Назад</a><br/><br/>
    </body>
</html>