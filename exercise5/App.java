public class App {
    public static void main(String[] args) throws Exception {
        
        Person me = new Person();

        //set method()
        me.setName("Kyla");

        //get method()
        System.out.println(me.getName());

        //dauther object
        Daughter myself = new Daughter();

        System.out.println(myself.surname);

        //show surname method call
        myself.showSurname();
    }
}
