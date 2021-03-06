import java.util.*;

public class LongestIncrSubSeq{

	public static void main(String[] args){

		int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(findLength(arr));
	}

	public static int findLength(int[] arr){

		int[] tails = new int[arr.length];

		int size = 0;
		for(int x : arr){

			int i = 0;
			int j = size;

			while(i != j){

				int mid = (i + j)/2;

				if(x > arr[i]){
					i = mid + 1;
				}else{
					j = mid;
				}
			}

			tails[i] = x;

			if(i == size)
				size++;
		}

		return size;
	}

	
	public static void display(int[] arr){


			for(int ele : arr){
				System.out.print(ele + " ");
			}
			System.out.println();
		
	}

	public static void display(int[][] arr){


		for(int[] val : arr){

			for(int ele : val){
				System.out.print(ele + " ");
			}
			System.out.println();
		}

		
	}

	
}