
public class Capitale {

	private String nom;
	private int nbHabitants;
	private int superficie;
	
	//CONSTRCUTEUR PAR DEFAUT 
	public Capitale(){
		
	}
	
	//CONSTRUCTEUR
	public Capitale(String unNom,int unNbHabitants,int uneSuperficie){
		this.nom=unNom;
		this.nbHabitants=unNbHabitants;
		this.superficie=uneSuperficie;
	}
	
	//NOM
	public String getNom(){
		
		return this.nom;
	}
	public void setNom(String unNom){
		this.nom = unNom;
	}
	
	//NBHABITANTS
	public int getNbHabitants(){
		return this.nbHabitants;
	}
	public void setNbHabitants(int unNbHabitants){
		this.nbHabitants=unNbHabitants;
	}
	
	//SUPERFICIE
	public int getSuperficie(){
		return this.superficie;
	}
	public void setSuperficie(int uneSuperficie){
		this.superficie=uneSuperficie;
	}
	
	//toString
	public String toString(){
		String capitale=" CAPITALE ";
		if(nom!=null){
			capitale+="Le nom de la capitale est " +nom;
		}
		if(nbHabitants!=0){
			capitale+="Le nombre d'habitant est de "+nbHabitants;
		
		}
		if(superficie!=0){
			capitale+="Sa superficie est de "+superficie;
		}
		return capitale;
	}
	
}
