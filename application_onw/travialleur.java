package application_onw;


public class travialleur extends personne {
	private double salaire;
	private String debuit_travaille;
	private String finis_travaille;
	
	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	

	public String getDebuit_travaille() {
		return debuit_travaille;
	}


	public void setDebuit_travaille(String debuit_travaille) {
		this.debuit_travaille = debuit_travaille;
	}


	public String getFinis_travaille() {
		return finis_travaille;
	}


	public void setFinis_travaille(String finis_travaille) {
		this.finis_travaille = finis_travaille;
	}


		
	public travialleur(String nom, String prenom, String adresse, String identifiant, String motdepasse, String numero,
			String sex,double salaire ,String debuit_travaille ,String finis_travaille  ) {
		super(nom, prenom, adresse, identifiant, motdepasse, numero, sex );
		this.salaire=salaire;
		this.debuit_travaille=debuit_travaille;
		this.finis_travaille=finis_travaille;
		
	}
	public travialleur() {};


	public  void  prime(double p) {
		this.salaire+=p;
	}
	}
	
	
	
	




