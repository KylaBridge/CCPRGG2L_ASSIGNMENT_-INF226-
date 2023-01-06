import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

//validateEmailaddress
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email address: ");
        String studentNum = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }

//philippineCPnumber

        System.out.print("Enter your number: ");
        String num = scan.nextLine();

   //method
        pattern = Pattern.compile("\\+63+\\d{10}");
        matcher = pattern.matcher(num);

        match = matcher.matches();

   if (match) {
       System.out.println("valid number");
   } else {
       System.out.println("invalid number");
   }

//birthdate

        System.out.print("Enter birthday(YYYY-MM-DD) : ");
        String date = scan.nextLine();

//method
        pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        matcher = pattern.matcher(date);

        match = matcher.matches();

if (match) {
   System.out.println("valid date");
} else {
   System.out.println("invalid date");

    }

scan.close();


}
}
