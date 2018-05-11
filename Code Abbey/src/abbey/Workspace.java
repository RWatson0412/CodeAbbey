package abbey;

import java.util.Scanner;

public class Workspace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which problem would you like answered?\n");
		int n = scan.nextInt();
		scan.close();
		System.out.println("The answer to problem " + n + " is \"");
		getAnswer(n);
		System.out.print(".");
	}
	
	public static void getAnswer(int n) {
		int numAns = -1;
		String stringAns = "";
	}
		
	
}
