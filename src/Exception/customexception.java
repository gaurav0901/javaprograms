class MyException extends Exception{
	private int detail;
	MyException(int a){
		detail=a;
	}
	public String toString(){
		return "MyException["+ detail+"]";
	}
}
class CustomException {
	static void compute(int a) throws MyException{
		System.out.println("Called Compute(" + a + ")");
		if(a>10)
			throw new MyException(a);
		System.out.println("Normal Exit");
	}
	public static void main(Sting args[]){
		try {
			comput(1);
			compute(20);
		}
		catch(MyException e)
		{
			System.out.println("Caught" +e);
		}

	}
}