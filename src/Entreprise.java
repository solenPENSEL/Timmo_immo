/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author solen
 */
public class Entreprise extends Client {
    private int siren;
    private String forme_juridique;
    
    public Entreprise(String a,String n,int nu,int si,String f){
        super(a,n,"",nu);
        siren=si;
        forme_juridique=f;
    }

	@Override
	public String toString() {
		return super.toString()+ ", siren=" + siren + "," + forme_juridique;
	}
        
    
}
