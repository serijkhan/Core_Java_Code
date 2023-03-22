class CharOcc{
public static void main(String[] args){
String s= "java";
char ch= 'a';

char arr[]=s.toCharrArray();
int count=0;
 for(int i = 0; i< arr.length;i++ ){
 if (arr[i] == 'a' ){
 count ++;
 }
 }
 System.out.println(count);
 }
 }
