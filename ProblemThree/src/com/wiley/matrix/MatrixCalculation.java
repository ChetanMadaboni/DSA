package com.wiley.matrix;

public class MatrixCalculation {
	private int[][]array1={{1,2,3},{4,5,6},{7,8,9}};
	private int[][]array2={{1,2,3},{4,5,6},{7,8,9}};
	Matrix m=new Matrix(array1,array2);
	public void calculateAddition() {
		int [][]array1=m.getArray1();
		int [][]array2=m.getArray2();
		int [][]result=new int[array1.length][array2.length];
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				result[i][j]=array1[i][j]+array2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
