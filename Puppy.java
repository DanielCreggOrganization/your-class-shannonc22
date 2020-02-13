/**
 * Puppy
 */
public class Puppy {

    //Instance variables
    String name;
    int age;
    String breed;

    Puppy(){
        name = "Richard";
    }

    
    Puppy(String newName){
        name = newName;
    }

    //Parameterised constructor
    Puppy(String newName, int newAge, String newBreed){
        name = newName;
        age = newAge;
        breed = newBreed;
    }
}