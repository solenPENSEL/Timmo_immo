

public class Maison extends Bien{
	private String moy_chauffage;
	private int nb_etages;
	private int nb_pieces;

	
	
	public Maison(Client cl,String adresse, String orientation, int surface, String chauff,int eta,int pie) {
		super(cl,adresse, orientation, surface);
		nb_etages=eta;
		nb_pieces=pie;
		moy_chauffage=chauff;
	}
	
	
	



	public String getMoy_chauffage() {
		return moy_chauffage;
	}






	public int getNb_etages() {
		return nb_etages;
	}






	public int getNb_pieces() {
		return nb_pieces;
	}






	@Override
	public String toString() {
		return "Bien n°"+ num_interne +" maison[ proprietaire="+ proprietaire+", adresse=" + adresse +  ", orientation=" + orientation
				+ ", surface=" + surface+ ", moy_chauffage=" + moy_chauffage + ", nb_etages=" + nb_etages + ", nb_pieces=" + nb_pieces + "]";
	}
	
	public String getSpecifics() {
		return "maison";
	}





	/*@Override
	public boolean equals(Object o) {
		Maison m= (Maison)o;
		if(m.proprietaire== proprietaire && m.adresse==m.adresse && m.num_interne==num_interne &&m.orientation==orientation
		&& m.surface==surface)
			return true;
		return false;
	}*/
	
	
	

}
