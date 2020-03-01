import java.util.ArrayList;

public class Objet {
	private String nom;
	private ArrayList<ActionObjet> listAction;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<ActionObjet> getListAction() {
		return listAction;
	}
	public void setListAction(ArrayList<ActionObjet> listAction) {
		this.listAction = listAction;
	}
}
