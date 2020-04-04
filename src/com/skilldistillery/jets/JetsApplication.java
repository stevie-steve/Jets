package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	String jetFile = "JetFile.csv";
	private AirField airField = new AirField(jetFile);
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		JetsApplication jetsApp = new JetsApplication();
		jetsApp.run();
	}

	private void run() {
		launch();
		displayUserMenu();
	}

	private void launch() {
		System.out.println("right here it calls new airfield XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}

	private void displayUserMenu() {

		System.out.println("Choose an option from the below list: ");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit ");
		int choice = sc.nextInt();

		while ((choice <= 9) || (choice >= 1))

		{
			if (choice == 1) {
				airField.displayAllJets();
				System.out.println();
			}

			if (choice == 2) {
				airField.flyAllJets();
				System.out.println();

			}
			if (choice == 3) {
				airField.fastestJet();
				System.out.println();
			}

			if (choice == 4) {
				airField.longestRangeJet();
				System.out.println();
			}
			if (choice == 5) {
				airField.load();
				System.out.println();
			}
			if (choice == 6) {
				airField.fight();
				System.out.println();
			}
			if (choice == 7) {
				airField.add(sc);
				// createNewJets();
				// loop, determine my own amount
				System.out.println();
			}
			if (choice == 8) {
				// remove();
				System.out.println();
			}

			if (choice == 9) {
				System.out.println("Goodbye");
				System.exit(0);
			}
			System.out.println("Choose an option from the below list: ");
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5  Load all Cargo Jets");
			System.out.println("6  Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Quit ");
			choice = sc.nextInt();
		}
	}
}
