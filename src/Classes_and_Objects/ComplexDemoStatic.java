class Complex{
	int real, imaginary;

	//Non-paramaterized constructor
	Complex(){}

	//Paramaterized Constructor
	Complex(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	/*Complex add(Complex c){
		Complex cadd = new Complex();
		cadd.real=real + c.real;
		cadd.imaginary= imaginary + c.imaginary;
		return cadd;
	}*/
}
class ComplexDemoStatic{
	public static void main(String[] args){
	Complex c1= new Complex(1,2);
	Complex c2= new Complex(3,4);
	Complex c3= new Complex();
	c3 = add(c1,c2);
	System.out.println("c1 = " + c1.real + " " + c1.imaginary);
	System.out.println("c2 = " + c2.real + " " + c2.imaginary);
	System.out.println("Sum = " + c3.real + " " + c3.imaginary);
    }

 	public static Complex add(Complex c1, Complex c2){
 		Complex c3 = new Complex();
 		c3.real= c1.real + c2.real;
 		c3.imaginary= c1.imaginary + c2.imaginary;
 		return c3;
 	}
}