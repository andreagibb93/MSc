package rooms;

import mainImplentation.Game;

//dice player, inherits from game class
public class DiceRoom extends Room implements Game {
	
	//constructor for dice class
	public DiceRoom() {
		super();
	}
	
	// randomly generated number for dice
	public int rollDice() {
		return rand.nextInt(6) + 1;
	}

}
