package come.Bharani.collection.task2;

import java.util.HashSet;
import java.util.Iterator;

public class ClassHouseFormation {
	private HashSet<String> studSet= new HashSet<>() ;

	

	public HashSet<String> getStudSet() {
		return studSet;
	}

	public void setStudSet(HashSet<String> studSet) {
		this.studSet = studSet;
	}
	public void addName(String details) {
		String[] parts = details.split(":");
		if(parts.length == 2) {
			String name = parts[1];
			studSet.add(name);
		}
	}
	public HashSet<String> formTeam(){
		HashSet<String> resultSet = new HashSet<>();
	    Iterator<String> iterator = studSet.iterator();
	    while (iterator.hasNext()) {
	    	String name=iterator.next();
	    	char firstChar = Character.toUpperCase(name.charAt(0));
	    	String house = "";
	    	if(firstChar >= 'A' && firstChar <= 'H') {
	    		house ="RED";
	    	}else if(firstChar >= 'I'&& firstChar <='p') {
	    		house = "BLUE";
	    	}
	    	else if(firstChar>='Q'&&firstChar<='Z') {
	    		house = "GREEN";
	    	}
	    	resultSet.add(name + ":"+house);
	    }
		return resultSet;
	}


}
