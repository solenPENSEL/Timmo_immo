/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author solen
 */
public class Agence {
	
	private String nom;
    private HashSet<Client> clients;
    private HashSet<Rdv> rdv;
    private HashSet<Bien> biens;
	
	 /** Constructeur privé */
    private Agence()
    {
    	 clients= new HashSet<Client>();
         rdv= new HashSet<Rdv>();
         biens= new HashSet<Bien>();
         nom="timmo";
    }
     
    /** Instance unique non préinitialisée */
    private static Agence INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static Agence getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Agence(); 
        }
        return INSTANCE;
    }
	
    
    
   /* public Agence(String n){
        nom=n;
        clients= new HashSet<Client>();
        rdv= new HashSet<Rdv>();
        biens= new HashSet<Bien>();
    }*/
    
    public String getNom(){
        return nom;
    }
    
    
    
    public HashSet<Client> getClients() {
		return clients;
	}
	public HashSet<Bien> getBiens() {
		return biens;
	}
	
	public HashSet<Rdv> getRdv() {
		return rdv;
	}
	
	public String listeClients(){
       String liste="";
       for(Client c : clients)
           liste+=c.toString()+"\n";
       return liste;
    }
    
    public String listeRdv(){
    	String liste="";
        for(Rdv r: rdv)
        	liste+=r.toString()+"\n";
        return liste;
    }
    
    public String listeBiens(){
    	String liste="";
        for(Bien b: biens)
        	liste+=b.toString()+"\n";
        return liste;
    }
    
    
    
    public void addClient(Client c){
        clients.add(c);
    }
    
    public void addBien(Bien b){
        biens.add(b);
    }
    
    public void addRdv(Rdv r){
        rdv.add(r);
    }
    
    
    public Bien rechercherBien(Bien bi){
    	 for(Bien b: biens)
    		 if(bi.getSpecifics().equals(b.getSpecifics()) && bi.equals(b))
    				 return b;
    	 return null;
    	
    }
    
    public Client rechercherClient(String nom) {
    	for(Client c : clients)
    		if (c.getNom()==nom)
    			return c;
    	return null;
    }
    
    public Bien trouverBien(Voeu v) {
         
        	//Maison m;
            //Appartement p;
     
		for(Bien b: biens)
    		if(v.getType_bien()==b.getSpecifics() && v.getOrientation() ==b.getOrientation()
    		&&v.getSurface()==b.getSurface() &&b.getMandatVente()!=null && b.getMandatVente().getPrix()==v.getPrix()) {
    			
    			switch (v.getType_bien()) {
                case "terrain":  
                	return b;
                
                case "maison":
                	Maison m= (Maison) b;
                	if(v.getNb_piece()==m.getNb_pieces() && v.getEtage()==m.getNb_etages())
                		return b;
                case "appartement":
                	Appartement a= (Appartement)b;
                	if(v.getNb_piece()==a.getNb_pieces()) //&& v.getEtage()==a.getNb_etages())
    				return b;
    			}
    			
                    
    		}
    			
    			
    	return null;			
    			
    	
    }
    
    public void ajouterMandaVenteBien(MandatVente m,Bien b) {
    	//ajouter un manda au bien suite a un rdv
    	b.addMandat(m);
    	
    }
    
    public Client getClientByNom(String n) {
    	for(Client c : clients)
    		if (c.getNom().equals(n))
    			return c;
    	return null;
    }
    
    
    
    
}

