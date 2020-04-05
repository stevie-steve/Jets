package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	List<Jet> jetList = new ArrayList<>();

	public AirField(String jetFile) {
		readingTheCSVFile(jetFile);
	}

	public void readingTheCSVFile(String jetFile) {

		Jet newJet = null;
		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetFile))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] splitJetData = line.split(",");

				String type = splitJetData[0];
				String model = splitJetData[1];
				double speed = Double.parseDouble(splitJetData[2]);
				int range = Integer.parseInt(splitJetData[3]);
				double price = Double.parseDouble(splitJetData[4]);

				if (type.equalsIgnoreCase("cargo")) {
					newJet = new CargoPlane(type, model, speed, range, price);

				} else if (type.equalsIgnoreCase("fighter")) {
					newJet = new FighterJet(type, model, speed, range, price);

				} else {
					newJet = new JetImpl(type, model, speed, range, price);
				}
				jetList.add(newJet);
			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void add(Scanner sc) {
		String jetType = "Passenger";
		System.out.print("Enter the model of the Jet : ");
		String jetModel = sc.next();
		sc.nextLine();
		System.out.print("Enter the speed of the jet in MPH: ");
		int jetSpeed = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the range of the Jet in miles: ");
		int jetRange = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the price of the Jet: ");
		double jetPrice = sc.nextDouble();
		sc.nextLine();

		JetImpl createdJet = new JetImpl(jetType, jetModel, jetSpeed, jetRange, jetPrice);
		// System.out.println(createdJet);

		jetList.add(createdJet);
		// System.out.println(newJet);
	}

	public void displayAllJets() {

		for (int i = 0; i < jetList.size(); i++) {
			System.out.println(jetList.get(i));
		}
	}

	public void flyAllJets() {
		for (int i = 0; i < jetList.size(); i++) {
			jetList.get(i).fly();
		}
	}

	public void fastestJet() {
		Jet compare = jetList.get(0);
		double fastestSpeed = jetList.get(0).getSpeed();
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i) != null) {
				if (fastestSpeed < jetList.get(i).getSpeed()) {
					fastestSpeed = jetList.get(i).getSpeed();
					compare = jetList.get(i);
				}
			}
		}
		System.out.println("The following jet has the fastest capable speed: " + compare.toString());
		System.out.println();
	}

	public void longestRangeJet() {
		Jet compare = jetList.get(0);
		double longestRange = jetList.get(0).getRange();
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i) != null) {
				if (longestRange < jetList.get(i).getRange()) {
					longestRange = jetList.get(i).getRange();
					compare = jetList.get(i);
				}
			}
		}
		System.out.println("The following jet has the longest range: " + compare.toString());
		System.out.println();

	}

	public void load() {
		for (Jet jet : jetList) {
			if (jet != null) {
				if (jet instanceof CargoPlane) {
					((CargoPlane) jet).load();
				}

			}
		}
	}

	public void fight() {
		for (Jet jet : jetList) {
			if (jet != null) {
				if (jet instanceof FighterJet) {
					System.out.println();
					((FighterJet) jet).fight();

				}

			}
		}
	}

	public void remove(Scanner sc) {
        int counter = 0;
        for (Jet jet : jetList) {	
            counter++;
            System.out.println(counter + ". " +jet);
        } 
		System.out.print("Choose the number of the jet to remove: ");
		  int removedJetNumber = sc.nextInt();
            jetList.remove(removedJetNumber-1);
            System.out.println();
            System.out.println("This lis now your list of Jets");
            displayAllJets();
            System.out.println();
        
    }

	}


