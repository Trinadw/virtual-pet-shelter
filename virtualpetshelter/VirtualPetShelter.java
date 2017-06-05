package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPetShelter {



	Map<String, VirtualPet> listPets = new HashMap<String, VirtualPet>();

	List<String> pets = new ArrayList<String>();

	// add the pets
	void intakePets(String name, VirtualPet pet) {
		listPets.put(name, pet);

	}

	// returns a collection of the pets
	public Collection<VirtualPet> pets() {
		return listPets.values();
	}

	// this feed all of the pets

	void feedPets() {
		for (VirtualPet currentPet : listPets.values()) {
			currentPet.feed();
		}
	}

	// returns pet info when I have name
	VirtualPet getPets(String name) {
		return listPets.get(name);

	}

	void waterPets() {
		for (VirtualPet currentPet : listPets.values()) {
			currentPet.water();
		}
	}

	void adoptPets(VirtualPet pet) {
		listPets.remove(pet);
	}

	void intake(VirtualPet pet) {
		listPets.put(pet.name, pet);

	}

	void playWith(VirtualPet d) {// decreases the pets boredom
		d.boredomPet();
	}

	
		
		public void tickShelterPets(){
			for(VirtualPet newT:listPets.values()){
				newT.tick();
			}
		}
		
		

		// get pets
		// feed pets
		// water pets
		// adopt pets
		// play with pets

	}

