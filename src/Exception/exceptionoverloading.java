class A{
	   int a;

	   void throwException(){
		System.out.println("Inside class A ");
		throw new ArithmeticException();
	}
	}

	class B extends A{
		int b ;
    	void throwException(){
		System.out.println("Inside class B ");
		throw new ArithmeticException();
	}

	   void overridethrow(){
	   	System.out.println("Inside class B ");
	   	super.throwException();
	   }
	}

	class C extends B{
		int c ;
    	void throwException(){
		System.out.println("Inside class C ");
		throw new ArithmeticException();
	}
	   void overridethrow(){
	   	System.out.println("Inside class C ");
	   	super.throwException();
	   }
	}

	class HierarchyDriver{
		public static void main(String []args){
		
		try{
		A a = new A();
		a.throwException();

		B b = new B();
		System.out.print("Throwing exception in B");
		b.throwException();
        System.out.print(" Overriding exception in B");
        b.overridethrow();

        C c = new C();
		System.out.print("Throwing exception in C");
		c.throwException();
        System.out.print(" Overriding exception in C");
        c.overridethrow();

     }

     catch(ArithmeticException e){
     	System.out.print("Exception");
     }


		
}

	}
    