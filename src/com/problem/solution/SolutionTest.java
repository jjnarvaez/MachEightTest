package com.problem.solution;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Solution solution;
	Set<Integer> set;
	
	@Before
	public void setUp() {
		solution = new Solution();
		set = new HashSet<>();
	}
	
	@Test
	public void testNotFoundAddsForTarget() {
		set.addAll(Arrays.asList(1,3));
		List<int[]> results = solution.findPairNumbers(set,1);
		
		assertEquals(0,results.size());
		
	}
	
	@Test
	public void testOnlyOneFound() {
		set.addAll(Arrays.asList(1,3));
		List<int[]> results = solution.findPairNumbers(set,4);
		
		assertEquals(1,results.size());
		for(int[] result : results) {
			assertEquals(4f, (float)(result[0] + result[1]),0);
		}
	}
	
	@Test
	public void testEmptyList() {
		set.addAll(Arrays.asList());
		List<int[]> results = solution.findPairNumbers(set,4);
		
		assertEquals(0,results.size());
		
	}
	
	@Test
	public void testSuccessCase1() {
		set.addAll(Arrays.asList(1,9,5,0,20,-4,12,16,7));
		List<int[]> results = solution.findPairNumbers(set, 12);
		
		assertEquals(3,results.size());
		for(int[] result : results) {
			assertEquals(12f, (float)(result[0] + result[1]),0);
		}
	}
	


}
