
public class Voeu {
	private int etage;
	private String orientation;
	private int nb_piece;
	private int prix;
	private int surface;
	private String type_bien;
	private Client acheteur;
	
	
	public Voeu(Client ac ,int etage, String orientation, int nb_piece, int prix, int surface, String type_bien) {
		super();
		this.etage = etage;
		this.orientation = orientation;
		this.nb_piece = nb_piece;
		this.prix = prix;
		this.surface = surface;
		this.type_bien = type_bien;
		this.acheteur=ac;
	}


	public int getEtage() {
		return etage;
	}


	public String getOrientation() {
		return orientation;
	}


	public int getNb_piece() {
		return nb_piece;
	}


	public int getPrix() {
		return prix;
	}


	public int getSurface() {
		return surface;
	}


	public String getType_bien() {
		return type_bien;
	}


	public Client getAcheteur() {
		return acheteur;
	}


	@Override
	public String toString() {
		return "Voeu [etage=" + etage + ", orientation=" + orientation + ", nb_piece=" + nb_piece + ", prix=" + prix
				+ ", surface=" + surface + ", type_bien=" + type_bien + ", acheteur=" + acheteur + "]";
	}
	
	
	
	
	
	
	
	

}
