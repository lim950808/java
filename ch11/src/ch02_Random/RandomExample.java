package ch02_Random;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		//new Random(seed)
		Random random = new Random(5);
		for(int i=0;i<6;i++) {
			selectNumber[i]=random.nextInt(45)+1;
		}
		for(int i=0;i<6;i++) {
			System.out.println(selectNumber[i]+" ");
		}
		System.out.println();
		
		boolean[] arr = new boolean[6];
		for(int i=0;i<6;i++) {
			arr[i] = random.nextBoolean();
		}
		for(int i=0;i<6;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
