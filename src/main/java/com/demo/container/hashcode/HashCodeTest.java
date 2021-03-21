package com.demo.container.hashcode;

public class HashCodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(new String("spring").hashCode());
		System.out.println(new String("spring").equals(new String("spring")));
		
		Car car1 = new Car(4,"benz");
		Car car2 = new Car(4,"benz");
		
		System.out.println("car1.equals(car2) = " + car1.equals(car2));
		System.out.println("car1 == car2 = " + (car1 == car2));
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		System.out.println(car1.equals(new String("4")));
	}

}

class Car {
	
	private int wheel;
	private String brand;
	
	Car(int wheel, String brand) {
		super();
		this.wheel = wheel;
		this.brand = brand;
	}
	
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + wheel;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (wheel != other.wheel)
			return false;
		return true;
	}
	
}