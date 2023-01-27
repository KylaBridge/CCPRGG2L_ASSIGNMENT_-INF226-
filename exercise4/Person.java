public class Person {
    String name;
    int age;

    //constructor(className(parameters))
    Person(String PersonName, int PersonAge){
        this.age = PersonAge;
        this.name = PersonName;
        
    }

    //method to show friend
    void AddFriend(Person friend){
          System.out.println(this.name + " is friends with " + friend.name);
    }
    
    void AddClassmate(Person classmate){
       System.out.println("I am classmates with " + classmate.name);
    }
}
