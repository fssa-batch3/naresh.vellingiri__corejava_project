package day07.practice;


import java.util.HashSet;

public class RemovingDuplicates {
	
	public static void main(String[] args) {
		
	
	  HashSet<Integer> IntNamesSet = new HashSet<Integer>();
	  
	  IntNamesSet.add(11);
	  IntNamesSet.add(22);
	  IntNamesSet.add(33);
	  IntNamesSet.add(44);
	  IntNamesSet.add(33);
	  IntNamesSet.add(33);
	  IntNamesSet.add(22);
	  IntNamesSet.add(22);

      System.out.println(IntNamesSet);
       
   }
}