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
			System.out.println(this);
		}
	}

// public void remove() {
}
