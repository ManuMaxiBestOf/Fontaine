import java.util.ArrayList;

public class Personnage {
	public Personnage(Integer pV, Integer attack) {
		super();
		PV = pV;
		Attack = attack;
	}
	public int getPV() {
		return PV;
	}
	public void setPV(int pV) {
		PV = pV;
	}
	public int getAttack() {
		return Attack;
	}
	public void setAttack(int attack) {
		Attack = attack;
	}
	public ArrayList<ActionPersonnage> getListAction() {
		return listAction;
	}
	public void setListAction(ArrayList<ActionPersonnage> listAction) {
		this.listAction = listAction;
	}
	private int PV;
	private int Attack;
	private ArrayList<ActionPersonnage> listAction;
}
