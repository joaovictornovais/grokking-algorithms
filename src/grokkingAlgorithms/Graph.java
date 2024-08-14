package grokkingAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

	
	public static void main(String[] args) {	
		
		HashMap<String, String[]> hash = new HashMap<>();
		
		String[] joaoFriends = {"André", "Pedro", "Mateus", "Paulo"};
		String[] mateusFriends = {"Pedro", "Arthur", "André"};
		String[] pedroFriends = {"Mateus", "Arthur"};
		
		hash.put("João", joaoFriends);
		hash.put("Mateus", mateusFriends);
		hash.put("Pedro", pedroFriends);
		
		if(!someoneSellsMango(hash)) System.out.println("No one sells mango");
	}
	
	public static boolean verifyName(String name) {
		if (name.charAt(name.length() - 1) == 'm') 
			return true;
		return false;
	}
	
	public static boolean someoneSellsMango(HashMap<String, String[]> hash) {
		Queue<String> queue = new LinkedList<>();
		List<String> alreadyVerified = new ArrayList<>();
		
		hash.forEach((k, v) -> {
			queue.add(k);
			alreadyVerified.add(k);
		});
		
		while (queue.size() > 0) {
			String person = queue.remove();
			if (verifyName(person)) {
				System.out.println(person + " sells mango!");
				return true;
			}
			if (hash.containsKey(person)) {
				for (String friend : hash.get(person)) {
					if (!alreadyVerified.contains(friend)) {
						queue.add(friend);
						alreadyVerified.add(friend);
					}
				}
			}
		}
		
		return false;
		
	}
	
}
