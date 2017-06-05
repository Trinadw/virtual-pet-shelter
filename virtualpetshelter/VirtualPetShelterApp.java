package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter petShelter = new VirtualPetShelter();// virtual pet
																// shelter
																// object
		// create pet
		VirtualPet albie = new VirtualPet("Albie", 76, 56, 85, "happy");
		VirtualPet lewis = new VirtualPet("Lewis", 55, 65, 88, "nervous");
		VirtualPet jax = new VirtualPet("Jax", 66, 77, 84, "shy");
		VirtualPet gonzo = new VirtualPet("Gonzo", 88, 69, 59, "aggressive");
		// adding the pets to the map
		petShelter.intakePets("Albie", albie);
		petShelter.intakePets("Lewis", lewis);
		petShelter.intakePets("Jax", jax);
		petShelter.intakePets("Gonzo", gonzo);
		// beginning the game;

		writeLine(
				"Welcome to John's Virtual Pet Shelter. This is the status of our pets: \nName \tHunger \tThirst \tBoredom"
						+ albie + lewis + jax + gonzo);
		boolean begin = false;
		while (!begin) {//will allow the game to continue until the user selects quit
			writeLine(
					"What would you like to do next? \n1. Feed the pets \n2. Water the pets \n3. Play with a pet \n4. Adopt a pet \n5. Admit a pet \n6. Quit");
			int toDo = input.nextInt();
			input.nextLine();
			switch (toDo) {
			case 1:
				petShelter.feedPets();//feeds all pets
				writeLine("The pets appreciate the grub!");
				break;
			case 2:
				petShelter.waterPets();//waters all the pets
				writeLine("The pets were parched, thanks!");
				break;
			case 3:
				writeLine("Which of our pets would you like to play with?");
				for (VirtualPet somePet : petShelter.pets()) {
					writeLine(somePet.name + " is " + somePet.description);//provides name and description for all pets in shelter
				}
				String playName = input.nextLine();
				VirtualPet tempPlay = petShelter.getPets(playName);//gets the pet for the user to play with
				petShelter.playWith(tempPlay);//adjusts pets boredom level
				writeLine(playName + " will adore playing with you.");
				break;
			case 4:
				writeLine("Which of our pets would you like to take home with you?");
				for (VirtualPet petAdopt : petShelter.pets()) {
					writeLine(petAdopt.name + " is " + petAdopt.description);//provides name and description for all pets in shelter
				}
				String adoptName = input.nextLine();
				VirtualPet tempAdopt = petShelter.getPets(adoptName);//gets the pet for the user to adopt
				petShelter.adoptPet(tempAdopt);//removes pet from map
				writeLine("Thank you for adopting " + adoptName + ". We know you will be pleased with your selection.");

				break;
			case 5:// admit a pet
				writeLine("Please provide us with the pet's name:");
				String getPetName = input.nextLine();
				writeLine("Please provide us with a one word description of the pet's demeanor:");
				String getPetDescription = input.next();
				VirtualPet admitPets = new VirtualPet(getPetName, getPetDescription);//creates new virtual pet with user input for name and description
				petShelter.intakePets(getPetName, admitPets);//adds the pet to the shelter map
				break;
			case 6:
				writeLine("Wish you could stay longer. Enjoy your day.");
				System.exit(0);//allows the user to end the game
			}
			petShelter.tickShelter();//adjust all care levels in the shelter
			System.out.println(petShelter.petMap);//prints shelter map
		}

	}

	public static void writeLine(String message) {
		System.out.println(message);
	}

}
