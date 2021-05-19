package dev.kerbow.game;

import dev.kerbow.fixtures.Room;

public class RoomManager {

	Room startingRoom;
	Room[] rooms;
	//Room[] firstFloor;
	//Room[] secondFloor;
	
	public void init() {
		Room foyer1F = new Room(
				"The Foyer",
				"a large foyer",
				"You find yourself inside the foyer off a large mansion in the Arklay Mountains. You, your fellow S.T.A.R.S." + "\n"
				+ " members Barry Burton and captain Albert Wesker are with you. You were chased into this mansion by what" + "\n" 
				+ " could only be described as 'ravenous zombie dogs.' The entire thing sounds ridiculous, but after seeing" + "\n"
				+ " the bodies of your fellow S.T.A.R.S members Kevin Dooley and Joseph Frost, well... whatever fantasy you" + "\n" 
				+ " imagined before has well and truly become a nightmare. Something tells you this mansion holds the" + "\n" 
				+ " secrets that could unlock the terrifying events behind their deaths... and there are only three S.T.A.R.S." + "\n"
				+ " members left to seek them. The whereabouts of Chris Redfield, your partner, are unknown. Take care, Jill Valentine!");
		/* Exits: The South Exit is blocked! You can't leave that way, not with the zombie dogs out there!
		 *		  West: Beyond the West door is a large Dining Room.
		 *		  East: Beyond the East door is an Art Room.
		 *		  Up: In front of you are stairs that lead to the Second Floor.
		 *		  North: At the midpoint of the stairs is a door that leads North, outside the mansion.
		 *		  North East: Large Art Room: Requires Helmet Key
		 * Items: Barry gives you a Lockpick here, after returning from the Dining room.
		 *
		 */ 
		this.rooms[0] = foyer1F;
		this.startingRoom = foyer1F;
		
		Room diningRoom = new Room(
				"The Dining Room",
				"a large, formal dining room",
				"You and Barry enter the long dining room. It's certainly a strange scene: the table is set up completely, with half-eaten food"
				+ " still on the plates, yet no sign of anyone even sitting in the chairs to eat! At the end of the dining room, however, there is"
				+ " a roaring fireplace... and in front of it, a pool of blood! 'Blood...' Barry says, inspecting the small pool. 'Jill, see if"
				+ " you can find any other clues. I'll be examining this. Let's just hope it's not Chris's...");
		/*
		 * Exits: There is an exit to the North at the left end of the dining hall.
		 * Items: Ink Ribbon, Typewriter, Emblem, Blue Jewel (after pushing statue), Shield Key (needs gold emblem)
		 */
		this.rooms[1] = diningRoom;
		
		Room teaRoom = new Room(
				"The Tea Room",
				"a small room attached to a long hallway",
				"You come to a long hallway. On your left, there is a small room at the end of the hall. You can hear a strange noise " + "\n"
				+ "coming from there...");
		/*
		 * Exits: North, to the Northern Corridor
		 * 		  North East, to the Bar
		 * 		  Down: Tea Room B1
		 *        West: To the West Wing Outer Stairway
		 *        South: Back to the Dining Room
		 * Items: Kenneth's film, on the body of fellow S.T.A.R.S member Kenneth J. Sullivan
		 */
		this.rooms[2] = teaRoom;
		
		Room westWingOuterStairway = new Room(
				"The West Wing Outer Stairway",
				"a small hallway with stairs leading up at the end",
				"The West Wing Outer Stairway contains a short hallway that opens up to a small room." + "\n" +
				"A staircase at the end winds up to the second floor.");
		/*
		 * Exits: Up, to the second floor
		 * 		  East, to the Tea room
		 * Items: Green Herb ,Handgun Magazine 1x15
		 */
		this.rooms[3] = westWingOuterStairway;
		
		Room mirrorCorridor = new Room(
				"Mirror Corridor",
				"A corridor with mirrors on the walls",
				"This strange corridor is filled with mirrors... as well as two unwelcome surprises! Two zombies are here, but they aren't " + "\n" 
				+ "moving yet. Be careful!");
		/*
		 * Exits: Down: West Wing Outer Stairway
		 * 		  East: 'Death' Passage
		 * 		  South: West Wing Inner Stairway
		 * 		  South East: Dining Room 2F
		 * Items: Green Herb, Golden Arrow, Arrowhead ,Handgun Magazine 1x15
		 */
		this.rooms[4] = mirrorCorridor;
		
		Room diningHall2F = new Room(
				"Dining Hall Second Floor",
				"The Second Floor of the Dining Room",
				"You didn't notice it before, but it seemed that there was a second floor balcony in the dining room, inaccessable from " + "\n"
				+ " the room itself. Be careful: there's a zombie shuffling around here!");
		/*
		 * Exits: North: Mirror Corridor
		 * 		  North West: West Wing Inner Stairway
		 * 		  East: Main Hall 2nd Floor
		 * Items: Dagger,Statue that you can push
		 */
		this.rooms[5] = diningHall2F;
		
		Room foyer2F = new Room(
				"Foyer Second Floor",
				"The Second Floor of the Main Hall",
				"This is the second floor of the foyer, which is home to a series of balconies overlooking the foyer's first floor.");
		/*
		 * Exits: West: Dining Room Second Floor
		 * 		  South West: Outside Balcony
		 * 		  South East: Outside Patio
		 * 		  North East: 'C' shaped Corridor
		 * 		  North: Halfway down the stairs to the Graveyard
		 * 		  Down: Foyer First Floor
		 * Items: None
		 */
		this.rooms[6] = foyer2F;
		
		Room graveyard = new Room(
				"The Graveyard",
				"A creepy graveyard behind the mansion.",
				"Of all the things to find on the mansion's property, why is there a graveyard!? In the middle is a long corridor that " + "\n"
				+ " leads to a large statue. Be careful, as there are two zombies shuffling around!");
		/*
		 * Exits: Down: only opens after putting in the green arrowhead
		 * 		  East: Large Gallery
		 * 		  South: Back to Foyer 1st Floor
		 * Items: Shotgun Shells 1x6
		 */
		this.rooms[7] = graveyard;
		
		Room crypt = new Room(
				"Crypt",
				"A creepy crypt behind the graveyard statue",
				"If that graveyard was creepy, this is even worse! It's like something straight out of a medeival catacomb: bones everywhere," + "\n"
				+ " sarcophagi, and what looks like a coffin dangling from the ceiling by four chains. On your left are four prominent skulls," + "\n" 
				+ " a closer inspection of which suggests that something should be placed on them. A mask, maybe?");
		/*
		 * Exits: Up, to the Graveyard
		 * Items: The Book of Curses
		 * 		  The Sword Key
		 * 		  Shotgun Shells 1x6, after putting the masks in place
		 * 		  Stone and Metal Object
		 */
		this.rooms[8] = crypt;
		
		Room artRoom = new Room(
				"Art Room",
				"A room with various paintings",
				"A small room where you can find numerous paintings mounted on the walls. In the middle of the room is a statue of a woman" + "\n" 
				+ " holding a vase. You can see something inside it, but it's too tall for you to grab. You can also hear a zombie shuffling around...");
		/*
		 * Exits: West: Foyer 1st Floor
		 * 		  East: Hidden Wardrobe
		 * 		  South East: 'L' Corridor
		 * Items: Map of the Mansion First Floor
		 *        Dagger
		 *        Shelf that you can push to access the map in the vase
		 */
		this.rooms[9] = artRoom;
		
		Room lCorridor = new Room(
				"'L' Corridor",
				"A large corridor in the shape of an 'L'",
				"A long corridor that winds behind around the East side of the mansion." + "\n"
				+ "You can hear the barking of two dogs behind the windows...");
		/* Exits: West: Art Room
		 * 		  North: Winding Corridor
		 * Items: Dagger, Handgun Magazine 1x15
		 */
		this.rooms[10] = lCorridor;
		
		Room windingCorridor = new Room(
				"Winding Corridor",
				"An oddly shaped Corridor",
				"Yet another oddly shaped corridor in the Mansion. Who designed this place, anyway?");
		/*
		 * Exits: North: Bathroom
		 * 		  South: 'L' Corridor
		 * 		  East: Outside Boiler
		 * 		  West: Dark Corridor
		 * 		  South East: Marble Room
		 */
		this.rooms[11] = windingCorridor;
		
		Room marbleRoom = new Room(
				"Marble Room",
				"A small, marble room",
				"A strange, small room. There is nothing here, but the walls and floors are made from marble.");
		/*
		 * Exits: South: Living Room
		 * 		  West: Winding Corridor
		 */
		this.rooms[12] = marbleRoom;
		
		Room livingRoom = new Room(
				"Living Room",
				"a small living room",
				"A comfortable living room, with sofas, coffe tables, and a roaring fireplace." + "\n"
				+ "This would be a good room to rest in for a while...");
		/*
		 * Exits: North: Marble Room
		 * Items: Dagger, Ink Ribbon x3, Shotgun
		 */
		this.rooms[13] = livingRoom;
		
		Room darkCorridor = new Room(
				"Dark Corridor",
				"A dimly lit corridor",
				"A short, dimly lit corridor. Most of the lights are broken, with only a couple flickering ones and a single window." + "\n"
				+ "You can hear the shuffling of a zombie nearby...");
		/*
		 * Exits: North East: East Wing Stairway
		 * 		  North: Courtyard Study
		 * 		  North West: Roofed Passage
		 * 		  South: Large Gallery
		 */
		this.rooms[14] = darkCorridor;
		
		Room eastWingStairway1F= new Room(
				"East Wing Stairway 1F",
				"a stairway in the east wing",
				"A small stairway that leads into a small storeroom. You can hear the shuffling of a zombie inside...");
		/*
		 * Exits: South: Dark Corridor
		 * 		  South East: East Wing Storeroom
		 * 		  Up: East Wing Stairway 2F
		 */
		this.rooms[14] = eastWingStairway1F;
		
		Room eastWingStoreroom = new Room(
				"East Wing Storeroom",
				"a small storeroom",
				"A small store room in the east wing of the mansion. You can rest easy here.");
		/*
		 * Exits: North: East Wing Stairway
		 * Items: Item Box, Typewriter, Fuel Canteen, Kerosene, First Aid Spray, Incendiary Shells left by Barry, 1x6
		 */
		this.rooms[15] = eastWingStoreroom;
		
		Room eastWingStairway2F = new Room(
				"East Wing Stairway 2F",
				"the second floor",
				"At the top of the stairway is a long hallway. You can hear the shuffling of two zombies...");
		/*
		 * Exits: West: Small Library
		 * 		  South: 'C' Corridor
		 * 		  South East: Deer Room
		 * 		  Far South East: Resting Room
		 */
		
		this.rooms[16] = eastWingStairway2F;
		
		Room cCorridor = new Room(
				"'C' Corridor",
				"a strangely shaped corridor",
				"A corridor shaped like a reverse capital C. You can hear the shuffling of two zombies...");
		/*
		 * Exits: North: East Wing Stairway 2F
		 * 		  North West: Small Library
		 * 		  South: Pillar Room
		 * 		  South West: Foyer 2F
		 * 		  West: Armor Room
		 * Items: Wooden Mount
		 */
		this.rooms[17] = cCorridor;
		
		Room smallLibrary = new Room(
				"Small Library",
				"a small library and study",
				"A small study filled with bookshelves, a few small coffe tables, and a desk.");
		/*
		 * Exits: South: 'C' Corridor
		 * 		  East: East Wing Stairway 2F
		 * Items: Dog Whistle, Handgun Magazine 1x15, Lighter, Botany book, Crumpled Memo
		 */
		this.rooms[18] = smallLibrary;
		
		Room restingRoom = new Room(
				"Resting Room",
				"small room with a fireplace",
				"A small room with a cozy fireplace and a couple chairs." + "\n"
				+ "Currently, there is no fire...");
		/*
		 * Exits: North: East Wing Stairway 2F
		 * 		  West: Sliding Trap Room
		 * Items: Green Herb
		 */
		this.rooms[19] = restingRoom;
		
		Room slidingTrapRoom = new Room(
				"Sliding Trap Room",
				"A room filled with marble",
				"The room is yet another strange one: marble floors, marble walls, and a statue that can be pushed into the hall." + "\n"
				+ "Something is very fishy about this...");
		/*
		 * Exits: East: Resting Room
		 * Items: Dagger
		 */
		
		this.rooms[20] = slidingTrapRoom;
		
		Room outsideBoiler = new Room(
				"Outside Boiler",
				"a small path outside",
				"A small, fenced pathway outside the mansion. There is a boiler alongside the wall of the mansion here." + "\n"
				+ "You can hear the barking of two zombie dogs here...");
		/*
		 * Exits: West: Winding Corridor
		 * Items: Herbicide, Green Herb x2, Red Herb, Kerosene
		 */
		
		this.rooms[21] = outsideBoiler;
		
		Room bathroom = new Room(
				"Bathroom",
				"a bathroom with bathtub",
				"A small, old fashioned bathroom, with a tub and a toilet. The tub is suspiciously full of murky water...");
		/*
		 * Exits: South: Winding Corridor
		 * Items: Dagger
		 */
		
		this.rooms[22] = bathroom;
		
		Room outsideBalcony = new Room(
				"Outside Balcony",
				"a balcony outside the mansion",
				"A balcony on the second floor of the mansion, overlooking the front. It winds around the mansion to the right." + "\n"
				+ "You can hear the barking of two zombie dogs, one of which possesses an item you need...");
		/*
		 * Exits: East: Main Hall 2F
		 * 		  North East: West Wing Inner Stairway
		 * Items: Collar, Coin, Imitation of a Key
		 */
		
		this.rooms[23] = outsideBalcony;
		
		Room teaRoomB1 = new Room(
				"Tea Room B1",
				"down the tea room stairs",
				"A small hallway down the east stairs. There is a door in front of you.");
		/*
		 * Exits: West: Kitchen
		 */
		
		this.rooms[24] = teaRoomB1;
		
		Room kitchen = new Room(
				"Kitchen",
				"a dirty kitchen",
				"A large, dirty kitchen, likely designed to feed the mansion's guests when the owners hosted them." + "\n"
				+ "You can hear the shuffling of a zombie inside...");
		/*
		 * Exits: South: Underground Passage 1
		 * 		  North East: Tea Room B1
		 * Items: Dagger
		 */
		
		this.rooms[25] = kitchen;
		
		Room uGPassage1 = new Room(
				"Underground Passage 1",
				"a concrete passage",
				"A mysterious passage you found hidden next to the kitchen. Where could it lead?" + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Exits: South: Winding Corridor
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		
		this.rooms[26] = uGPassage1;
		
		Room uGPassage2 = new Room(
				"Underground Passage 2",
				"another concrete passage",
				"A secondary passage connected to the first one. At the end, there is a hole in the celing!" + "\n"
				+ "You can't climb up it..." + "\n"
				+ "You can hear the scuttling of three giant spiders...");
		/*
		 * Exits: South: Winding Corridor
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		
		this.rooms[27] = uGPassage2;
		
		Room westWingInnerStairway2F = new Room(
				"West Wing Inner Stairway 2F",
				"a small hallway with a stairwayy",
				"This Hallway is located inside the mansion, linking several rooms together." + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Exits: North: Mirror Corridor
		 * 		  North West: Trophy Room
		 * 		  South: Dining Hall 2F
		 * 		  South West: Outside Balcony
		 * 		  Down: West Wing Inner Stairway 1F
		 */
		
		this.rooms[28] = westWingInnerStairway2F;
		
		Room westWingInnerStairway1F = new Room(
				"West Wing Inner Stairway 1F",
				"a hallway with two rooms",
				"At the bottom of the stairway, you come to an C shaped hallway with two rooms" + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Exits: North: Medical Storage Room
		 * 		  South: Around to the left and at the end of the hall: Small Storeroom
		 * 		  East: Northern Corridor
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		
		this.rooms[28] = westWingInnerStairway1F;
		
		Room medicalStorageRoom = new Room(
				"Medical Storage Room",
				"a room filled with medical supplies",
				"A room filled with medicines, serums, and salves of all kinds." + "\n"
				+ "You can rest easy in this room!");
		/*
		 * Exits: South: West Wing Inner Stairway 1F
		 * Items: Item Box, Typewriter, Body Disposal, Serum
		 */
		
		this.rooms[29] = medicalStorageRoom;
		
		Room smallStoreroom = new Room(
				"Small Storeroom",
				"a small storage room",
				"A small, stuffy storage room filled with seemingly random items.");
		/*
		 * Exits: North: West Wing Inner Stairway
		 * Items: Battery Pack, Broken Shotgun, Ink Ribbon x3, Kerosene
		 */
		
		this.rooms[30] = smallStoreroom;
		
		Room deathPassage = new Room(
				"Strange Passage",
				"a stone passageway",
				"The walls of this strange passageway are nearly entirely made of stone." + "\n"
				+ "To your right, there is a knight with a spiked shield in a small alcove." + "\n"
				+ "Further down, there is a small, slightly open room with a strange relief bearing a key." + "\n"
				+ "It seems highly suspicious... be careful if you touch it!");
		/*
		 * Exits: South West: Library 3rd Floor
		 * 		  North West: Mirror Corridor
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		
		this.rooms[31] = deathPassage;
		
		Room northernCorridor = new Room(
				"Northern Corridor",
				"a winding corridor",
				"A corridor linking several more rooms together. Whoever designed this mansion was surely crazy..." + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Exits: South: Tea Room
		 * 		  South West: Researcher's Bedroom
		 * 		  North West: West Wing Inner Stairway
		 * 		  North: Slightly South and to your left: Tiger Statue Room
		 * 		  West: At the top of the corridor, turn East, walk, and down to a door on your right: Greenhouse
		 * Items: Battery Pack
		 */
		
		this.rooms[32] = northernCorridor;
		
		Room researcherRoom = new Room(
				"Researcher's Room",
				"a small bedroom",
				"The small quarters of a researcher. Could he be the man dead on the floor?" + "\n"
				+ "You can hear a slight knocking noise coming from inside a wardrobe..." + "\n"
				+ "Frankly, you've seen enough zombies not to trust the corpse on the floor, either.");
		/*
		 * Exits: Northeast: Northern Corridor
		 * Items: Handgun Magazine 1x15, Keeper's Diary, Battery Pack
		 */
		
		this.rooms[33] = researcherRoom;
		
		Room tigerRoom = new Room(
				"Tiger Statue Room",
				"a small room",
				"A small room containing only the bust of a tiger head on a shelf jutting out from the wall." + "\n"
				+ "However, there's something fishy about it...");
		/*
		 * Exits: South: Northern Corridor
		 * Items: Shotgun Shells 1x6, MO Disk
		 */
		
		this.rooms[34] = tigerRoom;
		
		Room hiddenWardrobe = new Room(
				"Hidden Wardrobe",
				"a stuffy, hidden room",
				"A small, cleverly hidden wardrobe, filled with dusty formal clothing." + "\n"
				+ "You can rest easy here!");
		/*
		 * Exits: West: Art Room
		 */
		
		this.rooms[35] = hiddenWardrobe;
		
		Room outsidePatio = new Room(
				"Outside Patio",
				"a balcony with a patio",
				"A comfortable-looking outdoor patio winding around the front and east side of the mansion." + "\n"
				+ "Unfortunately for you, you can't rest easy here, as you've discovered a shocking and sad sight..." + "\n"
				+ "Here, you find the body of fellow S.T.A.R.S. officer Forest Spayer sitting in a chair." + "\n"
				+ "Next to him, laying against the chair, is a grenade launcher! Poor Forest won't be needing it anymore...");
		/*
		 * Exits: West: Main Hall 2F
		 * Items: Dagger, Grenade Launcher, Green Herb x2
		 */
		
		this.rooms[36] = outsidePatio;
		
		Room armorRoom = new Room(
				"Armor Room",
				"a room filled with suits of armor",
				"As you enter the room, four suits of armor suddenly slide forward!" + "\n"
				+ "If you push them back in the correct order, you may be able to free the trapped item...");
		/*
		 * Exits: East: 'C' Corridor
		 * Items: Jewelry Box, Death Mask Without Eyes, Nose, or Mouth
		 */
		
		this.rooms[37] = armorRoom;
		
		Room largeGallery = new Room(
				"Large Gallery",
				"a room with stained glass windows",
				"The stained glass windows here are illuminatef with colored light." + "\n" 
				+ "At the end of the passage is another window featuring a woman wearing specially colored items." + "\n" 
				+ "There is a puzzle to be solved here...");
		/*
		 * Exits: North: Dark Corridor
		 * 		  North East: Graveyard
		 * Items: Death Mask without a Mouth
		 */
		
		this.rooms[38] = largeGallery;
		
		Room deerRoom = new Room(
				"Deer Room",
				"a small room",
				"A small room featuring only a mounted deer's head on the wall." + "\n" 
				+ "You find it incredibly creepy...");
		/*
		 * Exits: North: East Wing Stairway 2F
		 * 		  East: Fish Tank Room
		 * 		  West: Bedroom
		 * Items: Red Herb
		 */
		
		this.rooms[39] = deerRoom;
		
		Room scientistRoom = new Room(
				"Scientist's Room",
				"a scientific-looking room",
				"A room filled with scientific equipment. It must belong to an eccentric scientist." + "\n"
				+ "Why else would there be an insect specimen display and a fishing lure display in the same room?" + "\n"
				+ "In fact, they both look rather suspicious...");
		/*
		 * Exits: West: Deer Room
		 * Items: Researcher's Will, Fish hook, Bee Specimen, Lure without a Hook, Wind Crest
		 */
		
		this.rooms[40] = scientistRoom;
		
		Room bedroom = new Room(
				"Bedroom",
				"a small bedroom",
				"Yet another small bedroom." + "\n" +
				"In this horrible mansion, it's a little odd to see something so normal..." + "\n"
				+ "You can rest easy here!");
		/*
		 * Exits: East: Deer Room
		 * Items: Fist Aid Box, First Aid Spray, Ink Ribbon x3, Green Herb
		 */
		
		this.rooms[41] = bedroom;
		
		Room pillarRoom = new Room(
				"Pillar Room",
				"a hallway with a pillar",
				"A sudden crash startles you! From the other end of the hallway, you find a hopeful sight:" + "\n"
				+ "It's your fellow S.T.A.R.S. officer, Richard Aiken, still alive!" + "\n"
				+ "Unfortunately, he's heavily wounded... his arm looks like it was bitten by a massive snake!" + "\n"
				+ "He'll need some serum, fast, or he'll surely die... but where could you find some in this mansion?");
		/*
		 * Exits: North: 'C' Corridor
		 * 		  South West: Attic Entry
		 * Items: Green Herb, Radio
		 */
		
		this.rooms[42] = pillarRoom;
		
		Room greenhouse = new Room(
				"Greenhouse",
				"a room filled with plants",
				"A greenhouse filled with healing herbs!" + "\n"
				+ "Unfortunately, those wildly flailing vines make it too dangerous to approach..." + "\n"
				+ "If you had some herbicide, maybe you could do something about it...");
		/*
		 * Exits: NorthEast: Northern Corridor
		 * Items: Green Herb x5, Death Mask Without Eyes
		 */
		
		this.rooms[43] = greenhouse;
		
		Room atticEntry = new Room(
				"Attic Entry",
				"a small hallway",
				"A small hallway linking the attic and another room." + "\n"
				+ "You can hear the shuffling of a zombie...");
		/*
		 * Exits: NorthWest: Small Dining Room
		 * 		  East: Attic
		 */
		
		this.rooms[44] = greenhouse;
		
		Room smallDiningRoom = new Room(
				"Small Dining Room",
				"a dining room",
				"Another of the mansion's dining rooms, presumably for servants." + "\n"
				+ "One of the cabinets looks like it could be moved!" + "\n"
				+ "You hear the shuffling of a zombie...");
		/*
		 * Exits: NorthEast: Attic Entry
		 * Items: Handgun Magazine 1x15, Handgun Magazine 1x15, Music mid-pages
		 */
		
		this.rooms[45] = smallDiningRoom;
		
		Room pianoBar = new Room(
				"Piano Bar",
				"a room that smells of alcohol",
				"A bar with a piano! If you had the time, maybe you'd consider taking a drink." + "\n"
				+ "God knows you deserve one, after putting up with all these zombies." + "\n"
				+ "One of the shelves with alcohol looks like it can be pushed!" + "\n"
				+ "The piano looks suspicious... if you had a complete musical score, maybe you could play it?");
		/*
		 * Exits: South: Tea Room
		 * Items: Missing Music, Gold Emblem, Trevor's Diary
		 */
		
		this.rooms[46] = pianoBar;
		
		Room roofedPassage = new Room(
				"Roofed Passage",
				"a curved hallway with a roof",
				"A passage that leads outside the mansion." + "\n"
				+ "You can hear barking of a zombie dog...");
		/*
		 * Exits: NorthWest: Garden Shed
		 */
		
		this.rooms[47] = roofedPassage;
		
		Room gardenShed = new Room(
				"Garden Shed",
				"a shed",
				"A Garden Shed loaded with various, expensive-looking gardening supplies." + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Exits: West: Roofed Passage
		 * Items: Shotgun Shells 1x6, Battery Pack, First Aid Spray x2, Grenade Shells 1x6
		 */
		
		this.rooms[48] = gardenShed;
		
		Room courtyardStudy = new Room(
				"Courtyard Study",
				"a small study",
				"Yet another of the mansion's various studies. How many does this place have, anyway?" + "\n");
		/*
		 * Exits: South: Dark Corridor
		 * Items: Shotgun Shells 1x6, Metal Object, Battery Pack
		 */
		
		this.rooms[49] = courtyardStudy;
		
		Room eCorridor = new Room(
				"Elevator Corridor",
				"a winding corridor",
				"A corridor linking a couple rooms, along with an elevator. But is it opertaional?" + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Exits: Northwest: Mirror Corridor
		 * 		  Southwest: Materials Room
		 * Items: Green Herb x2, Red Herb x1
		 */
		
		this.rooms[50] = eCorridor;
		
		Room materialsRoom = new Room(
				"Materials Room",
				"a small room",
				"Yet another small room in the mansion, loaded with various, unrelated items." + "\n");
		/*
		 * Exits: East: Eleavator Corridor
		 * Items: Shotgun Shells 1x6, Acid Shells 1x6, Battery Pack, Battery
		 */
		
		this.rooms[51] = materialsRoom;
		
		Room trophyRoom = new Room(
				"Trophy Room",
				"a room with lots of display cases",
				"A room showing off various Trophies, both hunting and competition" + "\n");
		/*
		 * Exits: Southeast: West Wing Inner Stairway
		 * Items: Grenade Shells 1x6, Red Gemstone, Yellow Gemstone, Mail to the Chief of Security, Dagger
		 */
		
		this.rooms[52] = trophyRoom;
		
		Room attic = new Room(
				"Attic",
				"a dusty, suspiciously large room",
				"A large, dusty attic, that's suspiciously clear. You have a bad feeling about this room..." + "\n"
				+ "You can hear the suspiciously loud shuffling and hissing of a snake. It makes you think of Richard..." + "\n"
				+ "Could this have been the snake that attacked him? Better be prepared for some combat!");
		/*
		 * Exits: SouthWest: Attic Entry
		 * Items: Death Mask Without a Nose, Assault Shotgun
		 */
		
		this.rooms[53] = attic;
	}
}
