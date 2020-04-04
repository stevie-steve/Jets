package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class trying {

	public static void main(String[] args) {
		List<List<String>> Jet = new ArrayList<List<String>>();
		int Max_Jets=8;
		for (int i = 0; i < Max_Jets; i++) {
			Jet.add(new ArrayList<String>());
		}
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("names.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {
				char[] ch = line.toCharArray();
				//String.split("names.txt");
			Jet.get(String.split(regex).add(line);
			}
			for (int i = 0; i < Max_Jets; i++) {
				System.out.println(Jet.get(i));
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}

	}

}
