package animal.bird;
import java.util.concurrent.ThreadLocalRandom;
public class Penguin extends Bird{
    private String sound;
    public String getSpecies(){
	return "Penguin";
    }
    
    public String speak(){
	return this.sound;
    }
    public boolean canFly(){
	return false;
    }
    public boolean canSwim(){
	return true;
    }
    public Penguin (String name){
	super(name);
	this.diet = Diet.CARNIVORE;
	this.weight = ThreadLocalRandom.current().nextInt(2, 88);
	this.sound = "HONK";
    }
}
