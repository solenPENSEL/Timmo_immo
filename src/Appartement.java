

public class Appartement extends Bien {
	private int charges;
	private int nb_etages;
	private int nb_pieces;

	
	
	public Appartement(Client cl,String adresse, String orientation, int surface, int ch,int eta,int pie) {
		super(cl,adresse, orientation, surface);
		nb_etages=eta;
		nb_pieces=pie;
		charges=ch;
	}
	
	



	public int getCharges() {
		return charges;
	}





	public int getNb_etages() {
		return nb_etages;
	}





	public int getNb_pieces() {
		return nb_pieces;
	}





	@Override
	public String toString() {
		return "Bien n°"+ num_interne +" appartement[ proprietaire="+proprietaire+ ", adresse=" + adresse +  ", orientation=" + orientation
				+ ", surface=" + surface+ ", charges=" + charges + ", nb_etages=" + nb_etages + ", nb_pieces=" + nb_pieces + "]";
	}
	
	public String getSpecifics() {
		return "appartement";
	}
	
	@Override
	public boolean equals(Object o) {// modif
		Maison m= (Maison)o;
		if(m.proprietaire== proprietaire && m.adresse==m.adresse && m.num_interne==num_interne &&m.orientation==orientation
		&& m.surface==surface)
			return true;
		return false;
	}



	

}
