package virtualpetshelter;
import java.util.Random;

public class VirtualPet {//this is for the individual pets
	Random num = new Random ();
	String name;
	//variables for my pet
	int hunger;
	int thirst;
	int boredom;
	String description;
	
	
	
	
	
	//holds the pest hunger level
	int getHunger()  {
		return hunger;
	}
	//used to determine if Jax feeds herself
	boolean isHungry()  {
		return hunger >= 45;
	}
// holds thirst level
	int getThirst() {
		return thirst;
	}
	
	// used to determine if Jax takes a drink
	boolean isThirsty() {
		return thirst >= 38;
	}
// holds energy level
	int getEnergy() {
		return boredom;
	}
// used to determine Jax behavior
	boolean isTired() {
		return boredom <= 30;
	}
// user chooses to feed Jax
	void feed() {
		hunger = hunger - 10;
		thirst = thirst + 10;
		boredom = boredom - 8;
		
	}
//user chooses to water Jax
	void water() {
		thirst = thirst - 10;
		boredom = boredom - 7;
	}
// user puts Jax to bed
	void bed() {
		boredom = boredom + 10;
		hunger = hunger + 10;
		thirst = thirst + 10;
	}
// tick to decrement hunger, thirst, & energy
	void tick() {
		hunger = hunger + num.nextInt(11);
		thirst = thirst + num.nextInt(7);
		boredom = boredom - num.nextInt(10);

	}
// Jax self actions
	void stealBanana() {
		hunger = hunger - 3;
		
	}

	void toiletDrinker() {
		thirst = thirst - 2;
		
	}
	void actOut(){
		boredom = boredom - 5;
	}
public VirtualPet(String nameParam, int hungerParam, int thirstParam, int boredomParam, String descriptionParam){
	name=nameParam;
	hunger=hungerParam;
	thirst = thirstParam;
	boredom=boredomParam;
	description=descriptionParam;
	
	
}
public VirtualPet(String nameParams, String descriptionParams){
name=nameParams;
description=descriptionParams;

}

public int feedpet(){
hunger = hunger -10;
return hunger;
}

public int waterpet(){
	thirst = thirst -10;
	return thirst;
}
public void boredomPet(){
	boredom=boredom-5;
	
}
	public String pet(){
		return name+description;
		
	}


@Override
public String toString(){
	return "\n" +name + "\t"+ hunger + "\t"+ thirst + "\t" + boredom;}
	
}


