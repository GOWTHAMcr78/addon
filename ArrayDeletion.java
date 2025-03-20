

import java.util.Arrays;

import java.util.Scanner;



public class ArrayDeletion {

	public static void main(String[] args) {

		Scanner rk=new Scanner(System.in);

		int[] arr=new int[20];

		System.out.println("enter ur array size");

		int size=rk.nextInt();

		

		for(int i=0;i<size;i++) {

			arr[i]=rk.nextInt();

			

		}

		for(int i=0;i<size;i++) {

			System.out.println(arr[i]+" ");

			

		}

		System.out.println("enter u r position to delete");

		int del=rk.nextInt();

		//1 2 4 5 6 > example num

		for(int pos=del-1;pos<size;pos++)

		{

			arr[pos]=arr[pos+1];

			

		}

		size--;

		System.out.println(Arrays.toString(arr));

		

//		arr[del-1]=0;

//		System.out.println(Arrays.toString(arr));

	}



}

