package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {

// this print statement will print the content and will move to next line.		
		System.out.println("Hello world");

/*
* This print statement will print the content inside (), and will be in same
* line.
 */
		System.out.print("Hello");
		System.out.print(" World");
		System.out.println();

//Print the content and will be in same line. 		
		System.out.printf("%s is a automation engineer ,Is empid is %d and the testcases are %b", "harish", 1111, true);
		System.out.println();

/*
* Print the content and will be in the same line. Join multiple printW
* statements together
*/
		System.out.append("Harish is working in an Ecommerce website").append(",handles the functional testcases");
		System.out.println();
		
// Prints the logs in the program
		Logger log = Logger.getLogger("AutomationProject");
		log.info("Currentline is 30 ");
		log.info("Currentline is 31");
		log.info("Currentline is 32");
		System.out.println();
		
//Prints the logs using PrintWriter Method .
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\logs");
		writer.println("Info :- Writing the logs using PrinterWriter");
		writer.println(LocalDateTime.now()+ "---Currently executing 43rd line");
		writer.println(LocalDateTime.now()+ "---Currently executing 44th line");
		writer.close();
		
// Prints the error  message in print statement.    
		System.err.println("Error :-Expected result is not matched with actual result");
		
// This print statement used to convert to ASCII value.
		System.out.write(65);
		System.out.println();
	}

	
}
