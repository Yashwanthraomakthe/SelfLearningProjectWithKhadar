package JavaConceptsPractice;

public class OverloadedConstructor {
	
	OverloadedConstructor(double d){
		System.out.println("double argument constructor");
	}
	OverloadedConstructor(int i){
		System.out.println("int argument constructor");
	}
	OverloadedConstructor(){		
		System.out.println("no argument constructor");
	}
	public static void main(String[] args) {
		
		OverloadedConstructor t1 = new OverloadedConstructor();
		OverloadedConstructor t2 = new OverloadedConstructor(10);
		OverloadedConstructor t3 = new OverloadedConstructor(10.5);
		

	}

}
