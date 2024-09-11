package studio2;

import java.util.Scanner;

public class studio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int startAmount, winLimit, currentAmount;
		double winChance;
		
		System.out.println("Enter start amount: ");
		startAmount = scan.nextInt();
		
		System.out.println("Enter win limit: ");
		winLimit = scan.nextInt();
		
		System.out.println("Enter win chance: ");
		winChance = scan.nextDouble();
		
		currentAmount = startAmount;
		
		while ((currentAmount < winLimit) && (currentAmount > 0)) {
			if (Math.random() < winChance) {
				System.out.println("You won!");
				currentAmount++;
				System.out.println("You've got " + currentAmount);
			}
			else {
				System.out.println("You lost!");
				currentAmount--;
				System.out.println("You've got " + currentAmount);
			}
		}
		if (currentAmount == 0) {
			System.out.println("You're ruined.");
		}
		
		else {
			System.out.println("You're him.");
		}
		
	}

}
