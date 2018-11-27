package characters;

//Character is a super class for the player & enemies
public class Character {
	
	private int health;
	private int attack;
	
	//constructor for objects of class enemy
	public Character() {
		health = 10;
		attack = 5;
	}
	
	// get the health value
	public int getHealth() {
		return health;
	}
	
	// get the attack value
	public int getAttack() {
		return attack;
	}
}
