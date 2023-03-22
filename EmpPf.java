class Marriage{

	public static void main(String...args){

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter Your Age");
		String str1 = br readLine ();
		int age = Integer.pareslnt (str1);

		System.out.println("Enter Your Salary");
		String str2 = br.readLine ();
		Double salary = Double.parseDouble(str2);


		if ( age<30 && salary>100000 ){
			System.out.println("You are eligible for marriage");
		}else{
			System.out.println("You are not eligible for marriage");

		
		}
	}
}
