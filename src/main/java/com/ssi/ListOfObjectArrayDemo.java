package com.ssi;

import java.util.ArrayList;
import java.util.List;

public class ListOfObjectArrayDemo {

	public static void main(String[] args) {

		//I need to store your name and age in array
		
		Object studOneInfo[]={"Rajeev",20};
		Object studTwoInfo[]={"Manish",25};
		Object studThreeInfo[]={"Priya",22};
		
		//I wish to store all this arrays in a List
		
		List<Object[]> studData=new ArrayList<Object[]>();
		studData.add(studOneInfo);
		studData.add(studTwoInfo);
		studData.add(studThreeInfo);
		
		
		
		
		
	}

}
