
import java.io.File;
import java.util.*;


public class FileOperations {
	static Scanner sc = new Scanner(System.in); 
	static int choice;
	static File dir = new File ("D:\\Project\\LockedMe\\main");
	static ArrayList<String> fileList = new ArrayList<>();	
	
	//method for creating "main" folder
	public static void createMainFolderIfNotPresent(String folderName) {
		File file = new File(folderName);

		// If file doesn't exist, create the main folder
		if (!file.exists()) {
			file.mkdirs();
		}
	}
	
	//method to display all files
	public static void display() {
		//Sub menu - Option 1 
		do {
			System.out.println("\n******Select options from below and press Enter*****");
			System.out.println("1. Display file names in Ascending Order");
			System.out.println("2. Go to main Menu");
			
			//Accepting User input
			try{	
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				FileOperations.display();
			}
						
			//Performing User Functions
			switch(choice) {
				case 1:
					FileOperations.ascendingOrder();
					break;
				case 2:
					DisplayMenu.displayMenu();					
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=2);		
	}
	
	
	
	//method for displaying files in ascending order
	public static void ascendingOrder() {					
	      String[] file = dir.list();
	      
	      //Gets filenames from the directory and adds it to an arraylist, that is used to arrange the contents in ascending order
	      if (file == null) {
	         System.out.println( "Directory Empty.");
	      } else { 
	         for (int i = 0; i< file.length; i++) {
	            String filename = file[i];
	            fileList.add(filename);
	         }
	      }  
	      
	      Collections.sort(fileList);
	      System.out.println("Files in Ascending Order : " + fileList);
				
		}
		
	}

	
	
	

