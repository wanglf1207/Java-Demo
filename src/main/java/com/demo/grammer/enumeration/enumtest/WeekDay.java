package com.demo.grammer.enumeration.enumtest;
//使用普通类实现了枚举
public class WeekDay {

	private WeekDay(){}

	public static final WeekDay SUN = new WeekDay();
	public static final WeekDay MON = new WeekDay();
	public static final WeekDay TUE = new WeekDay();
	public static final WeekDay WED = new WeekDay();
	public static final WeekDay THU = new WeekDay();
	public static final WeekDay FRI = new WeekDay();
	public static final WeekDay SAT = new WeekDay();

	public WeekDay nextDay() {
		if(this == SUN)
			return MON;
		else if(this == MON)
			return TUE;
		else if(this == TUE)
			return WED;
		else if(this == WED)
			return THU;
		else if(this == THU)
			return FRI;
		else if(this == FRI)
			return SAT;
		else if (this == SAT)
			return SUN;
		else
			return null;
	}

	@Override
	public String toString() {
		if(this == SUN)
			return "SUN";
		else if(this == MON)
			return "MON";
		else if(this == TUE)
			return "TUE";
		else if(this == WED)
			return "WED";
		else if(this == FRI)
			return "FRI";
		else if(this == SAT)
			return "SAT";
		else
			return null;
	}
}
