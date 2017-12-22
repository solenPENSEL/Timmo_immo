import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author solen
 */
public class Client {
    private String adresse;
    private String nom;
    private String prenom;
    private long numero_tel;
    private HashSet<Voeu> Listevoeux;
    
    public Client(String a,String n,String p,long nu){
        adresse=a;
        nom=n;
        prenom=p;
        numero_tel=nu;
        Listevoeux= new HashSet<Voeu>();
    }
    
    
    
    
    
    
    public HashSet<Voeu> getListevoeux() {
		return Listevoeux;
	}





	public String getAdresse() {
		return adresse;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public long getNumero_tel() {
		return numero_tel;
	}


	public String toString(){
        return nom +" "+ prenom+ ":"+numero_tel +"/"+ adresse;
    }
    
    public void formulerVoeux(int etage, String localisation, int nb_piece, int prix, int surface, String type_bien) {
    	Voeu v= new Voeu(this, etage,  localisation,  nb_piece,  prix,  surface, type_bien);
    	this.Listevoeux.add(v);
    }
    
    public boolean equals(Object o) {
    	Client c= (Client)o;
    	if(adresse==c.adresse&&nom==c.nom&&prenom==c.prenom&&numero_tel==c.numero_tel)
    		return true;
    	return false;
    }
    
    
    public String listeVoeux(){
    	String liste="";
        for(Voeu b: Listevoeux)
        	liste+=b.toString()+"\n";
        return liste;
    }
            
    
}
