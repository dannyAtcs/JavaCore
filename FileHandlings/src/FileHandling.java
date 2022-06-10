import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHandling {

	public static void main(String[] args) {
		
		//Create a file
		File ob = new File("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\obj.txt");
		
		try {
			if(ob.createNewFile())
			{
				System.out.println("File has been created successfully");
			}
			else
			{
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//Write a file 
		
		try {
			FileWriter ob1 = new FileWriter(
					"C:\\Users\\danny.gupta\\Desktop\\FileHandling\\obj.txt");
			ob1.write("This is a file i have created using file handlings");
			
			Scanner sc = new Scanner(System.in);
			
			String data = sc.nextLine();
			ob1.write(data);
			sc.close();
			ob1.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		//Read a file
		
		File ob2 = new File("C:\\Users\\danny.gupta\\Desktop\\FileHandling\\obj.txt");
		try {
			Scanner Sc = new Scanner(ob2);
			while(Sc.hasNextLine())
			{
				String deta = Sc.nextLine();
				System.out.println(deta);
			}
			Sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Copy a file into another
		try {
			FileWriter ob3 = new FileWriter(
					"C:\\Users\\danny.gupta\\Desktop\\FileHandling\\obj1.txt");
			Scanner Sc = new Scanner(ob2);
			while(Sc.hasNextLine())
			{
				String data = Sc.nextLine();
				ob3.write(data);
			}
			ob3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
