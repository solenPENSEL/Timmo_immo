import java.util.ArrayList;
import java.util.Date;

public class Rdv {
	private Date dateRdv;
	private String motif;
	private ArrayList<Client> participants;
	
	
	public Rdv(Date dateRdv, String motif) {
		this.dateRdv = dateRdv;
		this.motif = motif;
		this.participants= new ArrayList<Client>();
	}

	public void addParticipant(Client c) {
		participants.add(c);
	}

	@Override
	public String toString() {
		return "Rdv [dateRdv=" + dateRdv + ", motif=" + motif + ", participants=" + participants + "]";
	}
	
	
	
	
	

}
