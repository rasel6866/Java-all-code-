import java.util.Scanner;

public class spellingChecker {

public static void main(String[] args)
 { Scanner in = new Scanner(System.in); System.out.println("Enter letter"); char ch;

ch= in.next().charAt(0);

if((ch >= 'a' && ch <= 'z' ) || (ch

= 'A' && ch <= 'Z')){ System.out.println("This is alphabate "+ch);


} else {

System.out.println("Only enter charecter");

}
}
}