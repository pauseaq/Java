package day04;

import java.util.ArrayList;

public class CatDriver {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("양양이", "페르시안", 1.5);
		cat1.catInfo();
		cat2.catInfo();
		cat2.setName("야용이");
		System.out.println(cat2.getName());
		
		ArrayList<Cat> catList = new ArrayList<Cat>();
		catList.add(cat1);
		catList.add(cat2);
		
		for (Cat ct : catList) {
			ct.catInfo();
		}
		for (int i = 0; i < catList.size(); i++) {
			catList.get(i).catInfo();
		}
	}

}
