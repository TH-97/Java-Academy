package day07.encap.good;

public class MyBirth {
	/*
	 * 1. month, year, ssn 에 대한 getter,setter
	 * 
	 * month - 1 ~12월 까지만 저장
	 * year = 1950 ~ 2023년 이하인 경우만 저장
	 * ssn = "-" 제거후에 13자리만 저장
	 */
	
	int month;
	int year;
	String ssn;
	int day;
	
	MyBirth(int month,int year,String ssn){
		this.month = month;
		this.year = year;
		this.ssn = ssn;
	}
	
	public void setMonth(int month) {
		if(month <=12 && month > 0) {
			this.month = month;
		}
	}
	public void setYear(int year) {
		if(year >=1950 && year <=2023) {
			this.year = year;
		}
	}
	public void setSsn(String ssn) {
		this.ssn = ssn.replace("-", "");
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String getSsn() {
		return ssn;
	}
	

}
