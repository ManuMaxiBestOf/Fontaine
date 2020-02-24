import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Game game = new Game();
		//game.start();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenue dans les aventures de la fontaine de Mnémosyne");
		System.out.println("Commencer l'aventure?");
		System.out.print("> ");
		String input = scanner.nextLine();
		Hero Pierre = new Hero(100,5);
		System.out.println(Pierre.getPV());
		
		scanner.close();
		
	}
}
