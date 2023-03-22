class EmpPf5{
	public static void main(String...arg){

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);

		System.out.println("Enter Basic Salary");
		String str = br.readLine( );

		double BasicSalary = Double.parseDouble ( str );

		double pf = basicSalary*12/100;
		System.out.println(pf);
	}

}