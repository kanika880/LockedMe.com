
import java.util.*;

public class DisplayMenu {
	static Scanner sc = new Scanner(System.in);		
	static int choice;
	
	//method for displaying welcome screen
	public static void welcomeScreen() {
		System.out.println("******Welcome to LockedMe.com******");
		System.out.println("**Developed By - Kanika Gupta**");	
	}
	
	//method to display menu options
	public static void displayMenu() {
		do {
		System.out.println("\n******Select options from below and press Enter*****");	
		System.out.println("1. Retreive all files");
		System.out.println("2. Display menu for file operations");
		System.out.println("3. Exit Program");
		try{	
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Option. Please enter valid option.");			
			DisplayMenu.displayMenu();
		}
		switch(choice) {
		case 1:		
			FileOperations.display();
			break;
		case 2:
			DisplayMenu.displayFileMenu();
			break;
		case 3:
			System.out.println("Thank you for using our application!");
			break;
		default:
			System.out.println("Invalid Option. Please enter a valid option.");
	}
}
while( choice!=3 );		
	}
	
	
	//method to display file menu options
	public static void displayFileMenu() {
		
		System.out.println("\n******Select options from below and press Enter*****");	
		System.out.println("1. Add a file");
		System.out.println("2. Delete file");
		System.out.println("3. Search File");
		System.out.println("4. Show previous menu");
		System.out.println("5. Exit Program");
		try {
		System.out.print("Enter Choice : ");
		choice = sc.nextInt();
	}catch(Exception e) {
		System.out.println("Invalid Option. Please enter valid option.");			
		DisplayMenu.displayFileMenu();
	}switch(choice) {
	case 1:		
		FileAddOperations.addingFile();
		break;
	case 2:
		FileDeleteOperation.deletingFile();
		break;
	case 3:
		FileSearchOperation.searchingFile();
		break;
	case 4:
		DisplayMenu.displayMenu();
		break;
	case 5:
		System.out.println("Thank you for using our application!");
		break;
	default:
		System.out.println("Invalid Option. Please enter a valid option.");
}
	{
while( choice!=5 );

	
	
}
	}

	
}
	
