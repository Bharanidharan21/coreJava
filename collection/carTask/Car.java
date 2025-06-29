package come.Bharani.collection.carTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Car {
	private Map<String,Integer> carMap=new TreeMap<>();

	public Map<String, Integer> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}
	//add car name to the treeMap
	public void addCar(String name,int num) {
		carMap.put(name, num);
	}
	//get number cars sold
	public int carByName(String name) {
		if(carMap.containsKey(name)) 
		{
			return carMap.get(name);
		}
		else {
		return -1;
		}

	}
	//get number of cars sold count
	public List<String>carByCount(int count){
		List<String> result=new ArrayList<String>();
		for(Map.Entry<String, Integer> entery:carMap.entrySet()) {
			if(entery.getValue()>=count) {
				result.add(entery.getKey());
			}
		}
		return result;
	}

}
