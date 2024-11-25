package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controleur.User;

public class Modele {
	
	//Instanciation de la classe Connexion
	private static Connexion uneConnexion = new Connexion("localhost", "unisphere ","root","");

	/************ Gestion des entreprises ***********/
	 public static void insertUser(User unUser) {
	        // Requête d'insertion SQL
	        String requete = "INSERT INTO user (id_user, nom, prenom, email, mdp, date_de_naissance, adresse, telephone) " +
	                         "VALUES (null, '" + unUser.getNom() + "', '" + unUser.getPrenom() + "', '" + unUser.getEmail() + "', '" +
	                         unUser.getMdp() + "', '" + new java.sql.Date(unUser.getDateDeNaissance().getTime()) + "', '" +
	                         unUser.getAdresse() + "', '" + unUser.getTelephone() + "');";

	        try {
	            // Se connecter à la base de données
	            uneConnexion.seConnecter();
	            // Créer un objet Statement pour exécuter la requête SQL
	            Statement unStat = uneConnexion.getMaConnexion().createStatement();
	            // Exécuter la requête d'insertion
	            unStat.execute(requete);
	            // Fermer le statement
	            unStat.close();
	            // Déconnexion de la base de données
	            uneConnexion.seDeConnecter();

	        } catch (SQLException exp) {
	            // Afficher l'erreur si la requête échoue
	            System.out.println("Erreur d'exécution : " + requete);
	            exp.printStackTrace();
	        }
	    }
	 
	 public static User verifyUser(String email, String password) {
		    User user = null;
		    String requete = "SELECT * FROM user WHERE email = '" + email + "' AND mdp = '" + password + "';";
		    try {
		        uneConnexion.seConnecter();
		        Statement unStat = uneConnexion.getMaConnexion().createStatement();
		        ResultSet resultat = unStat.executeQuery(requete);
		        if (resultat.next()) {
		            user = new User(
		                resultat.getInt("id_user"),
		                resultat.getString("nom"),
		                resultat.getString("prenom"),
		                resultat.getString("email"),
		                resultat.getString("mdp"),
		                resultat.getDate("date_de_naissance"),
		                resultat.getString("adresse"),
		                resultat.getString("telephone")
		            );
		        }
		        resultat.close();
		        unStat.close();
		        uneConnexion.seDeConnecter();
		    } catch (SQLException exp) {
		        exp.printStackTrace();
		    }
		    return user;
		}

}



