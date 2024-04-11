/**
 * Jasmine Girls Hostel wants you to create a small application for them to assign rooms to members. 
 * You need to implement the classes based on the class diagram and description given below.
 * Member
 * Member(int memberId, String name)
 * Initialize the memberId and name instance variables appropriately with the values passed to the constructor.
 * Implement the appropriate getter and setter methods.
 * Room 
 * Room()
 * Generate the roomNo using the static variable roomCounter. The value of roomNo should start from 500 and should be 
 * incremented by 1 for the subsequent values. Initialize the roomNoCounter in static block.
 * Initialize the capacity instance variable to 4.
 * Implement the appropriate getter and setter methods.  
 * Admin 
 * assignRoom(Room[] rooms, Member member)
 * Assign a room to the member using the below conditions:
 * One room can accommodate 4 members. 
 * Allocate the first room that is empty.O
 * nce a room is fully occupied, only then a new room should be assigned.
 * Update the capacity of the allocated room accordingly.
 * Test the functionalities using the provided Tester class.
 * Sample Input and Output
 * Parameters                   Values
 * rooms                {room1, room2, room3,room4, room5}
 * memeber   memberid     101
 *           name         Serena
 * 
 * Parameters                   Values
 * rooms                {room1, room2, room3,room4, room5}
 * memeber   memberid     101
 *           name         Martha
 * 
 * Parameters                   Values
 * rooms                {room1, room2, room3,room4, room5}
 * memeber   memberid     102
 *           name         Martha
 * 
 * Parameters                   Values
 * rooms                {room1, room2, room3,room4, room5}
 * memeber   memberid     103
 *           name         Nia
 * 
 * Parameters                   Values
 * rooms                {room1, room2, room3,room4, room5}
 * memeber   memberid     104
 *           name         Maria
 * 
 * Parameters                   Values
 * rooms                {room1, room2, room3,room4, room5}
 * memeber   memberid     105
 *           name         Eva
 * 
 * Output
 * Hi Serena, your room number is 500
 * Hi Martha, your room number is 500
 * Hi Nia, your room number is 501
 * Hi Maria, your room number is 500
 * Hi Eva, your room number is 501
 */
class Room {
    private int roomNo;
    private int capacity;
    private static int roomCounter = 500;
    static {
        roomCounter = 500;
    }
    public Room() {
        this.roomNo = roomCounter++;
        this.capacity = 4;
    }
    public int getRoomNo() {
        return roomNo;
    }
    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
class Member {
    private int memberId;
    private String name;
    private Room room;
    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
}
class Admin {
    public void assignRoom(Room[] rooms, Member member) {
        for (Room room : rooms) {
            if (room.getCapacity() > 0) {
                member.setRoom(room);
                room.setCapacity(room.getCapacity() - 1);
                break;
            }
        }
    }
}
public class Assignment_5 {
    public static void main(String[] args) {
        Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4, room5 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
		Member member5 = new Member(105, "Eva");
		
		Member[] members = { member1, member2, member3, member4, member5 };
		
		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
    }
}
