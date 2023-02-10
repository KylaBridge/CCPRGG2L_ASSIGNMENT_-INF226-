public class Cashier {
    
    //check out method
    void checkOut(Groceryitem item){
          System.out.println("You have purchased " + item.name);
    }

   //show price method
    void showItemPrice(Groceryitem item){
        System.out.println(item.name + " is worth " + item.price + " pesos ");
    }

    
}
