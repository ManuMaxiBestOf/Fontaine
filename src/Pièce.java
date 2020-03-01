import java.util.ArrayList;

public class Pièce {
	private String description;
	private ArrayList<Objet> listObjet;
	private ArrayList<String> listActionHero;
	
	public Pièce(String description, ArrayList<Objet> listObjet, ArrayList<String> listActionHero) {
		this.description = description;
		this.listObjet = listObjet;
		this.listActionHero = listActionHero;
	}
	
	public void listerLesActionsPossible() {
		System.out.println("Actions possible:");
		for(String action:listActionHero) {
			System.out.println(action);
		}
	}

	public ArrayList<String> getListActionHero() {
		return listActionHero;
	}

	public void setListActionHero(ArrayList<String> listActionHero) {
		this.listActionHero = listActionHero;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Objet> getListObjet() {
		return listObjet;
	}

	public void setListObjet(ArrayList<Objet> listObjet) {
		this.listObjet = listObjet;
	}
	
	
}
