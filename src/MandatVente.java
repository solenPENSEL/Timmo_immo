import java.util.Date;

public class MandatVente {
	private Rdv rdvMandat;
	private int prix;
	private Date date_dispo;
	private Date date_vente_souhaite;
	
	
	public MandatVente(Rdv rdvMandat, int prix, Date date_dispo, Date date_vente_souhaite) {
		this.rdvMandat = rdvMandat;
		this.prix = prix;
		this.date_dispo = date_dispo;
		this.date_vente_souhaite = date_vente_souhaite;
	}


	public int getPrix() {
		return prix;
	}


	public Date getDate_dispo() {
		return date_dispo;
	}


	public Date getDate_vente_souhaite() {
		return date_vente_souhaite;
	}


	@Override
	public String toString() {
		return "MandatVente [rdvMandat=" + rdvMandat + ", prix=" + prix + ", date_dispo=" + date_dispo
				+ ", date_vente_souhaite=" + date_vente_souhaite + "]";
	}
	
	
	
	
	
	

}
