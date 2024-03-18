package kr.co.kosa;

public class MyDate {

	private	int	day;
	private	int	month;
	private	int	year;
	
	
	public static void main(String[] args) {

	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		if(	(day<1)	||	(day>31)	)	{
		 throw	new	RuntimeException("잘못된	날짜	입력됨");
		}	
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

}
