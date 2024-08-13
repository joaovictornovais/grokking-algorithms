package grokkingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(239, 12, 2484, 291, 29, 1, 2, 35));
		
		System.out.println(selectionSort(list));
	}
	
	/* In selection sort we create a new list
	 * Then we look for the smallest element in our original list
	 * After that, add this element to the new list and remove from the original
	 * Loop that.
	 */
	public static List<Integer> selectionSort(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();
		int size = list.size();
		
		for (int i=0; i<size; i++) {
			int smallestIndex = smallestElement(list);
			newList.add(list.get(smallestIndex));
			list.remove(smallestIndex);
		}
		
		return newList;
	}
	
	public static int smallestElement(List<Integer> list) {
		int smallestElement = list.get(0);
		int smallestIndex = 0;
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) < smallestElement) {
				smallestElement = list.get(i);
				smallestIndex = i;
			}
		}
		
		return smallestIndex;
	}
	
}
