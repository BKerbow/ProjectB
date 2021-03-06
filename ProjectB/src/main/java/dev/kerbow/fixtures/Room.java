package dev.kerbow.fixtures;

import java.util.HashMap;
import java.util.Map;

public class Room extends Fixtures {

	private Room[] exits = new Room[10];
	private Map<String, Fixtures> fixtures = new HashMap<String, Fixtures>();
	private boolean hasFixtures = false;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public void initExits(Room north, Room south, Room west, Room east,
			Room northwest, Room southwest, Room northeast, Room southeast,
			Room up, Room down) {
		this.exits[0] = north;
		this.exits[1] = south;
		this.exits[2] = west;
		this.exits[3] = east;
		this.exits[4] = northwest;
		this.exits[5] = southwest;
		this.exits[6] = northeast;
		this.exits[7] = southeast;
		this.exits[8] = up;
		this.exits[9] = down;
	}


	public Room[] getExits() {
		return this.exits;

	}

	public Room getExit(String direction) {
		switch(direction.toLowerCase()) {
		case "north": return this.exits[0];
		case "south": return this.exits[1];
		case "west": return this.exits[2];
		case "east": return this.exits[3];
		case "northwest": return this.exits[4];
		case "southwest": return this.exits[5];
		case "northeast": return this.exits[6];
		case "southeast": return this.exits[7];
		case "up": return this.exits[8];
		case "down": return this.exits[9];
		default: return null;
		}	
	}
	
	public void addFixture(String fixtureName, Fixtures fixture) {
		this.fixtures.put(fixtureName.toLowerCase(), fixture);
		this.hasFixtures = true;
	}
	
	public Fixtures getFixture(String fixtureName) {
		return this.fixtures.get(fixtureName);
	}
	
	public boolean hasFixtures() {
		return this.hasFixtures;
	}
}
