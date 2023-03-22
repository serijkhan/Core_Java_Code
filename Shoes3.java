import java.io.*;
class Shoes3{
	public static void main(String...args) throws Exception {

		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("Enter your Brand");
		String brand = br.readLine( );

		Switch (brand); {

			       case "Nike" :System.out.println("Just do it");
			   break;
			   case "Adidas" :System.out.println(" Impossible is nothing");
			   break;
			   case "Puma" :System.out.println("Forever faster");
			   break;
			   case "Reebok" :System.out.println("I am what i am");
			   break;
			   default :System.out.println("Brand Not Found");
		}
	}

}