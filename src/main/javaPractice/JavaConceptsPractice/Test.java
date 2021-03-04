package JavaConceptsPractice;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.methodOne();
		Child c = new Child();
		c.methodOne();
		Parent p1 = new Child();
		p1.methodOne();
		
		///if parent and child class are static then it will be treated as method hiding then output will be
		//parent class
		//child class
		//parent class
		
		///if parent and child class are non static then it will be treated as method overrring then output will be
				//parent class
				//child class
				//child class

	}

}
