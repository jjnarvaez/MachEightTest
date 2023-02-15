package com.problem.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainApplication {

	public static void main(String[] args) {
		Set<Integer> list = new HashSet<>();
		int target = 0;		
		try {
			File file = new File("resources/input.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				for (String element : sc.next().split(",")) {
					list.add(Integer.valueOf(element));
				}
				target = sc.nextInt();
			}
			sc.close();
			
			Solution solution = new Solution();
			List<int[]> result = solution.findPairNumbers(list,target);			
			result.forEach(x->System.out.printf("%d,%d\n",x[0],x[1]));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}

		
	}

}
