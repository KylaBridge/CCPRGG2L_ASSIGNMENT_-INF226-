import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        learn("Driving");
        scan.close();
    }

    static void learn(String dr) {

        System.out.println("Driving!");
        test(dr);

        String feedback = getFeedBack(dr);

           // Define the base case / stopping condition
           if (feedback.equals("no")) {

             // Do something to reach the goal
             fixRequirement(dr);

             // Recursive call
            learn(dr);
         } else if (feedback.equals("yes")) {
             pass(dr);
         }
    }

    static void test(String dr) {
        System.out.println("Testing skills");
    }

    static String getFeedBack(String dr) {
        System.out.println("Is your " + dr + " passed? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRequirement(String dr) {
        System.out.print("Enter needed requirements:");

        scan.nextLine();
        String requirement = scan.nextLine();
        System.out.println("Fixing requirements. Added " + requirement);
    }

    static void pass(String dr) {
        System.out.println("Passed " + dr);
    }

}