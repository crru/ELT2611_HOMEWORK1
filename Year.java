import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int number = input.nextInt();		
        if(number % 12 == 0)			
        	System.out.println("monkey");
        if(number % 12 == 1)			
        	System.out.println("rooster");
		if(number % 12 == 2)			
        	System.out.println("dog");
		if(number % 12 == 3)			
        	System.out.println("pig");
		if(number % 12 == 4)			
        	System.out.println("rat");
		if(number % 12 == 5)			
        	System.out.println("ox");
		if(number % 12 == 6)			
        	System.out.println("tiger");
		if(number % 12 == 7)			
        	System.out.println("rabbit");
		if(number % 12 == 8)			
        	System.out.println("dragon");
		if(number % 12 == 9)			
        	System.out.println("snake");
		if(number % 12 == 10)			
        	System.out.println("horse");
		if(number % 12 == 11)			
        	System.out.println("sheep");
	}
		
}
