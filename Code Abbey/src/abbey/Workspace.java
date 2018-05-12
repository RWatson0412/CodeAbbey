package abbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workspace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Which problem would you like answered?\n");
		int n = scan.nextInt();
		System.out.print("The answer to problem " + n + " is " + getAnswer(n) + ".");
		scan.close();
	}
	
	public static String getAnswer(int n) {
		if(n == 1) return p1();
		if(n == 2) return p2();
		if(n == 3) return p3();
		if(n == 4) return p4();
		return "This problem either doesn't exist or hasn't been solved yet.";
	}
	
	
	public static String p4() {
		System.out.println("Problem 4: Find minimum number of given pairs\nHow many pairs of numbers would you like to enter?");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Enter your numbers separated by a space.");
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			nums.add(input.nextInt());
			nums.add(input.nextInt());
		}
		List<Integer> ans = new ArrayList<Integer>();
		for(int i = 0; i < nums.size(); i += 2) {
			if(nums.get(i) < nums.get(i + 1)) ans.add(nums.get(i));
			else ans.add(nums.get(i + 1));
		}
		String returnAns = "";
		for(int i = 0; i < ans.size(); i++) {
			returnAns += ans.get(i) + " ";
		}
		return returnAns.substring(0, returnAns.length() - 1);
	}
	public static String p3() {
		System.out.println("Problem 3: Sum Pairs of Numbers\nHow many pairs do you have to add?");
		Scanner n = new Scanner(System.in);
		int count = n.nextInt();
		String ans = "";
		System.out.println("Enter your numbers separated by a space.");
		List<Integer> sums = new ArrayList<Integer>();
		for(int i = 0; i < count; i++) {
			sums.add(n.nextInt() + n.nextInt());
		}
		for(int i = 0; i < sums.size(); i++) {
			ans += (sums.get(i) + " ");
		}
		
		n.close();
		return ans.substring(0,ans.length() - 1);
	}
	public static String p2() {
		System.out.println("Problem 2: Summing a List of Numbers");
		List<Integer> nums = new ArrayList<Integer>();
		Scanner n = new Scanner(System.in);
		System.out.println("How many numbers do you have to sum?");
		int x = n.nextInt();
		System.out.println("Enter your numbers separated by a space:");
		for(int i = 0; i < x; i++) {
			int j = n.nextInt();
			nums.add(j);
		}
		int ans = 0;
		for(int i = 0; i < nums.size();i++) {
			ans += nums.get(i);
		}
		n.close();
		return(Integer.toString(ans));
	}
	public static String p1() {
		Scanner num = new Scanner(System.in);
		System.out.println("Problem 1: Sum Two Numbers");
		System.out.print("Enter the first number: ");
		int n = num.nextInt();
		System.out.print("Enter the second number: ");
		int x = num.nextInt();
		num.close();
		return(Integer.toString(n + x));
	}
}
