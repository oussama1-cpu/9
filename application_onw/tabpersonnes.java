package application_onw;

import java.util.Scanner;

public class tabpersonnes  {
	public personne[] tableau;
	public static Scanner sc=new Scanner(System.in);


public tabpersonnes(personne[] tab) {
		this.tableau =tab;}
public tabpersonnes() {
	this.tableau = new personne[1000];
};

public int length_tableau() {
	int length = 0;
	for (int i=0;i<1000;i++) {
		if(this.tableau[i]!=null) {
			length++;
		}
	}
	return length;
	}


public void Saisir() {
	String nom,prenom,sexe,identifiant,numero,ch,adresse,motdepasse;
	{
	
	System.out.println("Saisir des informations d'un client");
	do
	{
	System.out.println("Saisir le nom du client");
	nom = sc.next();
	} while(nom.length()>30);
	do
	{
	System.out.println("Saisir le prenom du client");
	prenom = sc.next();
	} while(prenom.length()>30);
	do
	{
	System.out.println("Saisir la adresse du client");
	adresse = sc.next();
	} while(adresse.length()>30);
	do
	{
	System.out.println("Saisir la mot de passe du client");
	motdepasse = sc.next();
	} while(motdepasse.length()>30);
	do
	{
	System.out.println("Saisir le sexe du client: Mr/Mme");
	ch= sc.next();
	} while((ch.compareTo("Mr")!=0) &&
	(ch.compareTo("Mme")!=0));
	sexe=ch;}
	do {
		System.out.println("Saisir le numero :");
		numero=sc.next();
	}while(numero.length()!=8);
	do {
		System.out.println("Saisir l'identifiant :");
		identifiant=sc.next();
	}while(identifiant.length()>30);
	int length=this.length_tableau();
	System.out.println("length tableau avant insertion : " + length);
	this.tableau[length]= new personne( nom, prenom,adresse, identifiant,motdepasse, numero,sex);
	System.out.println("length tableau apres insertion : " + this.length_tableau());
	System.out.println("Success insertion de client ! id = " + identifiant);
	
	}
	
public int Rechcercherpersonne(String id)
{
int index=-1;
for(int i=0; i<this.length_tableau(); i++) {
if ( this.tableau[i].getIdentifiant().equals(id)){
index=i;
break; }
}
return index;
}
public void afficherpersonne(String id) {
	int idx=Rechcercherpersonne(id);
	if (idx>=0) {
		System.out.println(this.tableau[idx].getNom()+"\n"+this.tableau[idx].getPrenom()+"\n"+this.tableau[idx].getNumero()+"\n"+this.tableau[idx].getAdresse());
	}
	
	
}
public void modifierelement(String id){
	 int idx=Rechcercherpersonne(id);
	 if (idx>=0) {
		 System.out.println("Quel attribut voullez vous modifier : 1.nom, 2.prenom,3.adresse, 4.identifiant,5.motdepasse, 6.numero,7.sex ");
		 int op=sc.nextInt();
		 switch(op) {
		 case(1):
			 System.out.println("voullez saisir nouveau nom : ");
		 	 String nom;
		 	 nom=sc.next(); 
			 this.tableau[idx].setNom(nom);
			 break;
		 case(2):
			 System.out.println("voullez saisir nouveau prenom : ");
		 	 String prenom;
		 	 prenom=sc.next(); 
			 this.tableau[idx].setPrenom(prenom); 
			 break;
		 case(3):
			 System.out.println("voullez saisir nouvelle adresse: ");
		 	 String adress ;
		 	adress=sc.next(); 
			 this.tableau[idx].setAdresse(adress);
			 break;
		 case(4):
			 System.out.println("voullez saisir mot de passe : ");
		 	 String motdepasse ;
		 	 motdepasse=sc.next(); 
			 this.tableau[idx].setMotdepasse(motdepasse);
			 break;
		 case(5):
			 System.out.println("voullez saisir numero : ");
		 	 String numero ;
		 	 numero=sc.next(); 
			 this.tableau[idx].setNumero(numero);
			 break;
		 }
		System.out.println("Un Client est modifie avec succes!");
		this.afficherpersonne(id);
	 }
	 else {
		 System.out.println("Identifiant de client invalid !");
	 }
	 }
	
}


