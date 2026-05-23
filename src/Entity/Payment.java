package Entity;

public class Payment {
       
	 private int paymentId;
	    private int reservationId;

	    private String paymentDate;
	    private double paymentAmount;

	    private String paymentMethod;
	    private String paymentStatus;
		public Payment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Payment(int paymentId, int reservationId, String paymentDate, double paymentAmount, String paymentMethod,
				String paymentStatus) {
			super();
			this.paymentId = paymentId;
			this.reservationId = reservationId;
			this.paymentDate = paymentDate;
			this.paymentAmount = paymentAmount;
			this.paymentMethod = paymentMethod;
			this.paymentStatus = paymentStatus;
		}
		public Payment(int reservationId, String paymentDate, double paymentAmount, String paymentMethod,
				String paymentStatus) {
			super();
			this.reservationId = reservationId;
			this.paymentDate = paymentDate;
			this.paymentAmount = paymentAmount;
			this.paymentMethod = paymentMethod;
			this.paymentStatus = paymentStatus;
		}
		public int getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}
		public int getReservationId() {
			return reservationId;
		}
		public void setReservationId(int reservationId) {
			this.reservationId = reservationId;
		}
		public String getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(String paymentDate) {
			this.paymentDate = paymentDate;
		}
		public double getPaymentAmount() {
			return paymentAmount;
		}
		public void setPaymentAmount(double paymentAmount) {
			this.paymentAmount = paymentAmount;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		@Override
		public String toString() {
			return "Payment [paymentId=" + paymentId + ", reservationId=" + reservationId + ", paymentDate="
					+ paymentDate + ", paymentAmount=" + paymentAmount + ", paymentMethod=" + paymentMethod
					+ ", paymentStatus=" + paymentStatus + "]";
		}
	    
	    
}
