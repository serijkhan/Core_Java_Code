import java.util.*;
class MultiDimensionArray{
	public static void main(String...args){
		int arr[] [] = new int [2] [2];

		arr[0] [0] =100;
		arr[0] [1] =200;
		arr[1] [0]=300;
		arr[1] [1]=400;
		for (int i=0;i < arr.length ; i++){
			for (int j=0;j < arr.length ;j++){
				System.out.println(arr[i] [j]);
			
			}
		
		}
	}
}