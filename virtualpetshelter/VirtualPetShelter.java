package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class VirtualPetShelter {

	Random num = new Random();

	Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

	List<String> pets = new ArrayList<String>();

	// add the pets
	void intakePets(String name, VirtualPet pet) {
		allPets.put(name, pet);

	}

	// returns a collection of the pets
	public Collection<VirtualPet> pets() {
		return allPets.values();
	}

	// this feed all of the pets

	void feedPets() {
		for (VirtualPet currentPet : allPets.values()) {
			currentPet.feed();
		}
	}

	// returns pet info when I have name
	VirtualPet getPets(String name) {
		return allPets.get(name);

	}

	void waterPets() {
		for (VirtualPet currentPet : allPets.values()) {
			currentPet.water();
		}
	}

	void adoptPets(VirtualPet pet) {
		allPets.remove(pet);
	}

	void intake(VirtualPet pet) {
		 allPets.put(pet.name, pet);

	}

	void playWith(VirtualPet d) {// decreases the pets boredom
d.boredomPet();
	}

	{

		for (

		VirtualPet t : allPets.values()) {
			t.tick();
		}

		// get pets
		// feed pets
		// water pets
		// adopt pets
		// play with pets

	}
}
