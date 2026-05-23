package Entity;

public class Room {
     
	   private int roomId;
	    private String roomNumber;
	    private String roomType;
	    private double pricePerDay;
	    private String roomStatus;
		public Room() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Room(int roomId, String roomNumber, String roomType, double pricePerDay, String roomStatus) {
			super();
			this.roomId = roomId;
			this.roomNumber = roomNumber;
			this.roomType = roomType;
			this.pricePerDay = pricePerDay;
			this.roomStatus = roomStatus;
		}
		public Room(String roomNumber, String roomType, double pricePerDay, String roomStatus) {
			super();
			this.roomNumber = roomNumber;
			this.roomType = roomType;
			this.pricePerDay = pricePerDay;
			this.roomStatus = roomStatus;
		}
		public int getRoomId() {
			return roomId;
		}
		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}
		public String getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(String roomNumber) {
			this.roomNumber = roomNumber;
		}
		public String getRoomType() {
			return roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
		public double getPricePerDay() {
			return pricePerDay;
		}
		public void setPricePerDay(double pricePerDay) {
			this.pricePerDay = pricePerDay;
		}
		public String getRoomStatus() {
			return roomStatus;
		}
		public void setRoomStatus(String roomStatus) {
			this.roomStatus = roomStatus;
		}
		@Override
		public String toString() {
			return "Room [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", pricePerDay="
					+ pricePerDay + ", roomStatus=" + roomStatus + "]";
		}
	    
	    
}
