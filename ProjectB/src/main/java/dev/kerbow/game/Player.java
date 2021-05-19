package dev.kerbow.game;

import dev.kerbow.fixtures.Room;

public class Player {

	public Room currentroom;
	
	public Player() {
		
	}
	
	public Player(Room currentRoom) {
		this.currentroom = currentRoom;
	}
}
