package virtualpetshelter;
import java.util.Random;

public class VirtualPet {//this is for the individual pets
	Random num = new Random();
	String name;
	// variables for my pet
	int hunger;
	int thirst;
	int boredom;
	String description;

	// holds the pest hunger level
	int getHunger() {
		return hunger;
	}

	int getThirst() {
		return thirst;
	}

	int getBoredom() {
		return boredom;
	}

	void feed() {
		hunger = hunger - 10;
	}

	void water() {
		thirst = thirst - 10;
	}

	void play() {
		boredom = boredom - 10;
	}

	void tick() {
		hunger += num.nextInt(5);
		thirst += num.nextInt(5);
		boredom += num.nextInt(5);
	}

	//public int feedpet(){
		//hunger = hunger -10;
		//return hunger;
	//	}

		//public int waterpet(){
			//thirst = thirst -10;
			//return thirst;
	//	}
		//public void boredomPet(){
		//	boredom=boredom-5;
		//}
	
	public VirtualPet(String nameParam, int hungerParam, int thirstParam, int boredomParam, String descriptionParam) {
		name = nameParam;
		hunger = hungerParam;
		thirst = thirstParam;
		boredom = boredomParam;
		description = descriptionParam;

	}

	public VirtualPet(String nameParam, String descriptionParam) {
		name = nameParam;
		description = descriptionParam;
	}

	public String pet() {
		return name + description;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t" + hunger + "\t" + thirst + "\t" + boredom;
	}
}
