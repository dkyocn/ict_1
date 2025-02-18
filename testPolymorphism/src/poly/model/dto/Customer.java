package poly.model.dto;

public class Customer extends Person {

	private String address;
	private double point;

	// Constructor
	public Customer() {
		super();
	}

	public Customer(String name, int age, char gender, String email, String phone, String address, double point) {
		super(name, age, gender, email, phone);

		this.address = address;
		this.point = point;
	}

	// Getter & Setter

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Customer [" + super.toString() + ", address=" + address + ", point=" + point + "]";
	}

	@Override
	public boolean equals(Object obj) {

		// 두 객체의 필드값들이 모두 일치하는지 확인하는 코드로 변경함
		Customer other = (Customer)obj;
		return super.equals(obj) && this.address.equals(other.address) && this.point == other.point;
	}

	@Override
	public Object clone() {

		// this 위치의 객체 필드값들을 그대로 복사한 새 객체를 만들어서 리턴함
		return new Customer(this.getName(), this.getage(), this.getGender(), this.getEmail(), this.getPhone(),
			this.address, this.point);

	}
}
