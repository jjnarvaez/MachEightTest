package com.problem.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	
	public List<int[]> findPairNumbers(Set<Integer> list, Integer target) {
		List<int[]> result = new ArrayList<>();
		Set<Integer> found = new HashSet<>(); 
		for(Integer number : list) {
			int toFind= target-number;
			if(list.contains(toFind) && !found.contains(number)) {
				result.add(new int[]{number,toFind});
				found.add(toFind);
			}
		}
		return result;
		
	}

}
