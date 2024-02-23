package animal.fish;
import java.util.concurrent.ThreadLocalRandom;
public class Clownfish extends Fish{
    private String sound;
    public String getSpecies(){
	return this.species;
    }
    public String speak(){
	return this.sound;
    }
    public Clownfish(String name){
	super(name);
	this.species = "Clownfish";
	this.diet = Diet.OMNIVORE;
	this.weight = 1;
	this.sound = "blubblub";
    }
}
