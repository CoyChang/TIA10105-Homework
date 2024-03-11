package hw8;

import java.util.*;

public class TrainSort {

	public static void main(String[] args) {
		List<Train> list = new ArrayList<>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(list);
		
		System.out.println("================================================================");
		System.out.println("使用for印出以班次編號由大到小的Train物件：");
		System.out.println("================================================================");
		for(int i=0; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println();
		System.out.println("================================================================");
		System.out.println("使用foreach印出以班次編號由大到小的Train物件：");
		System.out.println("================================================================");
		for(Train i : list) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("================================================================");
		System.out.println("使用Iterator印出以班次編號由大到小的Train物件：");
		System.out.println("================================================================");		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
