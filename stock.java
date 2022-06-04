package application_onw;

import java.util.Scanner;



public class stock {
	
	private String refPdt;
	private double quantiteinit;
	private double quantitefinal;
	private String  lieustock;
	private String  nomstock;
	
	//private type typeproduit;
	private String [] Tabproduit= new String[1000];

	
	public String getNomstock() {
		return nomstock;
	}
	public void setNomstock(String nomstock) {
		this.nomstock = nomstock;
	}
	
	
	public String getRefPdt() {
		return refPdt;
	}
	public void setRefPdt(String refPdt) {
		this.refPdt = refPdt;
	}
	public double getQuantiteinit() {
		return quantiteinit;
	}
	public void setQuantiteinit(double quantiteinit) {
		this.quantiteinit = quantiteinit;
	}
	public double getQuantitefinal() {
		return quantitefinal;
	}
	public void setQuantitefinal(double quantitefinal) {
		this.quantitefinal = quantitefinal;
	}
	public String getLieustock() {
		return lieustock;
	}
	public void setLieustock(String lieustock) {
		this.lieustock = lieustock;
	}
	
	public stock() {};
	public void  saisir() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisie des informations d'un produit ");
		do
		{
		System.out.println("Saisir le RREFERENCE : ");
		this.refPdt = sc.nextLine();
		} while(refPdt.length()>30);
		do
		{
		System.out.println("Saisir le quantitinitaial");
		this.quantiteinit = sc.nextInt();
		} while(quantiteinit<0);
		do
		{
		System.out.println("Saisir le quantitefinal :");
		this.quantitefinal= sc.nextInt();
		} while(quantitefinal<0);
		 
		do{
			System.out.println("Saisir le lieu de stock  ");
			this.lieustock=sc.next();
		}while (lieustock.length()<0);
		
	}
		
		 public boolean rechercher(String ref) {
			 
			 boolean trouve=false;
			 for(int i=0;i<1000;i++)
			 {
			 if(this.Tabproduit[i]==ref &&
			 this.Tabproduit[i]!=null)
			 {
			 trouve=true;
			 break;}
			 }
			 return trouve;
			 } 
		public boolean supprimer(String ref)
		{
		boolean vide=false;
		if (this.rechercher(ref))
		{
		for(int i=0; i<Tabproduit.length; i++)
		{
		if (Tabproduit[i]!=null &&
		Tabproduit[i]==ref)
		{Tabproduit[i]=null;
		vide=true;
		break; }
		}
		}
		return vide;
		}
		public void quantiteex() {
			this.quantitefinal=(this.quantiteinit-this.quantitefinal);
			
		
	

	
	
		
	}
	
}
