import animal.*;
import java.util.ArrayList;
public class Zoo{
    private ArrayList<Animal> animalLedger;
    /**
     * Returns a copy of the underlying ArrayList
     * @return copy of the animals ArrayList
     */
    public ArrayList<Animal> getLedgerCopy(){
        return new ArrayList<Animal>(this.animalLedger);
    }

    
     /* Adds an Animal to the animals list 
     *@param givenAnimal Animal to be added to the animals list
     *@return whether the animal was added to the list or not
     */
    public boolean addAnimal(Animal givenAnimal){
	if( hasUniqueName(givenAnimal.getName())){
		return animalLedger.add(givenAnimal);
	}
	return false;
    }

    private boolean hasUniqueName(String name){
	
	for(int i = 0; i < animalLedger.size(); i++){
		if((name.equals(animalLedger.get(i).getName()))) return false;
	}

	return true;
    }

    /**
     * Takes an array of Animals and adds each one to the animals list
     *@param animalArr a simple Array of type Animal containing Animals to be added to the animals list 
     *@return whether all of the animals were added to the list or not
     */
    public boolean addAnimal(Animal[] animalArr){
	    boolean returnVar = true;
	    for(int i = 0; i < animalArr.length; i ++){
		    if(!addAnimal(animalArr[i])){
			    returnVar = false;
		    }
	    }
	    return returnVar;


    }

     /**TODO:
     * Adds the total weight of the Zoo 
     *@return the weight of the animals in the Zoo
     */
      public int totalWeight(){
         int total = 0;
         for( int i = 0; i < animalLedger.size(); i++){
		total += animalLedger.get(i).getWeight();
	 }
      	return total;
       }
    

     /**
     * Adds the total number of legs in the Zoo 
     *@return the number of legs in the Zoo
     */
      public int totalLegs(){
          int total = 0;
         for( int i = 0; i < animalLedger.size(); i++){
		total += animalLedger.get(i).numLegs();
	 }
      	return total;
       }

    
    
    /**
     * Constructs a Zoo object with a given ArrayList of Animals
     *@param givenAnimals an ArrayList of Animal types
     */
    public Zoo(ArrayList<Animal> givenAnimals){
	this.animalLedger = new ArrayList<Animal>(givenAnimals);
    }
    /**
     *Constructs a Zoo object with an initial Animal
     *@param singleAnimal an initial Animal to put in the Zoo
     */
    public Zoo(Animal singleAnimal){
	this.animalLedger = new ArrayList<Animal>();
	this.animalLedger.add(singleAnimal);
    }
    /**
     *Constructs an empty Zoo object with an empty ArrayList of Animals
     */
    public Zoo(){
	this.animalLedger = new ArrayList<Animal>();
    }

}
