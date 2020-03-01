import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private Hero pierre = new Hero(100, null);
	public static void main(String[] args) {
		//Introduction
		Scanner scanner = new Scanner(System.in);
		write("Bienvenue dans les aventures de la fontaine de Mnémosyne");
		write("Après des études poussés sur une roche léguée par son oncle, Pierre découvre l'existence d'une fontaine caché dans une grotte qui permetrai de se souvenir de tout. \r\n" + 
		"Mais pour acceder a cette fontaine il faut trois pierre pour ouvrir lacces, il n'en possede qu'une.\r\n" + 
		"Il décide de partir à la recherche des deux autres pierres pour pouvoir ensuite accéder à la fontaine magique.");
		
		//Initialisation des pièces
		ArrayList<Objet> listObjet = new ArrayList<>();
		ArrayList<String> listActionHero = new ArrayList<>();
		int pièce = 1;
		
		listActionHero.add("Aller au Sud (SUD)");
		listActionHero.add("Aller au Nord (NORD)");
		listActionHero.add("Aller a l'Est (EST)");
		listActionHero.add("Aller a l'Ouest (OUEST)");
		Pièce desert1 = new Pièce("Parachuter il est en plein milieu du désert, Il peut regarder dans chaque direction",listObjet,listActionHero);
		
		
		while(pièce != 99) {
			if(pièce==1) {
				write("\nLe désert :");
				write(desert1.getDescription());
				desert1.listerLesActionsPossible();
				while(pièce == 1) {
					String input = scanner.nextLine();
					if(input.equals("SUD") || input.equals("NORD") || input.equals("EST") || input.equals("OUEST")) {
						if(input.equals("OUEST")){
							pièce = 2;
						}else {
							write("Il n'y a rien dans cette direction");
						}
					}else {
						write("Je ne comprend pas l'action demander");
					}
				}
			}if(pièce==2) {
				System.out.println("                         _\r\n" + 
						"                        / |\r\n" + 
						"                       /  |`'.\r\n" + 
						"            .~~~\\--.../_  |_-~'\r\n" + 
						"           /_\\_.-       ~-._.--~`-.\r\n" + 
						"        .-`.      __..--~~`  _.-~._~-.\r\n" + 
						"       (   .   :~(__)    _.-~  :   ~-.~.\r\n" + 
						"   .-~` '-.__   ~-------~_|~=,;       ~\r\n" + 
						" _~_.`~~~~   ~~--~~~~~~\\  |.-`\r\n" + 
						"  ~                     \\_|");
			}
			
			pièce=99;
		}
				
		
		scanner.close();
		
	}
	public static void write(String texte) {
		System.out.println(texte);
	}
	
	
	public static void option(String texte, Hero hero) {
		if(texte=="Inventaire"){
			for(int i=0; i<hero.getListObjets().size(); i++) {
				write(hero.getListObjets().get(i).getNom());
			}
		}
	}
	
	public static void help() {
		write("Pour avoir une");
	}
}
