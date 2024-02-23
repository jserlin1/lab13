/*"import" tells java to look in the ./animal/ directory and grab every .java file in there
                                     ./animal/mammal/ directory and grabe every .java file in there
   When you add more animal class types you'll need to import their packages as well
*/
import animal.*;
import animal.mammal.*;
import animal.fish.*;
import animal.bird.*;
import animal.reptile.*;

public class Driver{
    public static void stats(Animal a){
        String output = "";
	output += a.getName() + " is a " + a.getSpecies() + " and they say, \"" + a.speak()  + "!\"" + "\n";
	output += "\t INFO:\n";
	output += "\t\t Class -- " + a.getAnimalClass() + "\n";
	output += "\t\t Weight -- " + a.getWeight() + " lbs\n";
	output += "\t\t Diet -- " + a.eat() + "\n";
	output += "\t\t Legs -- " + a.numLegs() + "\n";
	output += "\t\t Breathes -- " + a.breathe() + "\n";
	output += "\t\t Can Fly -- " + a.canFly() + "\n";
	output += "\t\t Can Swim -- " + a.canSwim() + "\n";
	System.out.println(output);
    }

    public static void stats(Zoo z){
	//TODO: Uncomment the last two output lines when totalLegs and totalWeight are implemented
        String output = "Zoo stats: \n";
	output += "\t # Animals -- " + z.getLedgerCopy().size() + "\n";
	//output += "\t # Legs -- " + z.totalLegs() + "\n";
	//output += "\t Total Weight -- " + a.totalWeight() + " lbs\n";
	System.out.println(output);
    }

    public static void main(String[] args){
	//The below demonstrates the output for the program.
	//I will use my own Driver to test your code. - JR
	Zoo myZoo = new Zoo();
	Lion [] ls = new Lion [3]; 
        ls[0] = new Lion("Mark");
	ls[1] = new Lion("Mark");
	ls[2] = new Lion("Joe");
	stats(ls[0]);
	stats(ls[1]);
	stats(ls[2]);
	myZoo.addAnimal(ls);
	stats(myZoo);
	System.out.println("total legs :"+ Integer.toString(myZoo.totalLegs()));
	System.out.println("total weight :"+ Integer.toString(myZoo.totalWeight()));
	Lion l1 = new Lion("lion man");
	Giraffe g1 = new Giraffe("giraffe man");
	Snake s1 = new Snake("snake man");
	Iguana i1 = new Iguana("iguana man");
	Parrot p1 = new Parrot("parrot man");
	Penguin b1 = new Penguin("bird man");
	Eel e1 = new Eel("Eel mister");
	Clownfish c1 = new Clownfish("Clownfish mister");
	Animal [] aLs = new Animal[8];
	aLs[0] = l1;
	aLs[1] = g1;
	aLs[2] = s1;
	aLs[3] = i1;
	aLs[4] = p1;
	aLs[5] = b1;
	aLs[6] = e1;
	aLs[7] = c1;
	for(int i = 0; i < aLs.length; i ++){
		stats(aLs[i]);
	}
    }
}
