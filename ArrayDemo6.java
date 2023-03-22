class ArrayDemo6{
	public static void main(String...args){
		int arr[]={15,7,3,1,4,7,20};
		int min= arr[0];
		int max= arr[0];

		for(int i=0;i< arr.length;i++){
			if(arr[1] > max){
				max=arr[i];
			}
			if(arr[i] < min){
				min=arr[i];
			}
		}
		System.out.println("Min Element::"+ min);
		System.out.println("Max Element::"+ max);
			
			}
}
