package Entity;

public class Customer {
	private int customerId;
    private String customerName;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String idProof;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String gender, String phone, String email, String address,
			String idProof) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.idProof = idProof;
	}
	public Customer(String customerName, String gender, String phone, String email, String address, String idProof) {
		super();
		this.customerName = customerName;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.idProof = idProof;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", phone=" + phone + ", email=" + email + ", address=" + address + ", idProof=" + idProof + "]";
	}
    
    
}
