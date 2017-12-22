

public class Terrain extends Bien{
	private int facade;
	
	public Terrain(Client cl,String adresse, String orientation, int surface,int fa) {
		super(cl, adresse,  orientation, surface);
		facade=fa;
	}
	
	



	public int getFacade() {
		return facade;
	}





	@Override
	public String toString() {
		return "Bien n°"+ num_interne +" terrain[ proprietaire="+proprietaire+", adresse=" + adresse +  ", orientation=" + orientation
				+ ", surface=" + surface+ ", façade=" + facade + "]";
	}
	
	public String getSpecifics() {
		return "terrain";
	}
	
	@Override
	public boolean equals(Object o) {//modifi
		Maison m= (Maison)o;
		if(m.proprietaire== proprietaire && m.adresse==m.adresse && m.num_interne==num_interne &&m.orientation==orientation
		&& m.surface==surface)
			return true;
		return false;
	}

}
