package Entity;

public class Staff {
     
	  private int staffId;
	    private String staffName;
	    private String role;
	    private String phone;
	    private double salary;
	    private String shiftTiming;
		public Staff() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Staff(int staffId, String staffName, String role, String phone, double salary, String shiftTiming) {
			super();
			this.staffId = staffId;
			this.staffName = staffName;
			this.role = role;
			this.phone = phone;
			this.salary = salary;
			this.shiftTiming = shiftTiming;
		}
		public Staff(String staffName, String role, String phone, double salary, String shiftTiming) {
			super();
			this.staffName = staffName;
			this.role = role;
			this.phone = phone;
			this.salary = salary;
			this.shiftTiming = shiftTiming;
		}
		public int getStaffId() {
			return staffId;
		}
		public void setStaffId(int staffId) {
			this.staffId = staffId;
		}
		public String getStaffName() {
			return staffName;
		}
		public void setStaffName(String staffName) {
			this.staffName = staffName;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getShiftTiming() {
			return shiftTiming;
		}
		public void setShiftTiming(String shiftTiming) {
			this.shiftTiming = shiftTiming;
		}
		@Override
		public String toString() {
			return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", role=" + role + ", phone=" + phone
					+ ", salary=" + salary + ", shiftTiming=" + shiftTiming + "]";
		}
	    
	    
}
