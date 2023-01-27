public class Car {
    String brand;
    String name;
    String carType;
    Person owner;

        //constructor(className(parameters))
        Car(String type, String brandName, String carName, Person ownerName){
            this.brand = brandName;
            this.name = carName;
            this.carType =type;
            this.owner = ownerName;
       }

        //method to show owner
        void showOwner(){

             System.out.println("This " + this.carType + " " + this.brand + " " + this.name + " is owned by " + owner.name);

              }  
}
