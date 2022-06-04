package application_onw;
import java.util.Scanner;

public class tabtravailleur{
	public travialleur[] tableau;
	public static Scanner sc=new Scanner(System.in);

	public tabtravailleur(travialleur[] tab) {
		this.tableau = tab;
	}	
public tabtravailleur() {
	this.tableau = new travialleur[1000];
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
		String nom,prenom,sex,identifiant,numero,ch,adresse,motdepasse;
		double salaire;
		String debuit_travaille,finis_travaille;
		{
		
		System.out.println("Saisie des informations d'un travailleur");
do
{
System.out.println("Saisir le nom du travailleur");
nom = sc.next();
} while(nom.length()>30);
do
{
System.out.println("Saisir le prenom du travailleur");
prenom = sc.next();
} while(prenom.length()>30);
do
{
System.out.println("Saisir la adresse du travailleur");
adresse = sc.next();
} while(adresse.length()>30);
do
{
System.out.println("Saisir la motdepasse du travailleur");
motdepasse = sc.next();
} while(motdepasse.length()>30);
do
{
System.out.println("Saisir le sexe du travailleur: Mr/Mme");
ch= sc.next();
ch.toUpperCase();
} while((ch.compareTo("MR")!=0) &&
(ch.compareTo("MME")!=0));
sex=ch;}
do {
	System.out.println(" saisir le numero :");
	numero=sc.next();
}while(numero.length()!=8);
do {
	System.out.println(" saisir l'identifiant :");
	identifiant=sc.next();
}while(identifiant.length()>30);

System.out.println(" saisir le salaire :");
salaire=sc.nextDouble();
System.out.println(" saisir le debuit_travaille :");
debuit_travaille = sc.next();
System.out.println(" saisir le finis_travaille :");
finis_travaille = sc.next();

int length=this.length_tableau();
System.out.println("length tableau avant insertion : " + length);
this.tableau[length]= new travialleur( nom, prenom,adresse, identifiant,motdepasse, numero,sex,salaire,debuit_travaille,finis_travaille);	
System.out.println("length tableau apres insertion : " + this.length_tableau());
System.out.println("Success insertion de travailleur ! id = " + identifiant);
	}
	public void afficherpersonne(String id ) {
		int idx=Rechcercherpersonne(id);
		if (idx>=0) {
			System.out.println(this.tableau[idx].getNom()+this.tableau[idx].getPrenom()+this.tableau[idx].getNumero()+this.tableau[idx].getAdresse());
		}
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
public void modifierelement(String id){
	 int idx=Rechcercherpersonne(id);
	 if (idx>=0) {
		 System.out.println("quelle element voullez vous modifier : 1.nom, 2.prenom,3.adresse, 4.identifiant,5.motdepasse, 6.numero,7.sex ");
 int op=sc.nextInt();
 switch(op) {
 case(1):
	 System.out.println("voullez saisir nouveau nom : ");
 	 String nom;
 	 nom=sc.next(); 
	 this.tableau[idx].setNom(nom);
 case(2):
	 System.out.println("voullez saisir nouveau prenom : ");
 	 String prenom;
 	 prenom=sc.next(); 
	 this.tableau[idx].setPrenom(prenom); 
 
 case(3):
	 System.out.println("voullez saisir nouveau adress: ");
 	 String adress ;
 	adress=sc.next(); 
	 this.tableau[idx].setAdresse(adress);
 case(4):
	 System.out.println("voullez saisir motdepasse : ");
 	 String motdepasse ;
 	 motdepasse=sc.next(); 
	 this.tableau[idx].setMotdepasse(motdepasse);
 case(5):
	 System.out.println("voullez saisir numero : ");
			 	 String numero ;
			 	 numero=sc.next(); 
				 this.tableau[idx].setNumero(numero);
			 }
System.out.println("Un travailleur est modifie avec succes!");
this.afficherpersonne(id);
		 }	
	 else {
		 System.out.println("Identifiant de client invalid !");
	 }
		 }
		

			
}
