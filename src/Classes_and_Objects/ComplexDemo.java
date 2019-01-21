class Complex{
	int real, imaginary;

	//Non-paramaterized constructor
	Complex(){}

	//Paramaterized Constructor
	Complex(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}

	Complex add(Complex c){
		Complex cadd = new Complex();
		cadd.real=real + c.real;
		cadd.imaginary= imaginary + c.imaginary;
		return cadd;
	}
}
class ComplexDemo{
	public static void main(String[] args){
	Complex c1= new Complex(1,2);
	Complex c2= new Complex(3,4);
	Complex c3= new Complex();
	c3 = c1.add(c2);
	System.out.println("c1 = " + c1.real + " " + c1.imaginary);
	System.out.println("c2 = " + c2.real + " " + c2.imaginary);
	System.out.println("Sum = " + c3.real + " " + c3.imaginary);
    }
}