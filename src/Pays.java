
/**
 * @author tjuin
 *
 */


public class Pays {

	private String nom;
	private String langue;
	private String monnaie;
	//private String capitale;
	private static int  compteurPays=0;
	//private Capitale saCapitale;
	
	//LIEN ENTRE LES DEUX CLASSE 
	private Capitale saCapitale;
	
 //CONSTRUCTEUR PAR DEFAUT
	public Pays(){
		compteurPays = compteurPays+1;
	}
	
	//CONSTRCUETUR
	/**
	 * 
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 * @param uneCapitale
	 */
	public Pays(String unNom,String uneLangue,String uneMonnaie){
		this.nom=unNom;
		this.langue=uneLangue;
		this.monnaie=uneMonnaie;
		//this.capitale=uneCapitale;
		compteurPays = compteurPays+1;
		saCapitale= new Capitale();
		//saCapitale=laCapitale;
	}
	
	//NOM
	public String getNom(){
		return this.nom;
	}
	public void setNom(String unNom){
		this.nom=unNom;
	}
	
	
	
	// TOUS LE NOM EN MAJUSCULE UPERCASE
	public String majuscule(){
		return nom.toUpperCase();
	}
	
	//PREMIERE LETTRE EN MAJUSCULE 
	public String majusculePremier(){
		int len = this.nom.length();
		String minuscule;
		char majuscule;
		majuscule =  nom.toUpperCase().charAt(0);
		minuscule =  nom.toLowerCase().substring(1, len);
		return majuscule + minuscule;
	}
	
	//COMPTEURS PAYS
	public static int getCompteurPays(){
		return compteurPays;
	}
	public void setCompteurPays(int unCompteurPays){
		this.compteurPays=unCompteurPays;
	}
	
	
	//CAPITALE
	public void setCapitale(Capitale uneCapitale){
		saCapitale=uneCapitale;
	}
	
	public Capitale getCapitale(){
		return saCapitale;
	}
	public String toString(){
		String pays="";
		if(this.nom!=null){
			pays+="le nom est"+this.nom;
		}
		if(this.langue!=null){
			pays+=" la langue est "+langue;
		}
		if(this.monnaie!=null){
			pays+= "la monnaie est "+monnaie;
		}
		/*if(this.capitale!=null){
			pays+=" La capitale est "+capitale;
		}*/
		pays+= this.saCapitale.toString();
		
		return pays;
	}
}
