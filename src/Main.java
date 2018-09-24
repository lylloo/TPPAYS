import java.util.Scanner;
public class Main {
	private static Scanner clavier;
	
	public static void main(String[] args) {
		clavier = new Scanner (System.in);

		
		System.out.println("Entrer un nom");
		String nom = clavier.nextLine();
		
		System.out.println("Entrer une langue");
		String langue = clavier.nextLine();
		
		System.out.println("Entrer une monnaie");
		String monnaie = clavier.nextLine();
		
		/*System.out.println("Entrer une capitale");
		String capitale = clavier.nextLine();*/
		
		// POUR CAPITALE 
		System.out.println("Entrer le nom de la capitale");
		String nomCapitale = clavier.nextLine();
		System.out.println("Entrer le nombre habitants");
		int nbHabitants = clavier.nextInt();
		System.out.println("Entrer la supericie");
		int superficie = clavier.nextInt();
		//AFFICHE 0
		System.out.println("nombre de compte"+Pays.getCompteurPays());
		Pays monPays;
		monPays = new Pays(nom, langue,monnaie);
		
		
		/*Capitale laCapitale;
		laCapitale = new Capitale(nomCapitale,nbHabitants,superficie);*/
		
		
		monPays.getCapitale().getNom();
		monPays.getCapitale().getNbHabitants();
		monPays.getCapitale().getSuperficie();
		System.out.println(monPays.toString());
		
		//System.out.println(laCapitale.toString());
		//System.out.println(monPays.majuscule());
		//System.out.println(monPays.majusculePremier());
		//System.out.println("nombre de compte"+Pays.getCompteurPays());
		
		
	}

}
