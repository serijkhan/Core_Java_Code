class D{
	static void m1(){
		System.out.println("D m1");
	}
}


class E{
	static void m1(){
		System.out.println("E m1");
	}
}

class Test{
public static void main(String[] args){
	System.out.println("Test main");
	D.m1();
	E.m1();
}
}

