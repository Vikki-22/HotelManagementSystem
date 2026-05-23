package Entity;

public class Reservation {
       
	 private int reservationId;
	    private int customerId;
	    private int roomId;

	    private String checkInDate;
	    private String checkOutDate;

	    private int totalDays;
	    private double totalAmount;

	    private String bookingStatus;

		public Reservation(int reservationId, int customerId, int roomId, String checkInDate, String checkOutDate,
				int totalDays, double totalAmount, String bookingStatus) {
			super();
			this.reservationId = reservationId;
			this.customerId = customerId;
			this.roomId = roomId;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.totalDays = totalDays;
			this.totalAmount = totalAmount;
			this.bookingStatus = bookingStatus;
		}

		public Reservation(int customerId, int roomId, String checkInDate, String checkOutDate, int totalDays,
				double totalAmount, String bookingStatus) {
			super();
			this.customerId = customerId;
			this.roomId = roomId;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.totalDays = totalDays;
			this.totalAmount = totalAmount;
			this.bookingStatus = bookingStatus;
		}

		public Reservation() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getReservationId() {
			return reservationId;
		}

		public void setReservationId(int reservationId) {
			this.reservationId = reservationId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public int getRoomId() {
			return roomId;
		}

		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}

		public String getCheckInDate() {
			return checkInDate;
		}

		public void setCheckInDate(String checkInDate) {
			this.checkInDate = checkInDate;
		}

		public String getCheckOutDate() {
			return checkOutDate;
		}

		public void setCheckOutDate(String checkOutDate) {
			this.checkOutDate = checkOutDate;
		}

		public int getTotalDays() {
			return totalDays;
		}

		public void setTotalDays(int totalDays) {
			this.totalDays = totalDays;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

		public String getBookingStatus() {
			return bookingStatus;
		}

		public void setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
		}

		@Override
		public String toString() {
			return "Reservation [reservationId=" + reservationId + ", customerId=" + customerId + ", roomId=" + roomId
					+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", totalDays=" + totalDays
					+ ", totalAmount=" + totalAmount + ", bookingStatus=" + bookingStatus + "]";
		}
	    
	    
}
