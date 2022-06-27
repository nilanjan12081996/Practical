/*
 @Author Nilanjan
  */
import java.util.*;
public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; //declare a number
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in); //create the object of scanner class
		n=sc.nextInt();	//take output from users
		if(n%2==0)	//condition for checking  even or not
			System.out.println(n+" is even number");
		else
			System.out.println(n+" is odd number");
			

	}

}
