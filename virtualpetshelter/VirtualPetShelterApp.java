package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter everyPet = new VirtualPetShelter();

		// pet name, levels and description
		VirtualPet albie = new VirtualPet("Albie", 46, 56, 77, "happy");
		VirtualPet lewis = new VirtualPet("Lewis", 55, 65, 54, "nervous");
		VirtualPet jax = new VirtualPet("Jax", 43, 65, 32, "shy");
		VirtualPet gonzo = new VirtualPet("Gonzo", 55, 47, 78, "aggressive");
		// parameters for name and description to be used when adopting and
		// playing
		VirtualPet paramsAlbie = new VirtualPet("Albie", "happy");
		VirtualPet paramsLewis = new VirtualPet("Lewis", "nervous");
		VirtualPet paramsJax = new VirtualPet("Jax", "shy");
		VirtualPet paramsGonzo = new VirtualPet("Gonzo", "aggressive");

		// map intake of pets
		everyPet.intakePets("Albie", albie);
		everyPet.intakePets("Lewis", lewis);
		everyPet.intakePets("Jax", jax);
		everyPet.intakePets("Gonzo", gonzo);

		writeLine(
				"Welcome to John's Virtual Pet Shelter. This is the status of our pets: \nName \tHunger \tThirst \tBoredom"
						+ albie + lewis + jax + gonzo + "\nWhat would you like to do next?");
do {
		writeLine(
				"1. Feed the pets \n2. Water the pets \n3. Play with a pet \n4. Adopt a pet \n5. Admit a pet \n6. Quit");
		int toDo = input.nextInt();
		switch (toDo) {
		case 1:
			everyPet.feedPets();
			writeLine("The pets appreciate the grub!");
			break;
		case 2:
			everyPet.waterPets();
			writeLine("The pets were parched, thanks!");
			break;
		case 3://play with
			writeLine("Which pet would you like to play with?");
			for(VirtualPet somePet : everyPet.pets() ) {
			writeLine(somePet.name + " is "+somePet.description);
		}
			String playPet = input.next();
			VirtualPet p=everyPet.getPets(playPet);
			everyPet.playWith(p);
			String petPlay = input.nextLine();
			writeLine("Needs work play with");
					
			break;
		case 4:
			
			writeLine("Which pet would you like to adopt?\n " + paramsAlbie + "\n" + paramsLewis + "\n" + paramsJax
					+ "\n" + paramsGonzo);//do this with an enhanced for loop to print the name and description.
			
			String myPet = input.nextLine();
			VirtualPet x=everyPet.getPets(myPet);
			everyPet.adoptPets(x);
			break;
			case 5:
	writeLine("Please provide us with the pet's name:");
		 String getPetName = input.next();
		 writeLine("Please provide the pets description (nervous, sad, jumpy, playful).");
		 
		 String getPetDesc= input.next();
		 everyPet.getPets(getPetDesc);// admit a pet.
		 break;
		case 6:
			writeLine("Goodbye!");
			System.exit(0);
			
				}}
		while(4<7);	
	

	}

	public static void writeLine(String message) {
		System.out.println(message);

	}
}
