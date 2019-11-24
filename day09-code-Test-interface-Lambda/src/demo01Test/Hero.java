package demo01Test;

public class Hero {

	private String name;
	private int attack;
	private String type;

	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hero(String name, int attack, String type) {
		super();
		this.name = name;
		this.attack = attack;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", attack=" + attack + ", type=" + type + "]";
	}

}
