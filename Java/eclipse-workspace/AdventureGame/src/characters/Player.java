package characters;

import java.util.ArrayList;

//class player, inherits from Character class
public class Player extends Character {
	private ArrayList<String> items;

	//constructor for player class
	public Player() {
		super();
		items = new ArrayList<>();
	}
	
	// player movement
	public void move() {
		
	}
	
	// player attack the enemy
	public void attackEnemy(Enemy e) {
		
	}
	
	public ArrayList<String> getItems() {
		return items;
	}
	

}
