package assignment1;
import java.util.Scanner;
public class StringEquality {

	public static void main(String[] args) {
String s1, s2;
Scanner sc= new Scanner(System.in);
System.out.println("Enter first string: ");
s1 = sc.nextLine();
System.out.println("Enter second string: ");
s2 = sc.nextLine();
/* comparing the two strings
 * 
 */
if (s1.equals(s2))
	System.out.println("Equal strings");
else
	System.out.println("Unequal strings");

	}

}
