package controleur;

import java.util.Date;

public class User {
    private int idUser;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private Date dateDeNaissance;
    private String adresse;
    private String telephone;
    
    
	public User(int idUser, String nom, String prenom, String email, String mdp, Date dateDeNaissance, String adresse,
			String telephone) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	
	public User( String nom, String prenom, String email, String mdp, Date dateDeNaissance, String adresse,
			String telephone) {
		super();
		this.idUser = 0;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
    
    
}