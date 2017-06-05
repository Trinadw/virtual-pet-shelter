package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelterPets = new VirtualPetShelter();

		// pet name, levels and description
		VirtualPet albie = new VirtualPet("Albie", 46, 56, 77, "happy");
		VirtualPet lewis = new VirtualPet("Lewis", 55, 65, 54, "nervous");
		VirtualPet jax = new VirtualPet("Jax", 43, 65, 32, "shy");
		VirtualPet gonzo = new VirtualPet("Gonzo", 55, 47, 78, "aggressive");
		// parameters for name and description to be used when adopting and
		// playing
		//VirtualPet paramsAlbie = new VirtualPet("Albie", "happy");
		//VirtualPet paramsLewis = new VirtualPet("Lewis", "nervous");
		//VirtualPet paramsJax = new VirtualPet("Jax", "shy");
		//VirtualPet paramsGonzo = new VirtualPet("Gonzo", "aggressive");

		// map intake of pets
		shelterPets.intakePets("Albie", albie);
		shelterPets.intakePets("Lewis", lewis);
		shelterPets.intakePets("Jax", jax);
		shelterPets.intakePets("Gonzo", gonzo);
		System.out.println(shelterPets.pets);
		writeLine(
				"Welcome to John's Virtual Pet Shelter. This is the status of our pets: \nName \tHunger \tThirst \tBoredom"
						+ albie + lewis + jax + gonzo + ".");
		boolean begin=false;
	while(!begin){
			writeLine(
					"What would you like to do next? \n1. Feed the pets \n2. Water the pets \n3. Play with a pet \n4. Adopt a pet \n5. Admit a pet \n6. Quit");
			int toDo = input.nextInt();
			input.nextLine();
			switch (toDo) {
			case 1:
				shelterPets.feedPets();
				writeLine("The pets appreciate the grub!");
				break;
			case 2:
				shelterPets.waterPets();
				writeLine("The pets were parched, thanks!");
				break;
			case 3:// play with a pet
				writeLine("Which pet would you like to play with?");
				for (VirtualPet somePet : shelterPets.pets()) {
					writeLine(somePet.name + " is " + somePet.description);
				}
				String playPet = input.nextLine();
				VirtualPet p = shelterPets.getPets(playPet);
				shelterPets.playWith(p);
				writeLine(playPet.toLowerCase() + " loves to play!");
				break;
			case 4:// adopt a pet

				writeLine("Which pet would you like to adopt?");
				for (VirtualPet petAdopt : shelterPets.pets()) {
					writeLine(petAdopt.name + " is " + petAdopt.description);
				}
				String outPet = input.nextLine();
				VirtualPet x = shelterPets.getPets(outPet);
				shelterPets.adoptPets(x);
				writeLine("Thank you for adopting " + x + ".");

				// System.out.println(shelterPets.listPets);
				break;
			case 5:// admit a pet
				writeLine("Please provide us with the pet's name:");
				String getPetName = input.nextLine().toLowerCase();
				writeLine("Please provide the pets description (nervous, sad, jumpy, playful).");
				String getPetDesc = input.nextLine().toLowerCase();
				shelterPets.getPets(getPetDesc);// admit a pet.
				VirtualPet admitPets = new VirtualPet(getPetName, getPetDesc);
				shelterPets.intake(admitPets);
				// System.out.println(shelterPets.listPets.entrySet);
				break;
			case 6:
				writeLine("Goodbye!");
				System.exit(0);
				break;
			default:
				writeLine("This is not a valid entry.");
				continue;

			}
			shelterPets.tickShelterPets();
			System.out.println(shelterPets.pets);

		} 

	}

	public static void writeLine(String message) {
		System.out.println(message);

	}
}
