//import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class moretrys {
	
	//public static void main(String[] args) {
	//	Airfield airfield = new Airfield();

		ArrayList<String> dragonArr = new ArrayList<>();
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("names.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {
				dragonArr.add(line);
//		    System.out.println(line);
			}
			for (int i = 0; i < dragonArr.size(); i++) {
				String dragonInfo = (String) (dragonArr.get(i));
				String[] split = dragonInfo.split(",");
				System.out.println(split[i]);
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
	//}
}