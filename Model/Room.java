package Model;


public class Room implements RoomInterface{
	
	private String rmId;
	private String rmDoor;
	private String rmName;
	private String rmDescript;
	private String rmLevel;
	
	public Room(String rmId, String rmDoor, String rmName) {
		this.rmId = rmId;
		this.rmDoor = rmDoor;
		this.rmName = rmName;
		
	}

	
	@Override
	public String getRmDescript(String rmId) {
		if(rmId.equalsIgnoreCase("RM101"))
		{
			rmDescript = "The pink double doors in the middle of the south wall open to the main entry point to the\n mansion. This area is a full of bright colors, giving visitors a taste of the rest of the mansion. On west wall is a\n grand doorway leading to the rest of the rooms on the first level. A bright blue couch along the north wall\n faces\n the room. The walls are painted in a rainbow pattern with the colors Red, Orange,\n Yellow, Green, Blue, and Purple.";
		}
		
		if(rmId.equalsIgnoreCase("HW_L1"))
		{
			rmDescript = "You have entered the hallway to the mansion’s lower level.  There are several rooms in which\n you can freely roam on your quest.  The hallway walls are adorned with a mosaic gold leaf design. The doors that\n lead to various rooms are various shades of the rainbow.  Choose wisely!";
		}
		
		if(rmId.equalsIgnoreCase("RM102"))
		{
			rmDescript = "This room is full of comfy chairs and tables. The door on the north wall towards\n the east end of the room is solid pink. The chairs are colored Red, Orange, and Yellow. The Tables are colored Green,\n Blue, and Purple.";
		}
		
		if(rmId.equalsIgnoreCase("RM103"))
		{
			rmDescript = "This large room is the entertainment center. The door on the south wall of the room is bright\n blue and is directly in the middle of the wall. On the east end of the room is a stage with a television screen on the\n wall. Cabinets cover the north side of the room. In these cabinets are chairs, tables, Dvds, video games, and other\n entertainment items.";
		}
		
		if(rmId.equalsIgnoreCase("RM104"))
		{
			rmDescript = "This rectangular room is full of all sorts of arcade games. A burnt sienna door is on the\n south wall towards the west end of the room. There are always loud noises and lots of activities going on. This\n is where the kids hang out while the adults talk.";
		}
		
		if(rmId.equalsIgnoreCase("RM105"))
		{
			rmDescript = "This rectangular room is the best kitchen you’ll find in the land. A dark yellow door\n stands on the north wall. This room contains any cooking appliance or utensil one will ever need. One can often\n find cooks rushing back and forth preparing food.";
		}
		
		if(rmId.equalsIgnoreCase("RM106"))
		{
			rmDescript = "This large L-shaped room has a large dining table in the middle. A door on the south wall is a\n colored Burnt Sienna. This room is used for all the meals and anytime someone needs to eat.\n The large table can seat up to 20 and is surrounded by comfy chairs.";
		}
		
		if(rmId.equalsIgnoreCase("RM107"))
		{
			rmDescript = "This area is used as a staging area. A door on the north wall is light green.\n Closets in the west and south walls store food for the cooks.";
		}
	
		return rmDescript;
	}

	@Override
	public String getRmLevel() {
		
		return rmLevel;
	}

	@Override
	public String getRmId() {
		// TODO Auto-generated method stub
		return rmId;
	}

	@Override
	public String getRmName() {
		// TODO Auto-generated method stub
		return rmName;
	}

	@Override
	public String getRmDoor() {
		// TODO Auto-generated method stub
		return rmDoor;
	}
	
	
}
