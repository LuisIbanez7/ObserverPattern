
public class Subsriber {

	public static void main(String[] args) {
		Follower firstFollower = new Follower("Luis");
		Follower secondFollower = new Follower("Wesley");
		Follower thirdFollower = new Follower("Rocio");
		Follower fourthFollower = new Follower("Castles");
		
		Channel MrBeast = new Channel("MrBeast", "Not Live");
		MrBeast.registerObserver(firstFollower);
		MrBeast.registerObserver(secondFollower);
		MrBeast.registerObserver(thirdFollower);
		MrBeast.registerObserver(fourthFollower);
		MrBeast.setStatus("Live");
		MrBeast.removeObserver(firstFollower);
		MrBeast.setStatus("Not Live");
	}

}
