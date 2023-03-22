import java.io.*;
class EmpPf2{

	public static void main(String...args)throws Exception{

		InputStreamReader isr= new InputStreamReader (System.in);
		BufferedReader br= new BufferedReader (isr);

		System.out.println("Enter Basic Salary");
		String str= br.readLine ();

		double basicSalary = Double.parseDouble (str);

		Double pf = basicSalary*12/100;
		System.out.println(pf);

	}
}