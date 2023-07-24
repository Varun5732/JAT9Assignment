package tasks;
import java.util.*;

public class TreeMapEmployeeID {

	public static void main(String[] args) {
		// Creating TreeMap to store employee name and ID
		TreeMap<String, Integer> employeeMap = new TreeMap<>();
		
		//Adding Employee names and ID's
		employeeMap.put("Varun", 0224);
		employeeMap.put("Anandh",0113);
		employeeMap.put("Yuvraj", 0115);
		employeeMap.put("Thasliem",0315 );
		
		//Printing the employee names in Alphabetical order
		System.out.println("Employee Names in Alphabetical order");
		for(String name : employeeMap.keySet()) {
		System.out.println(name);
		}
		
		
	}

}
