package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ar2c {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ob=new ArrayList<Integer>();
		int a[]= {10,10,2,5,44,7,2,5};
		List ob=new ArrayList<>();
				Collections.addAll(ob, a);
		System.out.println(ob);

	}

}
