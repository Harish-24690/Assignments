package assignments;

public class Assignments2_Arrays {
	/***
	 * 
	 * Problem: Multi-Dimensional Array Practice 1. Create a 3D array to represent
	 * the following data: Semesters as the first dimension. Subjects and
	 * Status/Marks as the second dimension. Actual values for Subject Names and
	 * Marks as the third dimension. 2. From the array: Print Semester 2 Subject 4
	 * and Subject 5 names. Print the Status/Marks of Semester 4 Subject 3 and
	 * Subject 6.
	 * 
	 *
	 */

	public static void main(String[] args) {

		String[][][] data = {
// Semester1 [0]
				{ 
					{ "Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing","Basic Electrical Eng" },
						{ "Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79) " } },
// Semester2[1]
			//[0]	
				{ { "Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics","Engineering Graphics " },
			//[1]				
						{ "Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)" } },
// Semester3[2]
				{ { "Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems","Signals and Systems", "Object-Oriented Prog." },
						{ "Pass(88)", "Pass(81) ", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)" } },
// Semester4[3]
				{ { "Algorithms", "Computer Networks ", "DatabaseSystems", "Microprocessors", "Communication Eng","Software Engineering" },
						{ "Pass(91)", "Pass(73) ", "Fail(19)", "Pass(80) ", "Pass(76)", "Pass(87) " } },
// Semester5[4]
				{
//[0]
					{ "Probability & Stats", "Machine learning", "Compiler Design", "Theory of Computation","Embedded Systems", "Computer Graphics" },
//[1]					
						{ "Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)" } }, 
				     
		               };
//Print Semester 2 Subject 4 and Subject 5 names.---> "Basic Electronics" ,"Engineering Physics"
		System.out.println("Printing Semester 2nd 4thSubject name----> "+data[1][0][3] +  "and Printing Semester 2nd 5thSubject name---->" +data[1][0][4]);

//Print the Status/Marks of Semester 4 Subject 3 and Subject 6. -->	Fail(19) ,Pass(87)
       System.out.println("Printing Semester 4 subject3 marks--->"+data[3][1][2] +" and Printing Semester 4 Subject 6 marks"+data[3][1][5]);
	}
}
