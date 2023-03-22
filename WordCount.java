class WordCount{
      public static void main(String...args){
     

     String s = "    Hello         Hello    My   Friends";
     String[] arr = s.trim().split("\\s+");
     System.out.println(arr.length);
     }
     }