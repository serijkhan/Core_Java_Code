import java.io.*;
class RoleFinder{
	public static void main(String...args) throws Exception {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String  str= br.readLine();
		int exp = Integer.parselnt(str);

		if(exp >= 0 && exp<= 2){
			System.out.println("Associate Engineer");
        }else if (exp >=3 && exp<=5){
			System.out.println("Software Engineer");
		}else if(exp >=6 && exp <=9){
			System.out.println("Sr. Software Engineer");
		}else if(exp >=10 && exp <=13){
			System.out.println("Manager");
		}else{
			System.out.println("Role is Not Found);

        {
			{
}