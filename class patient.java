import java.io.Reader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class patient {
	
	String nom, prenom, date, num_tel, password, email, password2;
	File rapport ;
	
	
	
	
	patient(String nom, String prenom, String date, String num_tel,  String email , File rapport){
		
		this.nom = nom;
		this.prenom = prenom;
		this.password =  password;
		this.date = date;
		this.num_tel = num_tel;
		this.email = email;
		this.password2= password2;
		
	}
	
	
	void info( String nomFile) throws FileNotFoundException {
		 try {

			 File rapport = new File(nomFile);
		      // trying to create a file based on the object
		      boolean value = rapport.createNewFile();
		      if (value) {
		        System.out.println("The new file is created.");
		      }
		      else {
		        System.out.println("The file already exists.");
		      }
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
		    try {
		        // Creates a reader using the FileReader
		        FileReader input = new FileReader(rapport);

		        // Reads characters
		        input.read();
		        System.out.println("Data in the file:");
		        

		        // Closes the reader
		        input.close();
		      }
		      catch(Exception e) {
		        e.getStackTrace();
		      }
		    }
	
	void consulter(File rapport , String data) {
		try {
		       // Creates a Writer using FileWriter
		       FileWriter output = new FileWriter(rapport);
		       Scanner sc = new Scanner(System.in);
		       data = sc.next();
		       
		       // Writes string to the file
		       output.write(data);
		       System.out.println("Data is written to the file.");

		       // Closes the writer
		       output.close();
		     }
		     catch (Exception e) {
		       e.getStackTrace();
		     }
	}
		 
		 
		 
		
		
	}

