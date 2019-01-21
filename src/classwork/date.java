import java.util.*;
class date
{   int day,month,year;
	date()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Day");
    day=s.nextInt();
    System.out.println("Enter Month");
    month=s.nextInt();
    System.out.println("Enter Year");
    year=s.nextInt();
}
	
    date(int day,int month,int year)
	{
	this.day=day;
	this.month=month;
	this.year=year;
    }

    
    
	void display()
	{
		System.out.println("Date=" +day +"/"+month+"/"+year);
	}
}
class datetest
{
	public static void main(String arg[])
	{
		date d=new date();
		d.display();
		date d1 = new date(1,1,2000);
		d1.display();
	
}
}