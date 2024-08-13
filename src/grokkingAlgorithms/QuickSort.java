package grokkingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(23, 11, 9, 222, 43, 233, 211, 99, 1));
		System.out.println(quickSort(list));
	}
	
	/* To quick sort, we need an list
	 * Then we choose an element to be our pivot
	 * This pivot can be any element, but is highly recommended to be the element in the middle index;
	 * Then we compare our pivot with ANOTHER elements at this list
	 * If the element is smaller, put them in the minors list;
	 * If the element is greater, put them in the bigger list;
	 * Create a new List, this gonna be our result
	 * Then, recurse our method with the minors list and add them to result list
	 * Add our pivot in the result list;
	 * Finally recurse our method with the bigger list and add them to result list
	 * The case base is, in case our array size is minor than 2, return the list
	 */
	public static List<Integer> quickSort(List<Integer> list) {
		if (list.size() < 2) {
			return list;
		}
		
		int pivot = list.get(list.size() / 2);
		List<Integer> minors = new ArrayList<>();
		List<Integer> biggers = new ArrayList<>();
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) != pivot) {
				if (list.get(i) < pivot) {
					minors.add(list.get(i));
				} else {
					biggers.add(list.get(i));
				}
			}
		}
		
		List<Integer> result = new ArrayList<>();
		result.addAll(quickSort(minors));
		result.add(pivot);
		result.addAll(quickSort(biggers));
		
		return result;
		
	}
	
}
