import java.util.ArrayList;

public class Personnage {
	public Personnage(Integer pV, Integer attack) {
		this.PV = pV;
		this.Attack = attack;
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
	public Pi�ce getPi�ceCourante() {
		return pi�ceCourante;
	}
	public void setPi�ceCourante(Pi�ce pi�ceCourante) {
		this.pi�ceCourante = pi�ceCourante;
	}
	private int PV;
	private int Attack;
	private Pi�ce pi�ceCourante;
	private ArrayList<ActionPersonnage> listAction;
}
