package Generics;
import java.util.*;
public class ComparableTest {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(5);
		nums.add(3);
		nums.add(7);
		nums.add(1);
		
		nums.forEach(System.out::println);
	}

}
