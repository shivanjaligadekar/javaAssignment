package association;

public class Team {
	private String name;
	private int noOfPlayers;
	
	public Team(String name, int noOfPlayers) {
		super();
		this.name = name;
		this.noOfPlayers = noOfPlayers;
	}
	public String getName() {
		return name;
	}
	public void noOfPlayer() {
		System.out.println("No of players is:"+noOfPlayers);
	}
	
	
	

}
