package rooms;

import mainImplentation.Game;

public class RockPaperScissorsRoom extends Room implements Game {
	private String[] results = {"Rock", "Paper", "Scissors"};
	
	public String getRPS() {
		return results[rand.nextInt(results.length)];
	}
}
