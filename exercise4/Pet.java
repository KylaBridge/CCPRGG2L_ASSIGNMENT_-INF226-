public class Pet {
    int age;
    String name;
    Person owner;

    //constructor(className(parameters))
    Pet(String PetName, int PetAge, Person ownerName){
        this.age = PetAge;
        this.name = PetName;
        this.owner = ownerName; 
}
    //method to show owner
     void showOwner(){
        System.out.println("My name is " + this.name + ". My owner name is " + owner.name);
    }
}