package com.jmgarza.midterm;

/*
 * This class is my midterm for a guessing game
 * Program will select number 1-100 DONE
 * prompt user for a guess
 * user starts with 10 points, each wrong guess deducts a point
 * program will tell the user if the guess is correct, too high, or too low
 * game stops when user guesses correctly or reaches 0 points
 * program prints out secret number and the users remaining points/score
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {

		// Game intro
		System.out.println("Welcome to the guessing game. Guess a number between 1 and 100 when prompted.");
		System.out.println("You will start with 10 points and will lose a point for each wrong guess.\n");

		Scanner scan = new Scanner(System.in);

		// generate random number 1-100
		// initiate user's starting points
		Random rand = new Random();
		int upperBound = 101;
		int secretNum = rand.nextInt(upperBound);
		int userPoints = 10;

		// while userPoints > 0 execute loop
		while (userPoints > 0) {
			System.out.println("Please enter a number 1-100:");
			int userGuess = scan.nextInt();
			
			// check for correct guess first
			if (userGuess == secretNum) {
				System.out.println("Correct answer!\n");
				break;
				// tell user if guess is too high or too low
			} else if (userGuess > secretNum) {
				System.out.println("Guess was too high.");
			} else if (userGuess < secretNum) {
				System.out.println("Guess was too low.");
			}
			// end of turn subtract 1 point
			--userPoints;
		}

		System.out.println("The secret number is: " + secretNum);
		System.out.println("User ended with " + userPoints + " points.");
	}

}
