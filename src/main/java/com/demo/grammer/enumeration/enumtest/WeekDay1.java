package com.demo.grammer.enumeration.enumtest;
//使用普通类实现了枚举
public abstract class WeekDay1 {

	private WeekDay1(){}
	//匿名内部类
	public static final WeekDay1 SUN = new WeekDay1(){

		@Override
		public WeekDay1 nextDay() {
			return MON;
		}

	};
	public static final WeekDay1 MON = new WeekDay1(){

		@Override
		public WeekDay1 nextDay() {
			return TUE;
		}

	};
	public static final WeekDay1 TUE = new WeekDay1(){

		@Override
		public WeekDay1 nextDay() {
			return WED;
		}

	};
	public static final WeekDay1 WED = new WeekDay1(){

		@Override
		public WeekDay1 nextDay() {
			return THU;
		}

	};
	public static final WeekDay1 THU = new WeekDay1() {

		@Override
		public WeekDay1 nextDay() {
			return FRI;
		}

	};
	public static final WeekDay1 FRI = new WeekDay1() {

		@Override
		public WeekDay1 nextDay() {
			return SAT;
		}

	};
	public static final WeekDay1 SAT = new WeekDay1() {

		@Override
		public WeekDay1 nextDay() {
			return SUN;
		}

	};

	public abstract WeekDay1 nextDay();

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
