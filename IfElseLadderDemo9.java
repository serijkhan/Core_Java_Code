import java.io.*;
class IfElseLadderDemo9{
      public static void main(String...args)throws Exception{
 
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br= new BufferedReader (isr);
 System.out.println("Enter your number");

 String str = br.readLine( );

 int num = Integer.parseInt(str);

 if(num% 7 == 2){
 System.out.println("It is prime number");
 }else{
 System.out.println("It is not prime number");
 }
 }
 }