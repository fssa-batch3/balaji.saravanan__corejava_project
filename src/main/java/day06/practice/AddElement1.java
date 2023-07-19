package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class AddElement1 { 

	public static void main(String[] args) {

		List<String> city = ListChecking.cityList();

		System.out.println(ListChecking.cityList2(city));

	} 
} 
 
class ListChecking {

	public static List<String> cityList() {

		List<String> cityList = new ArrayList<>();

		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		return cityList;

	}

	public static List<String> cityList2(List<String> cityList) {

		List<String> cityList1 = new ArrayList<>();

		for (int i = 0; i < cityList.size(); i++) {

			String city = cityList.get(i);

			boolean duplicate = false;

			for (int j = i + 1; j < cityList.size(); j++) {

				if (city.equals(cityList.get(j))) {

					duplicate = true;

					break;
				}
			}

			if (!duplicate) {

				cityList1.add(city);

			}
		}

		return cityList1;
	}
}
