package dev.kerbow.game;

import dev.kerbow.fixtures.Room;
import dev.kerbow.fixtures.Item;
import dev.kerbow.fixtures.ItemBox;

public class RoomManager {

	private static Room[] rooms = new Room[59];
	private static Room startingRoom;
	//Room[] firstFloor;
	//Room[] secondFloor;
	
	public static void init() {
		Room foyer1F = new Room(
				"The Foyer",
				"a large foyer",
				"You find yourself inside the foyer off a large mansion in the Arklay Mountains. "
				+ "\nYou, your fellow S.T.A.R.S. members Barry Burton and captain Albert Wesker are with you." + "\n"
				+ "You were chased into this mansion by what could only be described as 'ravenous zombie dogs.'" + "\n" 
				+ "The entire thing sounds ridiculous, but after seeing the bodies of your fellow S.T.A.R.S members Kevin Dooley and Joseph Frost, well... " + "\n"
				+ "whatever fantasy you imagined before has well and truly become a nightmare." + 
				"\nSomething tells you this mansion holds the secrets that could unlock the terrifying events behind their deaths... " + 
				"\nAnd there are only three S.T.A.R.S. members left to seek them."
				+ "\nThe whereabouts of Chris Redfield, your partner, are unknown. Take care, Jill Valentine!");
		/* 
		 * Items: Barry gives you a Lockpick here, after returning from the Dining room.
		 *
		 */ 
		Room diningRoom = new Room(
				"The Dining Room",
				"a large, formal dining room",
				"You and Barry enter the long dining room. \nIt's certainly a strange scene: the table is set up completely, with half-eaten food"
				+ " still on the plates, yet no sign of anyone even sitting in the chairs to eat! \nAt the end of the dining room, however, there is"
				+ " a roaring fireplace... and in front of it, a pool of blood! \n'Blood...' Barry says, inspecting the small pool. \n'Jill, see if"
				+ " you can find any other clues. I'll be examining this. Let's just hope it's not Chris's...");
		/*
		 * Items: Ink Ribbon, Typewriter, Emblem, Blue Jewel (after pushing statue), Shield Key (needs gold emblem)
		 */
		Room teaRoom = new Room(
				"The Tea Room",
				"a small room attached to a long hallway",
				"You come to a long hallway. On your left, there is a small room at the end of the hall. You can hear a strange noise " + "\n"
				+ "coming from there...");
		/*
		 * Items: Kenneth's film, on the body of fellow S.T.A.R.S member Kenneth J. Sullivan
		 */
		Room westWingOuterStairway = new Room(
				"The West Wing Outer Stairway",
				"a small hallway with stairs leading up at the end",
				"The West Wing Outer Stairway contains a short hallway that opens up to a small room." + "\n" +
				"A staircase at the end winds up to the second floor.");
		/*
		 * Items: Green Herb ,Handgun Magazine 1x15
		 */
		Room mirrorCorridor = new Room(
				"Mirror Corridor",
				"A corridor with mirrors on the walls",
				"This strange corridor is filled with mirrors... as well as two unwelcome surprises! Two zombies are here, but they aren't " + "\n" 
				+ "moving yet. Be careful!");
		/*
		 * Items: Green Herb, Golden Arrow, Arrowhead ,Handgun Magazine 1x15
		 */
		Room diningHall2F = new Room(
				"Dining Hall Second Floor",
				"The Second Floor of the Dining Room",
				"You didn't notice it before, but it seemed that there was a second floor balcony in the dining room, inaccessable from " + "\n"
				+ " the room itself. Be careful: there's a zombie shuffling around here!");
		/*
		 * Items: Dagger,Statue that you can push
		 */	
		Room foyer2F = new Room(
				"Foyer Second Floor",
				"The Second Floor of the Main Hall",
				"This is the second floor of the foyer, which is home to a series of balconies overlooking the foyer's first floor.");
		
		Room graveyard = new Room(
				"The Graveyard",
				"A creepy graveyard behind the mansion.",
				"Of all the things to find on the mansion's property, why is there a graveyard!? In the middle is a long corridor that " + "\n"
				+ " leads to a large statue. Be careful, as there are two zombies shuffling around!");
		/*
		 * Items: Shotgun Shells 1x6
		 */
		Room crypt = new Room(
				"Crypt",
				"A creepy crypt behind the graveyard statue",
				"If that graveyard was creepy, this is even worse! It's like something straight out of a medeival catacomb: bones everywhere," + "\n"
				+ " sarcophagi, and what looks like a coffin dangling from the ceiling by four chains. On your left are four prominent skulls," + "\n" 
				+ " a closer inspection of which suggests that something should be placed on them. A mask, maybe?");
		/*
		 * Items: The Book of Curses, The Sword Key ,Shotgun Shells 1x6, after putting the masks in place, Stone and Metal Object
		 */
				
		Room artRoom = new Room(
				"Art Room",
				"A room with various paintings",
				"A small room where you can find numerous paintings mounted on the walls. In the middle of the room is a statue of a woman" + "\n" 
				+ " holding a vase. You can see something inside it, but it's too tall for you to grab. You can also hear a zombie shuffling around...");
		/*
		 * Items: Map of the Mansion First Floor,Dagger,Shelf that you can push to access the map in the vase
		 */
		Room lCorridor = new Room(
				"'L' Corridor",
				"A large corridor in the shape of an 'L'",
				"A long corridor that winds behind around the East side of the mansion." + "\n"
				+ "You can hear the barking of two dogs behind the windows...");
		/* 
		 * Items: Dagger, Handgun Magazine 1x15
		 */
		Room windingCorridor = new Room(
				"Winding Corridor",
				"An oddly shaped Corridor",
				"Yet another oddly shaped corridor in the Mansion. Who designed this place, anyway?");
		
		Room marbleRoom = new Room(
				"Marble Room",
				"A small, marble room",
				"A strange, small room. There is nothing here, but the walls and floors are made from marble.");
		
		Room livingRoom = new Room(
				"Living Room",
				"a small living room",
				"A comfortable living room, with sofas, coffe tables, and a roaring fireplace." + "\n"
				+ "This would be a good room to rest in for a while...");
		/*
		 * Items: Dagger, Ink Ribbon x3, Shotgun
		 */
		Room darkCorridor = new Room(
				"Dark Corridor",
				"A dimly lit corridor",
				"A short, dimly lit corridor. Most of the lights are broken, with only a couple flickering ones and a single window." + "\n"
				+ "You can hear the shuffling of a zombie nearby...");
		
		Room eastWingStairway1F= new Room(
				"East Wing Stairway 1F",
				"a stairway in the east wing",
				"A small stairway that leads into a small storeroom. You can hear the shuffling of a zombie inside...");
		
		Room eastWingStoreroom = new Room(
				"East Wing Storeroom",
				"a small storeroom",
				"A small store room in the east wing of the mansion. You can rest easy here.");
		/*
		 * Items: Item Box, Typewriter, Fuel Canteen, Kerosene, First Aid Spray, Incendiary Shells left by Barry, 1x6
		 */
		Room eastWingStairway2F = new Room(
				"East Wing Stairway 2F",
				"the second floor",
				"At the top of the stairway is a long hallway. You can hear the shuffling of two zombies...");
		
		Room cCorridor = new Room(
				"'C' Corridor",
				"a strangely shaped corridor",
				"A corridor shaped like a reverse capital C. You can hear the shuffling of two zombies...");
		/*
		 * Items: Wooden Mount
		 */
		Room smallLibrary = new Room(
				"Small Library",
				"a small library and study",
				"A small study filled with bookshelves, a few small coffe tables, and a desk.");
		/*
		 * Items: Dog Whistle, Handgun Magazine 1x15, Lighter, Botany book, Crumpled Memo
		 */
		Room restingRoom = new Room(
				"Resting Room",
				"small room with a fireplace",
				"A small room with a cozy fireplace and a couple chairs." + "\n"
				+ "Currently, there is no fire...");
		/*
		 * Items: Green Herb
		 */
		Room slidingTrapRoom = new Room(
				"Sliding Trap Room",
				"A room filled with marble",
				"The room is yet another strange one: marble floors, marble walls, and a statue that can be pushed into the hall." + "\n"
				+ "Something is very fishy about this...");
		/*
		 * Items: Dagger
		 */
		Room outsideBoiler = new Room(
				"Outside Boiler",
				"a small path outside",
				"A small, fenced pathway outside the mansion. There is a boiler alongside the wall of the mansion here." + "\n"
				+ "You can hear the barking of two zombie dogs here...");
		/*
		 * Items: Herbicide, Green Herb x2, Red Herb, Kerosene
		 */
		Room bathroom = new Room(
				"Bathroom",
				"a bathroom with bathtub",
				"A small, old fashioned bathroom, with a tub and a toilet. The tub is suspiciously full of murky water...");
		/*
		 * Items: Dagger
		 */
		Room outsideBalcony = new Room(
				"Outside Balcony",
				"a balcony outside the mansion",
				"A balcony on the second floor of the mansion, overlooking the front. It winds around the mansion to the right." + "\n"
				+ "You can hear the barking of two zombie dogs, one of which possesses an item you need...");
		/*
		 * Items: Collar, Coin, Imitation of a Key
		 */
		Room teaRoomB1 = new Room(
				"Tea Room B1",
				"down the tea room stairs",
				"A small hallway down the east stairs. There is a door in front of you.");
		
		Room kitchen = new Room(
				"Kitchen",
				"a dirty kitchen",
				"A large, dirty kitchen, likely designed to feed the mansion's guests when the owners hosted them." + "\n"
				+ "You can hear the shuffling of a zombie inside...");
		/*
		 * Items: Dagger
		 */
		Room uGPassage1 = new Room(
				"Underground Passage 1",
				"a concrete passage",
				"A mysterious passage you found hidden next to the kitchen. Where could it lead?" + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		Room uGPassage2 = new Room(
				"Underground Passage 2",
				"another concrete passage",
				"A secondary passage connected to the first one. At the end, there is a hole in the celing!" + "\n"
				+ "You can't climb up it..." + "\n"
				+ "You can hear the scuttling of three giant spiders...");
		/*
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		Room westWingInnerStairway2F = new Room(
				"West Wing Inner Stairway 2F",
				"a small hallway with a stairwayy",
				"This Hallway is located inside the mansion, linking several rooms together." + "\n"
				+ "You can hear the shuffling of two zombies...");
		
		Room westWingInnerStairway1F = new Room(
				"West Wing Inner Stairway 1F",
				"a hallway with two rooms",
				"At the bottom of the stairway, you come to an C shaped hallway with two rooms" + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		Room medicalStorageRoom = new Room(
				"Medical Storage Room",
				"a room filled with medical supplies",
				"A room filled with medicines, serums, and salves of all kinds." + "\n"
				+ "You can rest easy in this room!");
		/*
		 * Items: Item Box, Typewriter, Body Disposal, Serum
		 */
		Room smallStoreroom = new Room(
				"Small Storeroom",
				"a small storage room",
				"A small, stuffy storage room filled with seemingly random items.");
		/*
		 * Items: Battery Pack, Broken Shotgun, Ink Ribbon x3, Kerosene
		 */
		Room deathPassage = new Room(
				"Strange Passage",
				"a stone passageway",
				"The walls of this strange passageway are nearly entirely made of stone." + "\n"
				+ "To your right, there is a knight with a spiked shield in a small alcove." + "\n"
				+ "Further down, there is a small, slightly open room with a strange relief bearing a key." + "\n"
				+ "It seems highly suspicious... be careful if you touch it!");
		/*
		 * Items: Dagger, Red Herb, Blue Herb, Handgun Magazine 1x15
		 */
		Room northernCorridor = new Room(
				"Northern Corridor",
				"a winding corridor",
				"A corridor linking several more rooms together. Whoever designed this mansion was surely crazy..." + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Items: Battery Pack
		 */
		Room researcherRoom = new Room(
				"Researcher's Room",
				"a small bedroom",
				"The small quarters of a researcher. Could he be the man dead on the floor?" + "\n"
				+ "You can hear a slight knocking noise coming from inside a wardrobe..." + "\n"
				+ "Frankly, you've seen enough zombies not to trust the corpse on the floor, either.");
		/*
		 * Items: Handgun Magazine 1x15, Keeper's Diary, Battery Pack
		 */
		Room tigerRoom = new Room(
				"Tiger Statue Room",
				"a small room",
				"A small room containing only the bust of a tiger head on a shelf jutting out from the wall." + "\n"
				+ "However, there's something fishy about it...");
		/*
		 * Items: Shotgun Shells 1x6, MO Disk
		 */
		Room hiddenWardrobe = new Room(
				"Hidden Wardrobe",
				"a stuffy, hidden room",
				"A small, cleverly hidden wardrobe, filled with dusty formal clothing." + "\n"
				+ "You can rest easy here!");

		Room outsidePatio = new Room(
				"Outside Patio",
				"a balcony with a patio",
				"A comfortable-looking outdoor patio winding around the front and east side of the mansion." + "\n"
				+ "Unfortunately for you, you can't rest easy here, as you've discovered a shocking and sad sight..." + "\n"
				+ "Here, you find the body of fellow S.T.A.R.S. officer Forest Spayer sitting in a chair." + "\n"
				+ "Next to him, laying against the chair, is a grenade launcher! Poor Forest won't be needing it anymore...");
		/*
		 * Items: Dagger, Grenade Launcher, Green Herb x2
		 */
		Room armorRoom = new Room(
				"Armor Room",
				"a room filled with suits of armor",
				"As you enter the room, four suits of armor suddenly slide forward!" + "\n"
				+ "If you push them back in the correct order, you may be able to free the trapped item...");
		/*
		 * Items: Jewelry Box, Death Mask Without Eyes, Nose, or Mouth
		 */
		Room largeGallery = new Room(
				"Large Gallery",
				"a room with stained glass windows",
				"The stained glass windows here are illuminatef with colored light." + "\n" 
				+ "At the end of the passage is another window featuring a woman wearing specially colored items." + "\n" 
				+ "There is a puzzle to be solved here...");
		/*
		 * Items: Death Mask without a Mouth
		 */
		Room deerRoom = new Room(
				"Deer Room",
				"a small room",
				"A small room featuring only a mounted deer's head on the wall." + "\n" 
				+ "You find it incredibly creepy...");
		/*
		 * Items: Red Herb
		 */
		Room scientistRoom = new Room(
				"Scientist's Room",
				"a scientific-looking room",
				"A room filled with scientific equipment. It must belong to an eccentric scientist." + "\n"
				+ "Why else would there be an insect specimen display and a fishing lure display in the same room?" + "\n"
				+ "In fact, they both look rather suspicious...");
		/*
		 * Items: Researcher's Will, Fish hook, Bee Specimen, Lure without a Hook, Wind Crest
		 */
		Room bedroom = new Room(
				"Bedroom",
				"a small bedroom",
				"Yet another small bedroom." + "\n" +
				"In this horrible mansion, it's a little odd to see something so normal..." + "\n"
				+ "You can rest easy here!");
		/*
		 * Items: Fist Aid Box, First Aid Spray, Ink Ribbon x3, Green Herb
		 */
		Room pillarRoom = new Room(
				"Pillar Room",
				"a hallway with a pillar",
				"A sudden crash startles you! From the other end of the hallway, you find a hopeful sight:" + "\n"
				+ "It's your fellow S.T.A.R.S. officer, Richard Aiken, still alive!" + "\n"
				+ "Unfortunately, he's heavily wounded... his arm looks like it was bitten by a massive snake!" + "\n"
				+ "He'll need some serum, fast, or he'll surely die... but where could you find some in this mansion?");
		/*
		 * Items: Green Herb, Radio
		 */
		Room greenhouse = new Room(
				"Greenhouse",
				"a room filled with plants",
				"A greenhouse filled with healing herbs!" + "\n"
				+ "Unfortunately, those wildly flailing vines make it too dangerous to approach..." + "\n"
				+ "If you had some herbicide, maybe you could do something about it...");
		/*
		 * Items: Green Herb x5, Death Mask Without Eyes
		 */
		Room atticEntry = new Room(
				"Attic Entry",
				"a small hallway",
				"A small hallway linking the attic and another room." + "\n"
				+ "You can hear the shuffling of a zombie...");
		/*
		 * Exits: NorthWest: Small Dining Room
		 * 		  East: Attic
		 */
		Room smallDiningRoom = new Room(
				"Small Dining Room",
				"a dining room",
				"Another of the mansion's dining rooms, presumably for servants." + "\n"
				+ "One of the cabinets looks like it could be moved!" + "\n"
				+ "You hear the shuffling of a zombie...");
		/*
		 * Items: Handgun Magazine 1x15, Handgun Magazine 1x15, Music mid-pages
		 */
		Room pianoBar = new Room(
				"Piano Bar",
				"a room that smells of alcohol",
				"A bar with a piano! If you had the time, maybe you'd consider taking a drink." + "\n"
				+ "God knows you deserve one, after putting up with all these zombies." + "\n"
				+ "One of the shelves with alcohol looks like it can be pushed!" + "\n"
				+ "The piano looks suspicious... if you had a complete musical score, maybe you could play it?");
		/*
		 * Items: Missing Music, Gold Emblem, Trevor's Diary
		 */
		Room roofedPassage = new Room(
				"Roofed Passage",
				"a curved hallway with a roof",
				"A passage that leads outside the mansion." + "\n"
				+ "You can hear barking of a zombie dog...");
		Room gardenShed = new Room(
				"Garden Shed",
				"a shed",
				"A Garden Shed loaded with various, expensive-looking gardening supplies." + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Items: Shotgun Shells 1x6, Battery Pack, First Aid Spray x2, Grenade Shells 1x6
		 */
		Room courtyardStudy = new Room(
				"Courtyard Study",
				"a small study",
				"Yet another of the mansion's various studies. How many does this place have, anyway?" + "\n");
		/*
		 * Items: Shotgun Shells 1x6, Metal Object, Battery Pack
		 */	
		Room eCorridor = new Room(
				"Elevator Corridor",
				"a winding corridor",
				"A corridor linking a couple rooms, along with an elevator. But is it opertaional?" + "\n"
				+ "You can hear the shuffling of two zombies...");
		/*
		 * Items: Green Herb x2, Red Herb x1
		 */	
		Room materialsRoom = new Room(
				"Materials Room",
				"a small room",
				"Yet another small room in the mansion, loaded with various, unrelated items." + "\n");
		/*
		 * Items: Shotgun Shells 1x6, Acid Shells 1x6, Battery Pack, Battery
		 */	
		Room trophyRoom = new Room(
				"Trophy Room",
				"a room with lots of display cases",
				"A room showing off various Trophies, both hunting and competition" + "\n");
		/*
		 * Items: Grenade Shells 1x6, Red Gemstone, Yellow Gemstone, Mail to the Chief of Security, Dagger
		 */	
		Room attic = new Room(
				"Attic",
				"a dusty, suspiciously large room",
				"A large, dusty attic, that's suspiciously clear. You have a bad feeling about this room..." + "\n"
				+ "You can hear the suspiciously loud shuffling and hissing of a snake. It makes you think of Richard..." + "\n"
				+ "Could this have been the snake that attacked him? Better be prepared for some combat!");
		/*
		 * Items: Death Mask Without a Nose, Assault Shotgun
		 */	
		Room largeArtRoom = new Room(
				"Large Art Room",
				"a large room",
				"A room featuring a single, blue couch, and a large globe in the center." + "\n"
				+ "There is also a preserved, internal organ inside a jar on a shelf." + "\n"
				+ "You can't tell if it belongs to an animal, or a human...");
		/*
		 * Items: Trevor's Diary Part 2, Ink Ribbon x3
		 */	
		Room mirrorRoom = new Room(
				"Mirror Room",
				"a room with a large mirror",
				"This room features a large mirror with a curtain over it." + "\n"
				+ "There are also various wardrobes and clothing racks, meant to handle costumes." + "\n"
				+ "Perhaps the mansion's owner is a fan of stage plays?" + "\n"
				+ "You can hear the shuffling of a zombie...");
		/*
		 * Items: Dagger, Jewelry Box x2, Broach, Emblem Key, Green Herb, Blue Herb x3
		 */
		
		//assigning every room to a large array for storage
		rooms[0] = foyer1F;
		rooms[1] = diningRoom;
		rooms[2] = teaRoom;
		rooms[3] = westWingOuterStairway;
		rooms[4] = mirrorCorridor;
		rooms[5] = diningHall2F;
		rooms[6] = foyer2F;
		rooms[7] = graveyard;
		rooms[8] = crypt;
		rooms[9] = artRoom;
		rooms[10] = lCorridor;
		rooms[11] = windingCorridor;
		rooms[12] = marbleRoom;
		rooms[13] = livingRoom;
		rooms[14] = darkCorridor;
		rooms[15] = eastWingStairway1F;
		rooms[16] = eastWingStoreroom;
		rooms[17] = eastWingStairway2F;
		rooms[18] = cCorridor;
		rooms[19] = smallLibrary;
		rooms[20] = restingRoom;
		rooms[21] = slidingTrapRoom;
		rooms[22] = outsideBoiler;
		rooms[23] = bathroom;
		rooms[24] = outsideBalcony;
		rooms[25] = teaRoomB1;
		rooms[26] = kitchen;
		rooms[27] = uGPassage1;
		rooms[28] = uGPassage2;
		rooms[29] = westWingInnerStairway2F;
		rooms[30] = westWingInnerStairway1F;
		rooms[31] = medicalStorageRoom;
		rooms[32] = smallStoreroom;
		rooms[33] = deathPassage;
		rooms[34] = northernCorridor;
		rooms[35] = researcherRoom;
		rooms[36] = tigerRoom;
		rooms[37] = hiddenWardrobe;
		rooms[38] = outsidePatio;
		rooms[39] = armorRoom;
		rooms[40] = largeGallery;
		rooms[41] = deerRoom;
		rooms[42] = scientistRoom;
		rooms[43] = bedroom;
		rooms[44] = pillarRoom;
		rooms[45] = greenhouse;
		rooms[46] = atticEntry;
		rooms[47] = smallDiningRoom;
		rooms[48] = pianoBar;
		rooms[49] = roofedPassage;
		rooms[50] = gardenShed;
		rooms[51] = courtyardStudy;
		rooms[52] = eCorridor;
		rooms[53] = materialsRoom;
		rooms[54] = trophyRoom;
		rooms[55] = attic;
		rooms[56] = largeArtRoom;
		rooms[57] = mirrorRoom;
		
		//initialize starting rooms
		startingRoom = foyer1F;
		
		/*
		 * Initialize every room's exits.
		 * 
		 * Yes, I realize that's a LOT of lines of code. I wish there was a better way to do it, but
		 * I figured it was best to hard code them in instead of mess something up with an improperly
		 * implemented loop.
		 */
		
		foyer1F.initExits(graveyard, null, diningRoom, artRoom, null, null, largeArtRoom, null, foyer2F, null);
		diningRoom.initExits(teaRoom, null, null, foyer1F, null, null, null, null, null, null);
		teaRoom.initExits(northernCorridor, diningRoom, westWingOuterStairway, null, null, null, pianoBar, null, null, teaRoomB1);
		westWingOuterStairway.initExits(null, null, null, teaRoom, null, null, null, null, mirrorCorridor, null);
		mirrorCorridor.initExits(null, westWingInnerStairway2F, null, deathPassage, null, null, null, diningHall2F, null, westWingOuterStairway);
		diningHall2F.initExits(mirrorCorridor, null, null, foyer2F, westWingInnerStairway2F, null, null, null, null, null);
		foyer2F.initExits(graveyard, null, diningHall2F, null, null, outsideBalcony, cCorridor, outsidePatio, null, foyer1F);
		graveyard.initExits(null, foyer1F, null, largeGallery, null, null, null, null, null, crypt);
		crypt.initExits(null, null, null, null, null, null, null, null, graveyard, null);
		artRoom.initExits(null, null, foyer1F, hiddenWardrobe, null, null, null, lCorridor, null, null);
		lCorridor.initExits(windingCorridor, null, artRoom, null, null, null, null, null, null, null);
		windingCorridor.initExits(bathroom, lCorridor, darkCorridor, outsideBoiler, null, null, null, marbleRoom, null, null);
		marbleRoom.initExits(null, livingRoom, windingCorridor, null, null, null, null, null, null, null);
		livingRoom.initExits(marbleRoom, null, null, null, null, null, null, null, null, null);
		darkCorridor.initExits(courtyardStudy, largeGallery, null, windingCorridor, roofedPassage, null, eastWingStairway1F, null, null, null);
		eastWingStairway1F.initExits(null, darkCorridor, null, null, null, null, null, eastWingStoreroom, eastWingStairway2F, null);
		eastWingStoreroom.initExits(eastWingStairway1F, null, null, null, null, null, null, null, null, null);
		eastWingStairway2F.initExits(null, deerRoom, smallLibrary, null, null, cCorridor, null, restingRoom, null, eastWingStairway1F);
		cCorridor.initExits(eastWingStairway2F, pillarRoom, armorRoom, null, null, foyer2F, null, null, null, null);
		smallLibrary.initExits(null, cCorridor, null, eastWingStairway2F, null, null, null, null, null, null);
		restingRoom.initExits(eastWingStairway2F, null, slidingTrapRoom, null, null, null, null, null, null, null);
		slidingTrapRoom.initExits(null, null, null, restingRoom, null, null, null, null, null, null);
		outsideBoiler.initExits(null, null, windingCorridor, null, null, null, null, null, null, null);
		bathroom.initExits(null, windingCorridor, null, null, null, null, null, null, null, null);
		outsideBalcony.initExits(null, null, null, foyer2F, westWingInnerStairway2F, null, null, null, null, null);
		teaRoomB1.initExits(null, null, kitchen, null, null, null, null, null, teaRoom, null);
		kitchen.initExits(null, uGPassage1, null, null, null, null, teaRoomB1, null, null, null);
		uGPassage1.initExits(kitchen, null, null, uGPassage2, null, null, null, null, null, null);
		uGPassage2.initExits(null, null, uGPassage1, null, null, null, null, null, null, null);
		westWingInnerStairway2F.initExits(mirrorCorridor, diningHall2F, null, null, trophyRoom, outsideBalcony, null, null, null, westWingInnerStairway1F);
		westWingInnerStairway1F.initExits(medicalStorageRoom, smallStoreroom, null, northernCorridor, null, null, null, null, westWingInnerStairway2F, null);
		medicalStorageRoom.initExits(null, westWingInnerStairway1F, null, null, null, null, null, null, null, null);
		smallStoreroom.initExits(westWingInnerStairway1F, null, null, null, null, null, null, null, null, null);
		deathPassage.initExits(null, null, mirrorCorridor, null, null, null, null, null, null, null);
		northernCorridor.initExits(tigerRoom, teaRoom, null, greenhouse, westWingInnerStairway1F, researcherRoom, null, null, null, null);
		researcherRoom.initExits(null, null, null, null, null, null, northernCorridor, null, null, null);
		tigerRoom.initExits(null, northernCorridor, null, null, null, null, null, null, null, null);
		hiddenWardrobe.initExits(null, null, artRoom, null, null, null, null, null, null, null);
		outsidePatio.initExits(null, null, foyer2F, null, null, null, null, null, null, null);
		armorRoom.initExits(null, null, null, cCorridor, null, null, null, null, null, null);
		largeGallery.initExits(darkCorridor, null, null, null, null, graveyard, null, null, null, null);
		deerRoom.initExits(eastWingStairway2F, null, bedroom, scientistRoom, null, null, null, null, null, null);
		scientistRoom.initExits(null, null, deerRoom, null, null, null, null, null, null, null);
		bedroom.initExits(null, null, null, deerRoom, null, null, null, null ,null, null);
		pillarRoom.initExits(cCorridor, null, null, null, null, null, null, atticEntry, null, null);
		greenhouse.initExits(null, null, null, null, null, null, northernCorridor, null, null, null);
		atticEntry.initExits(null, null, pillarRoom, attic, smallDiningRoom, null, null, null, null, null);
		smallDiningRoom.initExits(null, null, null, null, null, null, atticEntry, null, null, null);
		pianoBar.initExits(null, teaRoom, null, null, null, null, null, null, null, null);
		roofedPassage.initExits(null, null, null, null, null, null, gardenShed, darkCorridor, null, null);
		gardenShed.initExits(null, null, roofedPassage, null, null, null, null, null, null, null);
		courtyardStudy.initExits(null, darkCorridor, null, null, null, null, null, null, null, null);
		eCorridor.initExits(null, null, null, null, mirrorCorridor, materialsRoom, null, null, null, null);
		materialsRoom.initExits(null, null, null, eCorridor, null, null, null, null, null, null);
		trophyRoom.initExits(null, null, null, null, null, null, null, westWingInnerStairway1F, null, null);
		attic.initExits(null, null, null, null, null, atticEntry, null, null, null, null);
		largeArtRoom.initExits(null, null, foyer1F, mirrorRoom, null, null, null, null, null, null);
		mirrorRoom.initExits(null, null, null, null, largeArtRoom, null, null, null, null, null);
	}
	
	//Restorative Items
	Item greenHerb = new Item("Green Herb", "A small green herb", "A green herb native to the Arklay Mountains."
			+ "\nRestores vitality by 30 %." + "\nCan be combined with other herbs to greater effect.");
	Item redHerb = new Item("Red Herb", "A small green herb", "A red herb native to the Arklay Mountains."
			+ "\nCannot be used in its current form.");
	Item blueHerb = new Item("Blue Herb", "a small blue herb", "A blue herb native to the Arkaly Mountains."
			+ "\nCannot be used in its current form.");
	Item firstAidSpray = new Item("First Aid Spray", "a medical spray", "A powerful medical spray."
			+ "\nCan instantly restore your health. Cannot remove poison.");
	Item serum = new Item("Serum", "anti-poison serum", "This can be used to heal Richard from his poison!");
	Item mixedHerbGG = new Item("Mixed Herbs (G+G)", "A mixture of two green herbs", "Two green herbs that have been chopped and mixed together."
			+ "\nRestores vitality up to 60%");
	Item mixedHerbGR = new Item("Mixed Herbs (G+R)", "A mixture of a green and red herb", "This green and red herb mixture can fully restore your health.");
	Item mixedHerbGB = new Item("Mixed Herbs (G+B)", "A mixture of a green and blue herb", "Restores 30% health and removes posion.");
	Item mixedHerbGGB = new Item("Mixed Herbs (G+G+B", "a mixture of two green herbs and one blue herb", "Restores health by 60% and removes poison");
	Item mixedHerbGGG = new Item("Mixed Herbs (G+G+G", "A mixture of three green herbs", "Restores vitality completely.");
	Item mixedHerbGRB = new Item("Mixed Herbs (G+R+B", "A mixture of one green, one red, and one blue herb", "Restores vitality completely and cures poison");
	
	//Keys
	Item swordKey = new Item("Sword Key", "A skeleton key marked with the image of a sword", "This key is needed to open certain rooms in the Mansion."
			+ "\nLook for doors that bear the image of a sword.");
	Item armorKey = new Item("Armor Key", "A skeleton key marked with the image of a breastplate", "This key is needed to open certain rooms in the Mansion."
			+ "\nLook for doors that bear the image of a breastplate");
	Item shieldKey = new Item("Shield Key", "A skeleton key marked with the image of a shield.", "This key is required to open the Attic");
	Item helmetKey = new Item("Helmet Key", "A skeleton key marked with the image of a helmet.", "This key is needed to open certain rooms in the Mansion."
			+ "\nLook for doors that bear the image of a helmet");
	Item oldKey = new Item("Old Key", "A small skeleton key", "These small keys are used to open various doors within the Mansion."
			+ "\nIt's too fragile to be used more than once. Choose your door wisely!");
	Item key002 = new Item("002 Key", "A small gold key", "The number 002 is engraved. Opens the door to Room 002");
	Item key003 = new Item("003 Key", "A small silver key", "The number 003 is engraved. Opens the door to Room 003");
	Item imitation = new Item("Fake Key", "an imitation of a key", "An object shaped like the Armor Key. Far too fragile to actually use.");
	Item gallerykey = new Item("Gallery Key", "A small key with the word GALLERY on it", "A small key used to open the Gallery room.");
	Item controlRoomKey = new Item("Control Room Key", "A small key", "This key is used to open the Control Room.");
	Item emblemKey = new Item("Emblem Key", "an elaborate, gold key", "An important-looking key emblazoned with the Spencer Family coat of arms."
			+ "\nIt can be used to open the door to the private study");
	Item powerKey = new Item("Key for the Power Area", "a card-like key", "This card-like key is needed to open the Morgue in the Underground Laboratory");
	Item masterKey = new Item("Master Key", "an emergency key", "A key issued only in emergencies. This key is needed to unlock the Helipad Passage");
	
	//Usable items
	Item inkRibbon = new Item("Ink Ribbon", "An ink ribbon for typewriters.", "Use these ink ribbons at the typwriters found all over the Mansion."
			+ "\nThey are needed to save your progress.");
	Item lockpick = new Item("Lockpick", "a set of lockpicking tools", "You can use this to unlock doors within the Mansion."
			+ "\nCan only be used on lock doors that do not require a certain key.");
	Item lighter = new Item("Lighter", "a standard flip-top lighter", "Use with the Fuel Canteen to burn zombie corpses."
			+ "\nTake no chances with these undead freaks! Burn the bodies to keep them from rising again.");
	Item fuelCanteen = new Item("Fuel Canteen", "a small canteen for carrying kerosene", "Use in conjunction with the lighter to burn the corpes of zombies."
			+ "\nBetter a pile of ash than them trying to chew your throat out!");
	
	//Puzzle Items
	Item goldArrow = new Item("Golden Arrow", "a long golden arrow", "You found this arrow in the Mirror Corridor. It looks very suspicious...");
	Item arrowhead = new Item("Arrowhead", "a peridot arrowhead", "You took this off the Golden Arrow. It looks like it's used to open something...");
	Item curseBook = new Item("Book of Curses", "A locked book", "A strange book you found in the crypt. It may hold a clue to proceed...");
	Item herbicide = new Item("Herbicide", "a sack of strong weed killer", "This heavy sack of weed killer seems out of place here..."
			+ "\nYou suppose you could use it on overgrown plants somewhere?");
	Item dogWhistle = new Item("Dog Whistle", "a small whistle", "This small dog whistle looks suspicious...");
	Item collar = new Item("Dog collar", "a dog collar", "A collar you found on a zombie dog. But why did only one dog wear a collar?");
	Item coin = new Item("Coin", "a small, heavy coin", "You found this coin inside the dog collar. It looks suspicious...");
	Item mount = new Item("Wooden Mount", "a wooden mount with a blank paper", "A strange wooden mount with a seemingly blank piece of paper.");
	Item brokenShotgun = new Item("Broken Shotgun", "an old, rusty shogtun", "Too dangerous to use as a weapon."
			+ "\nPerhaps you could use this for something else...");
	Item blueGemstone = new Item("Blue Gemstone", "a beautiful blue gemstone", "A suspicious gemstone you found. Perhaps it can be used for something?");
	Item redGemstone = new Item("Red Gemstone", "a beautiful red gemstone", "A suspicious gemstone you found. Perhaps it can be used for something?");
	Item yellowGemstone = new Item("Yellow Gemstone", "a beautiful yellow gemstone", "A suspicious gemstone you founud. Perhaps it can be used for someting?");
	Item jBox1 = new Item("Jewelry Box", "a small jewelry box", "There is something inside! But how do you open this?");
	Item jBox2 = new Item("Jewelry Box", "a small jewelry box", "There is something inside! But how do you open this?");
	Item jBox3 = new Item("Jewelry Box", "a small jewelry box", "There is something inside! But how do you open this?");
	Item mMusic = new Item("Missing music", "pages of a musical score", "A portion of Beethoven's Moonlight Sonata. But where's the rest of it?");
	Item musicMP = new Item("Music, mid-Pages", "pages of a musical score", "A portion of Beethoven's Moonlight Sonata. But where's the rest of it?");
	Item mSonata = new Item("Moonlight Sonata", "a complete musical score", "The complete Beethoven's Moonlight Sonata. Perhaps you could use this for something?");
	Item emblem = new Item("Emblem", "a large wooden emblem", "A wooden relief featturing the Spencer Family coat of arms. It looks like it's used for someting...");
	Item goldEmblem = new Item("Gold Emblem", "a large gold emblem", "A gold relief featuring the Spencer Family coat of arms. It looks like it's used for something...");
	Item fishhook = new Item("Fish hook", "a small fish hook", "What's a hook without a lure? There has to be one somewhere nearby...");
	Item lure = new Item("Lure Without a Hook", "a lure in the shape of a bee", "A Bee-shape fishing lure, mishing its hook.");
	Item bLure = new Item("Lure of a Bee", "A bee fishing lure, with hook", "The lure has been complete. Now to find a place for it...");
	Item beeSpecimen = new Item("Bee Specimen", "a giant preserved bee", "It's a giant bee specimen for mounting. It's well preserved.");
	Item windCrest = new Item("Wind Crest", "An icon depicting wind", "A small, hexagonal icon depicting Wind. You found it in an alcove behind the insect specimens."
			+ "\nPerhaps this can be used somewhere...");
	Item maskNoEyes = new Item("Mask without Eyes", "eyeless mask", "A creepy death mask. It's missing its eyes...");
	Item maskNoNose = new Item("Mask without a nose", "noseless mask", "A creepy death mask. It's missing its nose...");
	Item maskNoMouth = new Item("Mask without a mouth", "mouthless mask", "A creepy death mask. It's missing its mouth...");
	Item maskNoENM = new Item("Mask without eyes, nose, or mouth", "noseless, eyeless, mouthless mask", "A creepy death mask. It's missing its eyes, nose, and mouth...");
	Item smObject = new Item("Stone and Metal Object", "a small, heavy emblem", "A stone object with a metal interior, featuring the Spencer Family coat of arms."
			+ "\nIt seems it may be able to be placed somewhere...");
	Item moonCrest = new Item("Moon Crest", "an icon depciting a moon", "A small, hexagonal icon depicing a crescent moon. Perhaps it can be placed somewhere...");
	Item starCrest = new Item("Star Crest", "an icon depciting a star", "A small, hexagonal icon depicing a five-pointed star. Perhaps it can be placed somewhere...");
	Item sunCrest = new Item("Sun Crest", "an icon depciting a sun", "A small, hexagonal icon depicing the sun. Perhaps it can be placed somewhere...");
	Item squareCrank = new Item("Square Crank", "an s-shaped hand crank", "A hand crank with a square-tipped end. Perhaps it can be used to turn something...");
	Item insectSpray = new Item("Insecticide Spray", "insect killer" ,"An antique aerosol sprayer filled with insecticide.");
	Item unprintBook = new Item("Unprinted Book", "A strange, blank book", "An eerie, blank book. There seems to be an incomplete picture on the spine.");
	Item emptyBottle = new Item("Empty Bottle", "a glass bottle", "An empty glass bottle, use for holding various chemicals.");
	Item water = new Item("Water", "a bottle filled with water", "You filled this bottle with a small amount of water.");
	Item umb3 = new Item("UMB No. 3", "a bottle filled with chemical UMB No. 3", "You filled this bottle with the chemical UMB No. 3.");
	Item np4 = new Item("NP-004", "a bottle filled with chemical NP-004", "You filled this bottle with the chemical NP-004");
	Item yellow6 = new Item("Yellow-6", "a bottle filled wich chemical Yellow-6", "You filled this bottle with the chemical Yellow-6");
	Item umb7 = new Item("UMB No. 7", "a bottle filled with chemical UMB No.7", "You filled this bottle with the chemical UMB No.7");
	Item umb10 = new Item("UMB No. 10", "a bottle filled with chemical UMB No. 10", "You filled this bottle with the chemical UMB No. 10");
	Item vp017 = new Item("VP-017", "a bottle filled with chemical VP-017", "You filled this bottle with the chemical VP-017");
	Item vjolt = new Item("V-JOLT", "a bottle filled with chemical V-JOLT", "Through  your hard work, you've created the chemical V-JOLT."
			+ "\nYou now consider yourself an expert on chemical mixing!");
	Item metalObject = new Item("Metal Object", "a octagonal metal object", "A metal object featuring the Spencer Family coat of arms."
			+ "\nThis may be related to the Stone and Metal Object you found earlier...");
	Item moDisk = new Item("MO Disk", "a thin plastic case with an important disk", "A very important CD used to store computer passwords."
			+ "\nThis is a very important item!");
	Item broach = new Item("Broach", "a fancy broach", "a broach emblazoned with the Spencer Family coat of arms."
			+ "\nThere's something suspicous about it...");
	Item lBookV1 = new Item("Last Book Vol. 1", "a large, red book", "'Eagle of South, Wolf of North' is the title."
			+ "\nIt is suspiciously light for such a big book...");
	Item lBookV2 = new Item("Last Book Vol. 2", "a large, blue book", "'Eagle of South, Wolf of North' is the title."
			+ "\nIt is suspiciously light for such a big book...");
	Item eagleMedal = new Item("Medal of Eagle", "a round, gold medal", "A gold medal engraved with an eagle. Perhaps you can put it somewhere?");
	Item wolfMedal = new Item("Medal of Wolf", "a round, silver medal", "a silver medal engraved with a wolf. Perhaps you can put it somewhere?");
	Item battery = new Item("Hexagonal Crank", "an s-shaped hand crank", "A hand crank with a hexagonal-tipped end. Perhaps it can be used to turn something...");
	Item Cylinder = new Item("Cylinder", "a metal cylinder with symbols etched on it", "A strange, metal cylinder. You can combine it with something...");
	Item shaft = new Item("Shaft", "a metal shaft with symbols etched on it", "A strange, metla shaft. You can combine it with something...");
	Item cylinderShaft = new Item("Cylinder Shaft", "a cylinder-shaped cypher", "The completed cylinder cypher."
			+ "\nThere are symbols that look like Roman Numerals etched onto the side."
			+ "\nIf you align them correctly, perhaps you can discover a code...");
	Item brokenFlamethrower = new Item("Broken Flamethrower", "a broken flamethrower", "A broken flamethrower. It's too dangerous to use as a weapon."
			+ "\nPerhaps you can place it somewhere?");
	Item stoneRing = new Item("Stone Ring", "a large, octagonal stone ring", "An eight-sided stone ring. Perhaps it can be combined with something...");
	Item clarkRay = new Item("X-Ray of Clark", "a man's x-ray", "The x-ray belongs to 'Clark, David.' It seems useless, but...");
	Item gailRay = new Item("X-Ray of Gail", "a woman's x-ray", "The x-ray belongs to 'Gail, Holland'. It seems useless, but...");
	Item slideFilter = new Item("Slide Filter", "a roll of projector slides", "A reel of slides that are used slide projectors."
			+ "\nIt seems useless, but...");
	Item fscEmpty = new Item("Fuel Supply Capsule (Empty)", "a fuel supply capsule", "A special canister designed for holding a nitro compound."
			+ "\nIt is currently empty.");
	Item fsc = new Item("Fuel Supply Capsule (Full)", "a fuel supply capsule", "A special canister designed for holding a nitro compound."
			+ "\nYou filled it with fuel.");
	Item fuseUnit = new Item("Fuse Unit", "a large fuse assembly", "A set of fuses used for large machinery.");
	Item signalRocket = new Item("Signal Rockets","a large case of signal rockets", "Emergency Signaling Rockets."
			+ "\nYou can use these to signal fellow S.T.A.R.S. office Brad Vickers in his Helicopter!");
	
	//Weapons
	Item survivalKnife = new Item("Survival Knife", "a survival knife", "A mid-sized, lightweight survival knife."
			+ "\nMostly useful for close encounters, but against zombies, it's never been tested.");
	Item handgun = new Item("'Samurai Edge' 9mm Handgun", "handgun", "A highly customized, top-of-the-line handgun issued for S.T.A.R.S. officers."
			+ "\nFires 9mm Handgun bullets. Great for your standard zombie.");
	Item infHandgun = new Item("'Samurai Edge' .40 Handgun", "magnum pistol", "A highly customized, top-of-the-line handgun issued for S.T.A.R.S. officers."
			+ "\nUnlike the normal Samurai Edge, this version is chambered for Smith and Wesson .40 calibur Magnum rounds."
			+ "\nA reward for completeing the game, it has unlimited ammunition. Have fun!");
	Item dagger = new Item("Dagger", "a light dagger", "A light, old-fashioned, medeival dagger."
			+ "\nIt can't be used like your Survival Knife, but you can use it to escape a zombie's grasp.");
	Item flashgrenade = new Item("Flash Grenade", "a flash grenade", "Sometimes called a 'Flash Bang' for the effects it causes."
			+ "\nYou can use it to temporarily stun zombies!");
	Item stunGun = new Item("Stun Gun", "a handheld taser", "A taser that can be used to stun a zombie that grabs you."
			+ "\nRequires battery packs to use.");
	Item shotgun = new Item("12 gauge Shotgun", "a pump-action shotgun", "Old-fashioned pump-action shotgun, chambered in 12 gauge shotgun shells. Holds 6 rounds.");
	Item assaultShotgun = new Item("Advanced Shotgun", "a semi-automatic shotgun", "An advanced semi-auto shotgun, featuring faster fire rate and faster reload."
			+ "\nChambered in 12 gauge shotgun shells. Holds 10 shells.");
	Item grenadeLauncher = new Item("Grenade Launcher", "a grenade launcher", "A grenade launcher you found next to Forest Spayer's body."
			+ "\nCan fire grenade shells, acid shells, and incindeary shells. Holds 6 shells.");
	Item sdGun = new Item("Self Defense Gun", "a small, pocket pistol", "A small, double-barreled pocket pistol that fires .22 Magnum rounds."
			+ "\nOne shot has been fired already.");
	Item magnum = new Item("Magnum Revolver", "a powerful revovler", "A powerful, big frame revovler chambered in .44 Magnum rounds."
			+ "\nGuaranteed to kill zombies in a single shot! However, magnum rounds are rare, so use wisely!");
	Item rocketLauncher = new Item("M202 FLASH", "a four-barreled rocket launcher", "A powerful rocket launcher dropped by Brad Vickers."
			+ "\nThe only weapon powerful enough to kill the Tyrant!");
	Item sbRocketLauncher = new Item("Rocket Launcher", "a rocket launcher", "A powerful, experimental rocket launcher. Has infinite ammo."
			+ "\nA reward for completing the game. Have fun!");
	
	//Ammunition
	Item handgunMagazine = new Item("Handgun Magazine", "a fifteen round handgun mazagine", "A magazine for your handgun. Holds 15 9mm rounds.");
	Item shotgunShells = new Item("Shotgun Shells", "a container of shotgun shells", "A container of six 12 gauge shotgun shells. Very powerful at close range.");
	Item grenadeShells = new Item("Grenade Shells", "A container of explosive shells", "A container of six grenade shells. Most common type. Effective against Hunters and Chimeras.");
	Item acidShells = new Item("Acid Shells", "A container of corrosive acid shells", "A container of six Acid Shells. The Rarest and most powerful type. Effective against Yawn and the Tyrant.");
	Item flameShells = new Item("Incindiary Shells", "A container of incindiary shells", "A container of six Incindiary shells. Effective against Zombies."
			+ "\nUse these shells to prevent zombies from becoming Crimson Heads by burning them to ash.");
	Item magnumRounds = new Item("Magnum rounds", "a cylinder with magnum rounds", "Powerful bullets for the Magnum Revovler. Rare, so spend wisely!");
	Item batteryPack = new Item("Battery Pack", "a small battery", "Battery Packs for your taser. Good for one charge.");
	
	public static Room[] getRooms() {
		return rooms;
	}
	
	public static Room getStartingRoom() {
		return startingRoom;
	}
}
