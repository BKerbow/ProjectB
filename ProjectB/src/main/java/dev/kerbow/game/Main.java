package dev.kerbow.game;

import java.util.Scanner;

import dev.kerbow.fixtures.Room;

public class Main {

	private static Player player = new Player();
	private static boolean quit;

	private static void printRoom() {
		if (player.getCurrentRoom() != null) {
			System.out.println(player.getCurrentRoom().getName());
			System.out.println();
			System.out.println(player.getCurrentRoom().getLongDescription());
			System.out.println();

			System.out.println("Exits: ");

			for (int i = 0; i < player.getCurrentRoom().getExits().length; i++)
			{
				Room exit = player.getCurrentRoom().getExits()[i];

				if (exit != null) {
					switch(i) {
					case 0: System.out.println("[North]:" + exit.getShortDescription()); break;
					case 1: System.out.println("[South]:" + exit.getShortDescription()); break;
					case 2: System.out.println("[West]:" + exit.getShortDescription()); break;
					case 3: System.out.println("[East]:" + exit.getShortDescription()); break;
					case 4: System.out.println("[Northwest]:" + exit.getShortDescription()); break;
					case 5: System.out.println("[Southwest]:" + exit.getShortDescription()); break;
					case 6: System.out.println("[Northeast]:" + exit.getShortDescription()); break;
					case 7: System.out.println("[Southeast]:" + exit.getShortDescription()); break;
					case 8: System.out.println("[Up]:" + exit.getShortDescription()); break;
					case 9: System.out.println("[Down]:" + exit.getShortDescription()); break;
					}
				}
			}
			System.out.print("> ");
		}
	}


	private static String[] collectInput(Scanner scanner) {
		String[] input = null;

		if (scanner.hasNext()) input = scanner.nextLine().toLowerCase().split(" ");

		return input;
	}

	private static void parse(String[] command){
		if (command == null || command.length == 0) return;

		switch (command[0]) {
		case "north":
		case "south":
		case "east":
		case "west":
		case "northwest":
		case "southwest":
		case "northEast":
		case "southEast":
		case "up":
		case "down":
		case "go":
			//make sure the player types the correct command format: 'go (direction)
			if (command[0].equals("go")) {
				if(command.length == 2) {
					if(player.getCurrentRoom().getExit(command[1]) == null) {
						System.out.println("You cannot go that way!");
						System.out.println("> ");
						break;
					} else {
						player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
						printRoom();
						break;
					}
				} else {
					System.out.println("Where are you going to go?");
					System.out.println("> ");
					break;
				}
			} else {
				Room room = player.getCurrentRoom().getExit(command[0]);
				if(room == null) { //failsafe for an incorrect exit
					System.out.println("You cannot go that way!");
					break;
				} else {
					player.setCurrentRoom(room);
					printRoom();
					break;
				}
			}
		case "quit": quit = true; break;
		case "room": printRoom(); break;
		default:
			System.out.println("I don't understand that command.");
			System.out.print("> ");
			break;
		}
	}

	public static void main(String[] args) {
		RoomManager.init();
		player = new Player(RoomManager.getStartingRoom());
		Scanner scanner = new Scanner(System.in);

		printRoom();
		do {
			parse(collectInput(scanner));
		}while(!quit);

		System.out.println("The Mansion awaits your next visit...");
		scanner.close();
	}
}
