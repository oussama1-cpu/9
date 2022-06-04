package application_onw;

public class personne {
	
	private String nom;
	private String prenom;
	private String adresse;
	private String identifiant;
	private String motdepasse;
	private String numero;
	private String sexe;
	
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSex(String sexe) {
		this.sexe = sexe;
	}
	
	
	
	public personne(String nom, String prenom, String adresse, String identifiant, String motdepasse,String numero,String sex) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.identifiant = identifiant;
		this.motdepasse = motdepasse;
		this.numero = numero;
		this.sex = sexe;
	}

	public personne() {};

}



