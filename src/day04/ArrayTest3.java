package day04;

import java.util.concurrent.ForkJoinPool;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class ArrayTest3 {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] arr = new int[4][4];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++; 
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

