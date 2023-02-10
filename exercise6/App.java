public class App {
    public static void main(String[] args) throws Exception {
        
        //polymorphic variable
        //grocery item object 1
        Groceryitem item1 = new Diaper();
        item1.name = "Huggies";
        item1.price = 200;
        item1.showItemName();

        //grocery item object 2
        Groceryitem item2 = new Noodle();
        item2.name = "Lucky Me Pancit Canton";
        item2.price = 16;
        item2.showItemName();

        //cashier object
        Cashier c1 = new Cashier();

        //method call
        //polymorphic parameter
        c1.checkOut(item1);
        c1.checkOut(item2);

        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        //polymorphic array
        //used to call names for multiple items
        Groceryitem[] itemArray = new Groceryitem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        int total = 0;

        for (int i = 0; i < itemArray.length; i++){
            //to show name
            itemArray[i].showItemName();
            //to show price
            System.out.println(itemArray[i].price);
            //to show total price
            total += itemArray[i].price;
        }
        System.out.println("Total price of items: " + total);
    

        //cat object

        Cat mycat = new Cat();
        mycat.eat();
    }
}
