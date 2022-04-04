
import java.io.File;
import java.util.Scanner;

public class FileDeleteOperation {
	static Scanner sc = new Scanner(System.in);	
	static String fileName;
	static File dir = new File ("D:\\Project\\LockedMe\\main");
	
	public static void deletingFile() {
		FileDeleteOperation.displayAllFile();
		
		System.out.println("Enter filename:");
		fileName = sc.next();
		
		FileDeleteOperation.fileDelete(fileName);
	}
	public static void fileDelete(String fileName) {
		File file = new File(dir, fileName);
		
		if (file.delete()) {
			System.out.println("File Deleted: " + file.getName());	
			System.out.println("Files available in main folder:");
			FileDeleteOperation.displayAllFile();
			DisplayMenu.displayFileMenu();
		}else {
			System.out.println("File not found");
			DisplayMenu.displayFileMenu();
		}
		}
		public static void displayAllFile() {		
		      String[] children = dir.list();
		      
		      if (children == null) {
		         System.out.println( "Directory Empty.");
		      } else { 
		         for (int i = 0; i< children.length; i++) {
		            String filename = children[i];
		            System.out.println(filename);
		         }
		      }
			}
		
		
	}


