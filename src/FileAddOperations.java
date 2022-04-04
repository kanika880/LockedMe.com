
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAddOperations {	
		static Scanner sc = new Scanner(System.in);
		 static String fileName;	 
		 
		
		public static void addingFile() {
			//Accepting name of the file from the user 
			System.out.print("Enter file name : ");		
				fileName = sc.next();
			
			
			//Calling CreateFile function to create the file 			
			FileAddOperations.createFile(fileName);
		}
		
		public static void createFile(String fileName) {
			File dir = new File ("D:\\Project\\LockedMe\\main");
			 try {
			      File file = new File(dir, fileName);
			      
			      if (file.createNewFile()) {    	      	 
			    	  System.out.println("File Created : " + file.getName());
			    	  DisplayMenu.displayFileMenu();
			      } else {
			    	  System.out.println("File already exists. Please enter another name");
			    	 FileAddOperations.createFile(fileName);
			      }
			    } catch (IOException e) {
			    	System.out.println("An error occurred.");
			    	e.printStackTrace();
			    }
			  }
		  
	
		}		


