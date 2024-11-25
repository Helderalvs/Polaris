<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="controleur.User" %>
<%
    User user = (User) session.getAttribute("currentUser");

    if (user == null) {
        response.sendRedirect("login.jsp"); // Redirection vers la page de connexion si l'utilisateur n'est pas connecté
    }
%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenue</title>
</head>
<body>
    <h1>Bienvenue, <%= user.getPrenom() %>!</h1>
    <p>Nous sommes heureux de vous voir ici.</p>
    <a href="logout.jsp">Se déconnecter</a>
</body>
</html>
