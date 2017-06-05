package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class VirtualPetShelter {
	Map<String, VirtualPet> petMap = new HashMap<String, VirtualPet>();

	List<String> petList = new ArrayList<String>();
	
	//method to add pets
	public void intakePets(String name, VirtualPet pet){
		petMap.put(pet.name, pet);
	}
	//returns a collection of pets
	public Collection<VirtualPet>pets(){
		return petMap.values();
		
	}
	//feed all the pets in shelter
	public void feedPets(){
		for(VirtualPet currentPet:petMap.values()){
			currentPet.feed();
		}}
	//water all the pets in the shelter
		public void waterPets(){
			for(VirtualPet currentPet:petMap.values()){
				currentPet.water();
			}}//play with a pet
		public void playWith(VirtualPet petName){
			petName.play();
		}
		//get pets based on their name
		public VirtualPet getPets(String name){
			return petMap.get(name);
		}
		//method to remove pets when they are adopted
		public void adoptPet(VirtualPet pet){
			petMap.remove(pet);
			
		}
		//tick to affect all pets in shelter
		public void tickShelter(){
			for(VirtualPet newTick:petMap.values()){
				newTick.tick();
			}
		}}
	
	




	