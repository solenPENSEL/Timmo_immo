import java.awt.Color;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;



/**
 *
 * @author solen
 */
public class Main {
    public static void main(String args[]){
    	
    
        //Agence timmo= new Agence("timmo");
    	Agence timmo= Agence.getInstance();
    	
        Client a= new Client("8 boulevard auguste R","PENSEL","Solen",1234567891);
        Client c= new Client("8 boulevard auguste R","PENSEL","Solen",1234567891);
        Client b= new Client("9 boulevard auguste R","PENSOL","Solan",1234567891);
        
        Maison m= new Maison(a,"adresse","nord",55, "chauffage",2,3);
        Maison m2= new Maison(a,"adresse","sud",55, "chauffage",3,3);
        Appartement ap= new Appartement(b,"adresse","nord",22,300,3,1);
        Terrain tbis= new Terrain(a,"nop","nord",55,30);
        Terrain t= new Terrain(a,"adresse","sud",55,30);
        
        Entreprise e= new Entreprise("blabla","tommy coiffure",06555,13345,"SARL");
        Date d= new Date();
        Rdv r= new Rdv(d,"rdv visite");
        r.addParticipant(a);
        
        MandatVente mv= new MandatVente(r,20000, d,d);
        MandatVente mv2= new MandatVente(r,10000, d,d);
        MandatVente mv3= new MandatVente(r,20000, d,d);
        
        timmo.ajouterMandaVenteBien(mv, t);
        timmo.ajouterMandaVenteBien(mv, tbis);
        timmo.ajouterMandaVenteBien(mv2, ap);
        timmo.ajouterMandaVenteBien(mv3, m);
        
        timmo.addClient(a);
        timmo.addClient(b);
        timmo.addClient(e);
        timmo.addBien(m);
        timmo.addBien(m2);
        timmo.addBien(ap);
        timmo.addBien(t);
        timmo.addBien(tbis);
        timmo.addRdv(r);
        
        a.formulerVoeux(0, "nord", 0, 20000, 55, "terrain");
        a.formulerVoeux(2, "nord", 3, 20000, 55, "maison");
        a.formulerVoeux(3, "nord", 1, 10000, 22, "appartement");
        
     /* System.out.println(timmo.getNom());
        System.out.println(timmo.listeClients());
        System.out.println(z.toString());
       
        System.out.println(timmo.listeClients());
        System.out.println(timmo.listeBiens());
        System.out.println(r);
        System.out.println(timmo.listeBiens());
        System.out.println(a.equals(b));
        System.out.println(timmo.rechercherClient("PENSEL"));
         
        System.out.println(timmo.listeBiens());
        System.out.println(m.getSpecifics());
        System.out.println(timmo.rechercherBien(m));
        System.out.println(mv);
         for(Bien bv: timmo.getBiens())
        	System.out.println(bv.getMandatVente());
           for(Voeu v: a.getListevoeux())
        	System.out.println(timmo.trouverBien(v));        	
        	
        
     */
      
        Scanner sc = new Scanner(System.in);
		String cmd;
		while (true) {
			System.out.println("Entrez une commande: add client, add bien,liste client,liste bien,add rdv,liste rdv,"
					+ "creer voeu,liste voeux,trouver bien");
			cmd = sc.nextLine();

			switch (cmd) {
			
			case "liste client":
				System.out.println(timmo.listeClients());
				break;
				
			case "liste bien":
				System.out.println(timmo.listeBiens());
				break;
			
			case "add client":
				System.out.println("entrez adresse");
				String ad =sc.nextLine();
				System.out.println("entrez nom");
				String n =sc.nextLine();
				System.out.println("entrez prenom");
				String p =sc.nextLine();
				System.out.println("entrez numero");
				int nu =sc.nextInt();
				sc.nextLine();
				timmo.addClient(new Client(ad, n, p, nu));
				break;
				
			case "add bien":
				System.out.println("maison,appartement ou terrain?");
				String bien =sc.nextLine();
					switch (bien) {
						case "appartement":
							System.out.println("entrez adresse");
							String adresse =sc.nextLine();
							System.out.println("entrez orientation: nord ,sud ,est ou ouest");
							String orientation =sc.nextLine();
							System.out.println("entrez surface");
							int surface =sc.nextInt();
							sc.nextLine();
							System.out.println("entrez charges mensuelles");
							int ch =sc.nextInt();
							sc.nextLine();
							System.out.println("entrez l'etage");
							int eta =sc.nextInt();
							sc.nextLine();
							System.out.println("entrez nombre de pieces");
							int pie =sc.nextInt();
							sc.nextLine();
							System.out.println(timmo.listeClients()+"\n selectionner le proprietaire par son nom:");
							String client =sc.nextLine();
							Client cl =timmo.getClientByNom(client);
							timmo.addBien(new Appartement( cl, adresse,  orientation,  surface, ch, eta, pie));
							break;
						
						case "maison":
							System.out.println("entrez adresse");
							adresse =sc.nextLine();
							System.out.println("entrez orientation: nord ,sud ,est ou ouest");
							orientation =sc.nextLine();
							System.out.println("entrez surface");
							surface =sc.nextInt();
							sc.nextLine();
							System.out.println("entrez moyen de chauffage");
							String chauff =sc.nextLine();
							System.out.println("entrez le nombre d'etages");
							 eta =sc.nextInt();
							sc.nextLine();
							System.out.println("entrez nombre de pieces");
							pie =sc.nextInt();
							sc.nextLine();
							System.out.println(timmo.listeClients()+"\n selectionner le proprietaire par son nom:");
							client =sc.nextLine();
							cl =timmo.getClientByNom(client);
							
							timmo.addBien(new Maison( cl, adresse,  orientation,  surface,  chauff, eta, pie));
							break;
						
						case "terrain":
							System.out.println("entrez adresse");
							 adresse =sc.nextLine();
							System.out.println("entrez orientation: nord ,sud ,est ou ouest");
							 orientation =sc.nextLine();
							System.out.println("entrez surface");
							 surface =sc.nextInt();
							sc.nextLine();
							System.out.println("entrez façade");
							int fa =sc.nextInt();
							sc.nextLine();
							System.out.println(timmo.listeClients()+"\n selectionner le proprietaire par son nom:");
							 client =sc.nextLine();
							 cl =timmo.getClientByNom(client);
							timmo.addBien(new Terrain( cl, adresse,  orientation,  surface, fa));
							break;
					}
				break;
			
			case "add rdv":
				System.out.println("entrez motif");
				ad =sc.nextLine();
				System.out.println("date du rdv mise a aujourd'hui car non implanté das l'IHM");
			    //System.out.print("Enter date: ");
				//String str = sc.nextLine();
				/*SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			      try {
			         Date date = sdf.parse(str); 
			         System.out.println(date);
			        
			      } catch (ParseException e2) { 
			         System.out.println("Parse Exception");
			      }*/
				System.out.println(timmo.listeClients()+"\n selectionner la personne concernee par son nom:");
				String client =sc.nextLine();
				Client cl =timmo.getClientByNom(client);
				Rdv rd = new Rdv(new Date(),ad);
				rd.addParticipant(cl);
				timmo.addRdv(rd);
				
				break;	
			
			case "liste rdv":
				System.out.println(timmo.listeRdv());
				
			break;
			
			
			case "creer voeu":
				System.out.println("entrez type bien: maison, terrain ou appartement");
				String type_bien =sc.nextLine();
				System.out.println("entrez orientation: nord ,sud ,est ou ouest");
				String orientation =sc.nextLine();
				System.out.println("entrez surface");
				int surface =sc.nextInt();
				sc.nextLine();
				System.out.println("entrez moyen de chauffage");
				String chauff =sc.nextLine();
				System.out.println("entrez le nombre d'etages");
				 int eta =sc.nextInt();
				sc.nextLine();
				System.out.println("entrez nombre de pieces");
				int pie =sc.nextInt();
				sc.nextLine();
				System.out.println("entrez prix souhaite");
				int prix =sc.nextInt();
				sc.nextLine();
				System.out.println(timmo.listeClients()+"\n selectionner le proprietaire du voeu");
				client =sc.nextLine();
				cl =timmo.getClientByNom(client);
				cl.formulerVoeux(eta,  orientation,  pie,  prix,  surface,  type_bien);
			break;
				
			case "liste voeux":
				System.out.println(timmo.listeClients()+"\n selectionner un client");
				client =sc.nextLine();
				cl =timmo.getClientByNom(client);
				System.out.println(cl.listeVoeux());
			break;
			
			case "trouver bien":
				System.out.println(timmo.listeClients()+"\n selectionner un client");
				client =sc.nextLine();
				cl =timmo.getClientByNom(client);
				System.out.println("voici les biens correspondants aux voeux de ce client");
				for(Voeu v: cl.getListevoeux())
		        	System.out.println(timmo.trouverBien(v)); 
			break;
			
			
			
			
			}
			
			
			
		
			
		
        
		}
        
    }
            
    
}
