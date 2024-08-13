package grokkingAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {5, 6, 7, 8, 9};
		
		System.out.println(binarySearch(arr, 8)); // 3
		System.out.println(binarySearch(arr, 10)); // -1
		
	}
	
	// In binary Search we have 2 pointers;
	// 1 pointing to the first index of array;
	// The other points to the last index;
	// By these 2 pointers, another pointer is created, the middle pointer
	// We check if the element at the middle index is equal to our target
	// If yes, return middle
	// If our element at middle index is smaller than the target, our first pointer gets middle index + 1;
	// If our element at middle index is greater than the target, our last pointer gets middle index - 1;
	// As longs as our first pointer is smaller than the last, we continue.
	public static int binarySearch(int[] arr, int target) {
		int firstPointer = 0;
		int lastPointer = arr.length - 1;
		
		while (firstPointer <= lastPointer) {
			int middlePointer = (firstPointer + lastPointer) / 2;
			int attempt = arr[middlePointer];
			
			if (attempt == target) return middlePointer;
			else if (attempt < target) firstPointer = middlePointer + 1;
			else lastPointer = middlePointer - 1;
		}
		
		return -1;
	}
	
}
