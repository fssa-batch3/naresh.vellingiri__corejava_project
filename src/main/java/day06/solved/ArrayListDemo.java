
package day06.solved;

import java.util.*;

class ArrayListDemo{
	
	public static void main(String[] args) {
		
		
		String[] deptNames = new String[3];
		
		deptNames[0] = "CSE";
		deptNames[1] = "EEE";
		deptNames[2] = "MECH";
		
		List<String> list = new ArrayList<>(Arrays.asList(deptNames)) ;
		System.out.println(list);
		
		list.add("jello");
		
		System.out.println(list);

	}
}