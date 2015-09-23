import java.util.Scanner;

public class Mario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int count = scan.nextInt(); 

		for (int i = 0; i < count; i++) { 
			for (int w = 0; w < (count - i - 1); w++) {  
				System.out.print(" ");
			}
			for (int e = 0; e < ((1 * i) + 1); e++) { 
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
	}
}
