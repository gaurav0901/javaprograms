class Exceptionques3{
	int i;
	Exceptionques3(int i){
		this.i=i;
	}
	void display(){
		System.out.print("i="+i);
	}
}
class exceptionexampledriver{
	public static void main(String[] args){
		try{
		Exceptionques3 e=null;
		e.display();
	}
	catch(NullPointerException e){
		System.out.print("Exception occured to null pointer");
	}
	}
}