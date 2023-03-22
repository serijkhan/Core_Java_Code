class M{
public static void main(String[] args){
System.out.println("M main");
}
}


class F{
public static void main(String[] args){
System.out.println("K main");
M.main(new String[0]);
}
}