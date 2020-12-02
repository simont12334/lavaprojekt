package lavaprojekt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class systemlogic {
	void checkpw(String username, String pw) {
		if (username.equals("admin")) {
				if (pw.equals("admin")) {
					start s = new start();
					s.main(null);
				}
				else {
					System.err.println("wrongpw");
				}
			}
			else {
				System.err.println("wrong user");
			}
	}

	public void addentry(String name, String ip, String des) {
		// TODO Auto-generated method stub
		
		try {
			File all = new File("all.txt");
			File myObj = new File(name);
			File myObj2 = new File("des" + name);
			FileWriter myWriter = new FileWriter(name);
			FileWriter allw = new FileWriter("all.txt");
			allw.write(";");
			myWriter.write(ip);
			myWriter.close();
			FileWriter myWriter2 = new FileWriter("des" + name);
			myWriter2.write(des);
			myWriter2.close();
					
			String data = null;
		
			try {
				File myObj4 = new File("all.txt");
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
					data = myReader.nextLine();
				}
				myReader.close();
			} catch (FileNotFoundException e) {
				System.err.println("An error occurred.");
				e.printStackTrace();
			}
			
			FileWriter allw1 = new FileWriter("all.txt");
			allw1.write(data+";"+name);
			allw1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
