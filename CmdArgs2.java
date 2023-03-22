class CmdArgs2{
public static void main(String [] a) {
System.out.println("Total Cmd Args :: " + a.length );
String s1 = a [0];
String s2 = a [1];

int x = Integer.parseInt (s1);
int y = Integer.parseInt (s2);

System.out.println (x+y);
}
}
