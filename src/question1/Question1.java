package question1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName = input.nextLine().trim();
		System.out.println("Welcome, " + userName + "!");
		input.close();
	}
}
