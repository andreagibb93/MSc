package mainImplentation;

import java.util.Random;

import rooms.EmptyRoom;
import rooms.EnemyRoom;
import rooms.Room;

public class Main {

	public static void main(String[] args) {
		Room[][] map = new Room[5][5];
		
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				map[x][y] = new EmptyRoom();
			}
		}
		
		Random rand = new Random();
		
		map[rand.nextInt(5)][rand.nextInt(5)] = new EnemyRoom();
		
		
	}
}
