public class App {
    public static void main(String[] args) throws Exception {
       

       //objects
        Person Me = new Person("Kyla", 19);

        Person Friend = new Person("James",21);
        
        Pet Dog = new Pet("Kitty", 5, Me);

        Person classmate1 = new Person("Eiron", 19);
        Person classmate2 = new Person("Kent", 18);
        Person classmate3 = new Person("Migs", 19);

        Car CAR = new Car("SUV","Mitsubishi","Montero Sport", Me);

        //methodCall
        Me.AddFriend(Friend);        
        Dog.showOwner();

        Me.AddClassmate(classmate1);
        Me.AddClassmate(classmate2);
        Me.AddClassmate(classmate3);

        CAR.showOwner();
    }
}

   //aggregation- objects me, friend, and classmates1,2,3 are independent
   //composition- pet and Car object is dependet to person object
  
