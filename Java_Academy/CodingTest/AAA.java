package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AAA {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		 HashSet<Integer> map = new HashSet<>();
		 for(int i : nums) map.add(i);
	        int i = map.size() < nums.length /2 ?  map.size() : nums.length /2 ;
	        System.out.println(i);
	}
}
