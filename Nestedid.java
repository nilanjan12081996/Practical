/*
 @Author Nilanjan
  */
public class Nestedid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="kolkata, India";
		if(address.endsWith("India"))
		{
			if(address.contains("Dunlop"))
				System.out.println("Your city is dunlop");
			else if(address.contains("Newtown"))
				System.out.println("your city is newtown");
			else
				System.out.println(address.split(",")[0]);
		}
		else
			System.out.println("you are not living in India");

	}

}
