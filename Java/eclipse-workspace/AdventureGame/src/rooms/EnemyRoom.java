package rooms;

import characters.Enemy;

public class EnemyRoom extends Room {
	private Enemy enemy;
	
	public EnemyRoom() {
		enemy = new Enemy();
	}
}
