package week1day3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arrNumber = {1,4,3,2,8,6,7,10,12,15};
		Arrays.sort(arrNumber);
		System.out.println("Modified Array:" + Arrays.toString(arrNumber));
		
		int j = 0;
		int k = 0;
		for(int i = 0; i < arrNumber.length; i++) {
			k = i + 1;
			if(arrNumber[i] != k + j) {
				int missingValue = k + j;
				System.out.println("i:" + missingValue);
				i = i - 1;
				j = j + 1;
			}
		}
	}

}
