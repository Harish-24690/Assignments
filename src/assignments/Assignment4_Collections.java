package assignments;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * 
 * Assignment (Arrays & Collections) 
1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined. 
2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size. 
3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value. 
4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
 * @author HARISH R
 *
 */

public class Assignment4_Collections {
	
	public static void main(String[] args) {

//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		List<Integer> areaOfCities = new ArrayList<Integer>();
		areaOfCities.add(1484);
		areaOfCities.add(741);
		areaOfCities.add(681);
		areaOfCities.add(650);
		areaOfCities.add(631);
		System.out.println("total area of the 3rd and 4th cities-->"+areaOfCities.get(2)+areaOfCities.get(3));
		
//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.		
      Set<String> cities = new HashSet<String>();
      cities.add("Eiffel Tower");
      cities.add("Colosseum");
      cities.add("Great Wall of China");
      cities.add("Grand Canyon");
      cities.add("Taj Mahal");
      cities.add("Machu Picchu");
      cities.add("Paris");
      cities.add("New York");
      cities.add("Niagara Falls");
      cities.add("Bangkok");
      System.out.println("The top 10 most visited tourist attractions in the world--> "+cities);
      System.out.println("The size is-->"+cities.size());
      
 //3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
      int[] numbers = {10,9,8,7,6,5,4,3,2,1};
      int sum=numbers[4]+numbers[5];
      System.out.println("Average of two numbers-->"+sum/2);
      
//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list
      List<String> movies = new ArrayList<String>();
      movies.add("KGF");
      movies.add("Kantara");
      movies.add("Bahubali");
      movies.add("Rajkumara");
      movies.add("YuvaRatna");
      System.out.println("The 3rd hightest grossing movies-->"+movies.get(2));
	}

}
