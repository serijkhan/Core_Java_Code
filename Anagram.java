class Anagram{
public static void main(String[] args){
String s1 = args[0];
String s2 = args[1];
if(s1.length () !=s2.length() ){
System.out.println("Give String are not anagram");
return;
}
char a[] = s1.toStringArray ();
char b[] = s2.toStringArray ();

Arrays.sort(a);
Array.sort(b);

boolean flag = Array.equal(a,b);
if(flag){
System.out.println("Given string are anagram");
}else{
System.out.println("Give string are not anagram");
}
}
}
