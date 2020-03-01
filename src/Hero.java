import java.util.ArrayList;

public class Hero extends Personnage {
	public Hero(Integer pV, Integer attack) {
		super(pV, attack);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Objet> listObjets;

	public ArrayList<Objet> getListObjets() {
		return listObjets;
	}

	public void setListObjets(ArrayList<Objet> listObjets) {
		this.listObjets = listObjets;
	}
}
