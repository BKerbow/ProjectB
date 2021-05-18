package dev.kerbow.game;

import dev.kerbow.fixtures.Room;

public class RoomManager {

	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		Room foyer = new Room(
				"The Foyer",
				"a large foyer",
				"You find yourself inside the foyer off a large mansion in the Arklay Mountains. You, your fellow S.T.A.R.S." + "\n"
				+ " members Barry Burton and captain Albert Wesker are with you. You were chased into this mansion by what" + "\n" 
				+ " could only be described as 'ravenous zombie dogs.' The entire thing sounds ridiculous, but after seeing" + "\n"
				+ " the bodies of your fellow S.T.A.R.S members Kevin Dooley and Joseph Frost, well... whatever fantasy you" + "\n" 
				+ " imagined before has well and truly become a nightmare. Something tells you this mansion holds the" + "\n" 
				+ " secrets that could unlock the terrifying events behind their deaths... and there are only three S.T.A.R.S." + "\n"
				+ " members left to seek them. Take care, Jill Valentine!" + "\n "
				+ "Within the foyer, you see four doors: One double door on your left and right, and one single door on either" + "\n"
				+ " side. In front of you are stairs that lead to the second level. Captain Wesker has gone through the right" + "\n"
				+ " door, while Barry motions for you to follow him through the left door. Captain Wesker can take care of himself," + "\n"
				+ " so you should stick with Barry for now.");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
	}
}
