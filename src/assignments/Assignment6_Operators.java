package assignments;

/***
 * Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
 * and store it into another array, after adding 10 marks identify the average
 * marks of all students
 * 
 * @author HARISH R
 *
 */
public class Assignment6_Operators {

	public static void main(String[] args) {
//Created two arrays to add names and marks
		String[] names = { "Suresh", "Mahesh", "Naresh" };
		int[] marks = { 75, 80, 82 };
		for (int i = 0; i <= 2; i++) {
			marks[i] += 10;
//			System.out.println(marks[i]);
		}
// created an array to store updatedmarks to an array.
		int[] updatedMarks = new int[3];
		updatedMarks[0] = marks[0];
		updatedMarks[1] = marks[1];
		updatedMarks[2] = marks[2];
		System.out.println(names[0] + " " + updatedMarks[0]);
		System.out.println(names[1] + " " + updatedMarks[1]);
		System.out.println(names[2] + " " + updatedMarks[2]);
		System.out.println("Average of marks" + " " + (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / 3);
	}

}
