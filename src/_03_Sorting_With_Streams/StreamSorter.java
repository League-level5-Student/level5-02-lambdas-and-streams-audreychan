package _03_Sorting_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt();
		}
		System.out.println("");
		//1. Convert the Integer array to Stream object.
		Stream<Integer> arrStream = Arrays.stream(nums);
		
		//2. Use the sorted method of the stream to sort the numbers.
		arrStream = arrStream.sorted();
		
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		arrStream.forEach((a)->System.out.println(a));
	}
}
