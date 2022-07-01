package assignment1;
import java.util.Scanner;
public class LeapYearProg {
public static void main(String[] args){
int year;
System.out.println("Enter the Year: ");
 Scanner sc = new Scanner(System.in);
  year = sc.nextInt();

		      if ((((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) && (year>=1582)) {
		         System.out.println("leap year");
		      }
		      else
		         System.out.println("not a leap year");
		   }
		}
		
