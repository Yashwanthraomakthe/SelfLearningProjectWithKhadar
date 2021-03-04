package JavaConceptsPractice;

public class B extends A{
	
	B()
	{
		//super();//by default this statment will be there for default construtor no need to give
		System.out.println("Child");
		System.out.println(this.hashCode());
	}

	
}
