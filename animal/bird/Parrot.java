package animal.bird;
import java.util.concurrent.ThreadLocalRandom;
public class Parrot extends Bird{
    private String sound;
    public String getSpecies(){
	return "Parrot";
    }
    
    public String speak(){
	return this.name + " wants a cracker";
    }
    public boolean canFly(){
	return true;
    }
    public boolean canSwim(){
	return false;
    }
    public Parrot(String name){
	super(name);
	this.diet = Diet.HERBIVORE;
	this.weight = ThreadLocalRandom.current().nextInt(1, 9);
    }
}
