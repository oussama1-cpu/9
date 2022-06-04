package application_onw;

public class produit {
	private int refPdt;
	private double prixAchat;
	private double prixVente;
	private int stock;
	private String designation;

	public produit(int refPdt,double prixAchat,double prixVente,int stock, String designation )
	{
		this.refPdt=refPdt;
		this.prixAchat=prixAchat;
		this.prixVente=prixVente;
		this.stock=0;
		this.designation=designation;
		
	}
	public produit(double prixAchat,double prixVente,String designation) {
		this.prixAchat=prixAchat;
		this.prixVente=prixVente;
		this.designation=designation;
		
	}
	public produit() {};
	
	public void Affiche() 
	{
		System.out.println("Reference: "+this.refPdt+"\n Prix achat: "+this.prixAchat+"\n Prix vente:"+this.prixVente+"\n Stock:"+this.stock+"\n Designation: "+this.designation);
		
		
	}
	public int getrefPdt()
	{
		return this.refPdt;
		
		
	}
	public void setPrixAchat(double pa)
	{
		this.prixAchat=pa;
		
		
	}
	public void setPrixVente(double pv)
	{
		this.prixVente=pv;
		
		
	}
	public void setDesignation(String ds)
	{
		this.designation=ds;
		
		
	}
	public void augmenter(int qe)
	{
		this.prixVente=this.prixVente+qe;
		
	}
	public void diminuer(int qs)
	{
		this.prixVente=this.prixVente-qs;
		
	}
	
}
	





