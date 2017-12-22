
/**
 *
 * @author solen
 */
public abstract class Bien { //ajouter prix
	private static int numero=1;
	
	protected Client proprietaire;
    protected String adresse;
    protected int num_interne;
    protected String orientation;
    protected int surface;
    protected MandatVente mandat;
	
    public Bien(Client prop,String adresse, String orientation, int surface) {
    	proprietaire=prop;
		this.adresse = adresse;
		this.orientation = orientation;
		this.surface = surface;
		num_interne=numero;
		numero++;
	}


	public Client getProprietaire() {
		return proprietaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getNum_interne() {
		return num_interne;
	}

	public String getOrientation() {
		return orientation;
	}

	public int getSurface() {
		return surface;
	}
	public MandatVente getMandatVente() {
		return mandat;
	}
    
    
    
    public abstract String getSpecifics();
    
    public void addMandat(MandatVente m) {
    	mandat=m;
    }

    
    
}
