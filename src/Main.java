import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private Hero pierre = new Hero(100, null);
	public static void main(String[] args) {
		//Introduction
		Scanner scanner = new Scanner(System.in);
		write("Bienvenue dans les aventures de la fontaine de Mn�mosyne");
		write("Apr�s des �tudes pouss�s sur une roche l�gu�e par son oncle, Pierre d�couvre l'existence d'une fontaine cach� dans une grotte qui permetrai de se souvenir de tout. \r\n" + 
		"Mais pour acceder a cette fontaine il faut trois pierre pour ouvrir lacces, il n'en possede qu'une.\r\n" + 
		"Il d�cide de partir � la recherche des deux autres pierres pour pouvoir ensuite acc�der � la fontaine magique.");
		
		//Initialisation des pi�ces
		ArrayList<Objet> listObjet = new ArrayList<>();
		ArrayList<String> listActionHero = new ArrayList<>();
		int pi�ce = 1;
		
		listActionHero.add("Aller au Sud (SUD)");
		listActionHero.add("Aller au Nord (NORD)");
		listActionHero.add("Aller a l'Est (EST)");
		listActionHero.add("Aller a l'Ouest (OUEST)");
		Pi�ce desert1 = new Pi�ce("Parachuter il est en plein milieu du d�sert, Il peut regarder dans chaque direction",listObjet,listActionHero);
		
		
		while(pi�ce != 99) {
			if(pi�ce==1) {
				write("\nLe d�sert :");
				write(desert1.getDescription());
				desert1.listerLesActionsPossible();
				while(pi�ce == 1) {
					String input = scanner.nextLine();
					if(input.equals("SUD") || input.equals("NORD") || input.equals("EST") || input.equals("OUEST")) {
						if(input.equals("OUEST")){
							pi�ce = 2;
						}else {
							write("Il n'y a rien dans cette direction");
						}
					}else {
						write("Je ne comprend pas l'action demander");
					}
				}
			}if(pi�ce==2) {
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
			
			pi�ce=99;
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
