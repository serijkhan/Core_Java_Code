class B{
	static void m1(){
		System.out.println("A m1");
	}
}


class C{
	static void m2(){
		System.out.println("B m2");
	}
	public static void main(String[] args){
		System.out.println("B main");
		m2();
		B.m1();
	}
}