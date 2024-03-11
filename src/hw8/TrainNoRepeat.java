package hw8;

import java.util.*;

public class TrainNoRepeat {

	public static void main(String[] args) {
		Set<Train> set = new HashSet<>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		
		System.out.println("================================================================");
		System.out.println("使用Iterator印出不重複的Train物件：");
		System.out.println("================================================================");		
		Iterator<Train> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println();
		System.out.println("================================================================");
		System.out.println("使用foreach印出不重複的Train物件：");
		System.out.println("================================================================");
		for(Train i : set) {
			System.out.println(i);
		}
	}

}
