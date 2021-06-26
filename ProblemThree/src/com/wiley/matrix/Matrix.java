package com.wiley.matrix;

public class Matrix {
	public static int[][]array1;
	public static int [][]array2;
	public Matrix(int [][]array1,int [][]array2) {
		this.array1=array1;
		this.array2=array2;
	}
	public static int[][] getArray1() {
		return array1;
	}

	public static int[][] getArray2() {
		return array2;
	}
	
}
