<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="controleur.*" %>
<%@ page import="modele.Modele" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FireCrest - Page d'accueil</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #e4ecff;
        }

        header {
            background-color: #4472c4;
            color: white;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        header h1 {
            margin: 0;
            font-size: 1.5rem;
        }

        header nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-size: 0.9rem;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: center;
          
        }

        .login-box {
            background-color: #b3ccff;
            width: 350px;
            padding: 30px;
            border-radius: 10px;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .login-box h2 {
            font-size: 1.5rem;
            margin-bottom: 20px;
        }

        .login-box img {
            width: 80px;
            margin-bottom: 20px;
        }

        .login-box input[type="text"],
        .login-box input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .login-box label {
            font-size: 0.9rem;
        }

        .login-box button {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: none;
            background-color: #4472c4;
            color: white;
            font-size: 1rem;
            border-radius: 5px;
            cursor: pointer;
        }

        footer {
            background-color: #4472c4;
            color: white;
            text-align: center;
            padding: 10px 0;
            font-size: 0.9rem;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    if (email != null && password != null) {
        User user = Modele.verifyUser(email, password);
        if (user != null) {
            session.setAttribute("currentUser", user);
            response.sendRedirect("welcome.jsp");
        } else {
            out.println("<p style='color:red;'>Email ou mot de passe incorrect.</p>");
        }
    }
%>
<form method="post">
    <label>Email : <input type="text" name="email" required></label><br>
    <label>Mot de passe : <input type="password" name="password" required></label><br>
    <button type="submit">Se connecter</button>
</form>

<footer>
    <p>©Copyright 2022 FireCrest | <a href="#" style="color: white;">Mentions légales</a> | <a href="#" style="color: white;">Conditions générales d'utilisation</a></p>
</footer>

</body>