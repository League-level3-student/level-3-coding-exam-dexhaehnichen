import java.util.HashMap;

public class HashMapCalculator {
	public HashMapCalculator() {
		
	}
	
	public int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
		int common = 0;
		//map1.keySet().toArray();
		//map2.keySet().toArray();
		for (int i = 0; i < map1.size(); i++) {
			for (int j = 0; j < map2.size(); j++) {
				if(map1.get(map1.keySet().toArray()[i]).equals(map2.get(map2.keySet().toArray()[j])) && map1.keySet().toArray()[i].equals(map2.keySet().toArray()[j])) {
					common++;
				}
			}
		}
		return common;
	}
	
}
