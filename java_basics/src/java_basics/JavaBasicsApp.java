package java_basics;

public class JavaBasicsApp {

	public static void main(String[] args) {
		System.out.println("Let's shake off some rust again to see if this new stuff works right!!");
		System.out.println();
		
		int a = 5;
		int b = 10;
		int sum = a + b;
		int prod = a * b;
		int quot = b / a;
		System.out.println(sum);
		System.out.println(prod);
		System.out.println(quot);
		System.out.println("==========");
		
		int x = (a + b + sum);
		System.out.println(x);
		System.out.println("==========");
		int y = x + quot;
		System.out.println(y);
		System.out.println("==========");
		
		String girlFriend = "Girlie";
		String phoneNumber = "555-867-1212";
		System.out.println(girlFriend +"'s" + " phone number is " + phoneNumber + "!" );
		System.out.println();
		
		String firstName = "Tommy";
		String lastName = "Boy";
		System.out.println(firstName + " " + lastName);
		
			
		System.out.println();		
		System.out.println("Ba bye!");

	}

}
