class Date{
	int month, day, year;
	Date(){
		month = 1;
		day = 1;
		year = 2000;
	}

	Date(int month, int day, int year){
       this.month=month;
       this.day=day;
       this.year=year;
	}
	void displayDate(){
		System.out.println(month + "/" + day + "/" + year);
	}
}
public class DateTest{
	public static void main(String[] args){
		//Date d = new Date();
		Date d = new Date(2,4,19);
		d.displayDate();
	}
}