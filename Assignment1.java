import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//validateEmailaddress
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter student email address: ");
        // String studentNum = scan.nextLine();

        // // Long method
        // Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        // Matcher matcher = pattern.matcher(studentNum);

        // boolean match = matcher.matches();

        // if (match) {
        //     System.out.println("valid student email address");
        // } else {
        //     System.out.println("invalid student email address");
        // }



//philippineCPnumber

//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter your number: ");
//     String num = input.nextLine();

//    //method
//    Pattern pat = Pattern.compile("\\+63+\\d{10}");
//    Matcher matchh = pat.matcher(num);

//    boolean matchhh = matchh.matches();

//    if (matchhh) {
//        System.out.println("valid number");
//    } else {
//        System.out.println("invalid number");
//    }


//birthdate
Scanner sc = new Scanner(System.in);
System.out.print("Enter birthday(YYYY-MM-DD) : ");
String date = sc.nextLine();

//method
Pattern k = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
Matcher m = k.matcher(date);

boolean ma = m.matches();

if (ma) {
   System.out.println("valid date");
} else {
   System.out.println("invalid date");

    }







}
}