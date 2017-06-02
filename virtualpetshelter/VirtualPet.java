package virtualpetshelter;
import java.util.Random;

public class VirtualPet {
	Random num = new Random ();
	String name;
	//starting variables for my pet
	int hunger = 37;
	int thirst = 34;
	int energy = 49;
	
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
		return energy;
	}
// used to determine Jax behavior
	boolean isTired() {
		return energy <= 30;
	}
// user chooses to feed Jax
	void feed() {
		hunger = hunger - 10;
		thirst = thirst + 10;
		energy = energy - 8;
	}
//user chooses to water Jax
	void water() {
		thirst = thirst - 10;
		energy = energy - 7;
	}
// user puts Jax to bed
	void bed() {
		energy = energy + 10;
		hunger = hunger + 10;
		thirst = thirst + 10;
	}
// tick to decrement hunger, thirst, & energy
	void tick() {
		hunger = hunger + num.nextInt(11);
		thirst = thirst + num.nextInt(7);
		energy = energy - num.nextInt(10);

	}
// Jax self actions
	void stealBanana() {
		hunger = hunger - 3;
		
	}

	void toiletDrinker() {
		thirst = thirst - 2;
		
	}
	void actOut(){
		energy = energy - 5;
	}

}
