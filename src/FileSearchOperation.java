
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSearchOperation {
static Scanner sc = new Scanner(System.in);
	
	static File dir = new File ("D:\\Project\\LockedMe\\main");
	static ArrayList<String> fileList = new ArrayList<>();
	static String fileName;
	
	//Accepts name of the  file to be searched, calls function that will search the file 
	public static void searchingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		FileSearchOperation.searchList();
		FileSearchOperation.search(fileName);
	}
	
	//Gets the filenames from the directory and adds it to an arraylist, that is used to search the file 
	public static void searchList() {				
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            
				fileList.add(filename);
			
         }
      }  
      
	}
	
	//Searching the arraylist to check if the file is present
	public static void search(String fileName) {
		boolean present = fileList.contains(fileName); 
		
		if (present) {
            System.out.println("File is Present in the directory"); 
		    DisplayMenu.displayFileMenu();}
		else {
        	System.out.println("File is not present in the directory."); 
		     DisplayMenu.displayFileMenu();
	}

	}
	}

