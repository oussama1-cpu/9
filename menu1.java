package application_onw;

import java.util.Scanner;

public class menu1 {
	
	public static tabpersonnes tab1= new tabpersonnes();
	public static tabtravailleur tab2 = new tabtravailleur();
	public static produit mon_produit = new produit();
	public static stock mon_stock = new stock();
	
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {	
		
    System.out.println("*-----------------------------------------------------------------------------------------------------------*");
	System.out.println("*                                                                                                          *");
	System.out.println("*                                                                                                          *");
	System.out.println("*                                         BIENVENU                                                          * ");
	System.out.println("*                                                                                                           *");
	System.out.println("*-----------------------------------------------------------------------------------------------------------*");
	System.out.println("*          !!!!!!!!!!!!!!!!! Avez-vous un compte?  [1].oui [2].non !!!!!!!!!!!!!!!!!!!!!                      *");
	int choix=sc.nextInt();
	if (choix==1){
	boolean login_status=login();
	if(login_status) {
		menu();
	}
		
	}
		   
	else{
	    System.out.println("vouillez vous creer un  compte?? \\ tn 1.oui 2.non");
	int choix1;
	choix1=sc.nextInt();
	while (choix1 !=1 && choix1!=2){
	        choix1=sc.nextInt();
	    }
	    if (choix1==1){
	        createcompte();
	    }
	    else  {
	        System.out.println("merci pour la  visite ❤ ");

	        }
	}
	
	    }
	public static  boolean login() {
		String my_username="oussamamabrouk";
		String mypassword="00000";	
		int i=0;
		String adress,password;
	do {
		System.out.println("  votre  adress :");
		adress=sc.next();
		System.out.println(" votre mot de passe :");
		password=sc.next();
		i+=1;
	}while(!((i<3) && (adress.equals(my_username)) && (password.equals(mypassword))));
    if(adress.equals(my_username) && (password.equals(mypassword))){
       return true;
    }
    else {
    	return false;
    }
}
	    public  static void  createcompte(){
		String mdp,mdp1,mail;
	    	do {
	    	 System.out.println("entrer votre   mail");
		         mail=sc.next();
		        System.out.println("entrer le  mot de passe");
		         mdp=sc.next();
		        System.out.println("verifier le mot de passe");
		         mdp1=sc.next();
	     } while(!(mdp).equals(mdp1));
	    	
	     System.out.println("vouillez vous creer compte \n 1.oui 2.non");
	     String choix11=sc.next();
	     choix11.toUpperCase();
	     if (choix11=="oui") {
	        	createcompte();
	        }
	     else {
	        	login();
	        }
	    }
public static void menu() {	 
	int c1=0;
	int c2=0;
	int c3=0;
	do {
		System.out.println("-------------------------------------------------------\n");
		System.out.println("     **** LA SOCIETE A VOTRE SERVICE ****        \n");
		System.out.println("-------------------------------------------------------\n");
		System.out.println("[1]- GESTION ARTICLE                                   \n");
		System.out.println("[2]- GESTION PERSONNES                                    \n");
		System.out.println("[3]- GESTION STOCK                                   \n");
		System.out.println("Saisir votre choix [1] ou [2] ou [3]                   \n");
		c1 = sc.nextInt();
		if (c1==1) {
			do {
 
			    System.out.println("-------------------------------------------------------\n");
			    System.out.println("              SOUS-MENU 1:GESTION ARTICLE              \n");
			    System.out.println("-------------------------------------------------------\n");
			    System.out.println("[1]- Ajouter Un Nouvel Article                         \n");
			    System.out.println("[2]- Modifier  prix Article                                  \n");
			    System.out.println("[3]- Retour Au Menu Principal                          \n");
			    System.out.println("Saisir votre choix [1] ou [2] ou [3]  \n ");
			    c2= sc.nextInt();
			    switch(c2)
			    {
			    case 1:
					
					System.out.println("-------------------------------------------------------\n");
					System.out.println("     [1]- Ajouter Un Nouvel Article                    \n");
					System.out.println("-------------------------------------------------------\n");
					System.out.println("Saisir Designation de Produit \n");
					sc.next();
					String DP;
					DP=sc.next();
					System.out.println("Saisir Prix Achat \n");
					double Pa=sc.nextDouble();
					System.out.println("saisire prix de vente");
					double pv=sc.nextDouble();
					produit p=new produit(1,Pa,pv,0,DP);
					mon_produit = p;
					System.out.println("Un produit est ajouté avec succes :");
					p.Affiche();
					menu();
					break;
				case 2:
					System.out.println("-------------------------------------------------------\n");
					System.out.println ("                 [2]- Modifier prix Article                     \n");
					System.out.println ("-------------------------------------------------------\n");
					System.out.println(" MODIFIER PRIX ARTICLE 1.dimunier 2.augmanter  \n");
					int  ch22=sc.nextInt();
						if (ch22==1) {
						System.out.println("entre le valeur dimunier   le prix:");
						int pv1=sc.nextInt();
						mon_produit.diminuer(pv1);
						mon_produit.Affiche();
					}
						if (ch22==2) {
						System.out.println("entre le valeur augamnter   le prix:");
						int pv2=sc.nextInt();
						mon_produit.augmenter(pv2);
						mon_produit.Affiche();
					}
						menu();
					break;
				case 3:
					System.out.println("-------------------------------------------------------\n");
					System.out.println("                [3]- Retour Au Menu Principal          \n");
					System.out.println("-------------------------------------------------------\n");
					menu();
					break;	
			    }
			}while (c2!=1 && c2!=2 && c2!=3 );
			}
			


			
		 
			
		if(c1==2) {
			
		do {
				
				
			    System.out.println("-------------------------------------------------------\n");
			    System.out.println("              SOUS-MENU 1:GESTION PERSONNES           \n");
			    System.out.println("-------------------------------------------------------\n");
			    System.out.println("[1]- Ajouter Une Nouvelle PERSONNE                       \n");
			    System.out.println("[2]- Modifier PERSONNE                                \n");
				System.out.println("[3]- Afficher PERSONNE                             \n");
			    System.out.println("[4]- Retour Au Menu Principal                          \n");
			    System.out.println("Saisir votre choix [1] ou [2] ou [3] ou [4] \n ");
			    c2 = sc.nextInt();
			    switch(c2){
			    case 1:
					System.out.println("-------------------------------------------------------\n");
					System.out.println("                 [1]- Ajouter Une Nouvelle PERSONNE                  \n");
					System.out.println("-------------------------------------------------------\n");
					System.out.println("Saisir type de personne 'client' ou 'travailleur' \n");
					String tp;
					tp=sc.next();				
					if (tp.equals("client")){
						tab1.Saisir();
					}
					else if (tp.equals("travailleur")) {
						tab2.Saisir();
					}
					else {
						System.out.println("aucun choix valide :  \n"+tp);
						
					}
					menu();
					break;
				case 2:
					System.out.println("-------------------------------------------------------\n");
					System.out.println("                 [2]- Modifier PERSONNE                \n");
					System.out.println("-------------------------------------------------------\n");
					System.out.println("Saisir type de personne: client ou travailleur \n");
					String type1;
					type1=sc.next();
					if (type1.equals("client")){
						System.out.println("Saisir l'identifiant de client\n");
						String ref;
						ref=sc.next();
						tab1.modifierelement(ref);
					}
					else if (type1.equals("travailleur")) {
						System.out.println("Saisir l'identifiant de travailleur \n");
						String ref;
						ref=sc.next();
						tab2.modifierelement(ref);
					}
					
					menu();
					break;
			
				case 3:
					System.out.println("-------------------------------------------------------\n");
					System.out.println("                 [3]-  afficher PERSONNE                    \n");
					System.out.println("-------------------------------------------------------\n");
					System.out.println("Saisir le type de personne [1].client  [2].travailleur \n");
					int choix =sc.nextInt();
					if (choix==1) {
						String ref;
						System.out.println("Saisir l'identifiant de client a afficher :");
						ref=sc.next();
						tab1.afficherpersonne(ref);
					}
					else {
						String ref;
						System.out.println("Saisir l'identifiant de travailleur a afficher :");
						ref=sc.next();
						tab2.afficherpersonne(ref);
					}
					menu();
				case 4:
					System.out.println("-------------------------------------------------------\n");
					System.out.println("                [4]- Retour Au Menu Principal                      \n");
					System.out.println("-------------------------------------------------------\n");
					menu();
					break;

			    }
			}while (c2!=1 && c2!=2 && c2!=3 && c2!=4 );
		}
		
		
		
		
	}while (c1!=1 && c1!=2 && c1!=3);
	

	
if(c1==3) {
	
	do {
		
	    System.out.println("-------------------------------------------------------\n");
	    System.out.println("              SOUS-MENU 3:GESTION STOCK          \n");
	    System.out.println("-------------------------------------------------------\n");
	    System.out.println("[1]- Ajouter Un Nouvel produit dans le STOCK                         \n");
	    System.out.println("[2]- Quantite de  stock                               \n");
	    System.out.println("[3]- Supprimer produit dans STOCK                              \n");
	    System.out.println("[4]- Retour Au Menu Principal                          \n");
	    System.out.println("Saisir votre choix [1] ou [2] ou [3] ou [4]  \n ");
	    c2 = sc.nextInt();	    
	    switch(c2)
	    {
	    case 1:
			
			System.out.println("-------------------------------------------------------\n");
			System.out.println("                 [1]- Ajouter Un Nouvel produit dans le  STOCK           \n");
			System.out.println("-------------------------------------------------------\n");
			System.out.println("Saisir type de produit dans le stock :  \n");
			mon_stock.saisir();
			System.out.println("Un produit est ajouté avec succes :");
			menu();
			break;
		case 2:
			System.out.println("-------------------------------------------------------\n");
			System.out.println("                 [2]-Quantite de  stock            \n");
			System.out.println("-------------------------------------------------------\n");
			mon_stock.quantiteex();
			menu();
			break;
		case 3:
			System.out.println("-------------------------------------------------------\n");
			System.out.println("                 [3]-  Supprimer  un produit dans le  STOCK                     \n");
			System.out.println("-------------------------------------------------------\n");
			System.out.println("donner le reference de produit dans le  stock :");
			String ref;
			ref=sc.next();
			mon_stock.supprimer(ref);
			System.out.println("le produit et bien supprimer");
			menu();
		case 4:
			System.out.println("-------------------------------------------------------\n");
			System.out.println("                [4]- Retour Au Menu Principal                      \n");
			System.out.println("-------------------------------------------------------\n");
			menu();
			break;

	    }
	}while (c2!=1 && c2!=2 && c2!=3 && c2!=4 );
}
}
public static void afficheMenuPrincipal()
{
    int c1=0;
	do {
	    System.out.println("-------------------------------------------------------\n");
	    System.out.println("           MENU PRINCIPAL  GESTION COMMERCIALE         \n");
	    System.out.println("-------------------------------------------------------\n");
	    System.out.println("[1]- GESTION ARTICLE                                   \n");
		System.out.println("[2]- GESTION CLIENT                                    \n");
		System.out.println("[3]- GESTION STOCK                                  \n");
	    System.out.println("Saisir votre choix [1] ou [2] ou [3] \n ");
				    	    c1=sc.nextInt();
				          }while (c1!=1 && c1!=2 && c1!=3);
	}

}
