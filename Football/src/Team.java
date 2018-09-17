import java.util.List;

public class Team {
	private String name;
	private int strength;
	private List<Player> players;
	
	public Team(String name, int strength, List<Player> players) {
		this.name = name;
		this.strength = strength;
		this.players = players;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public List<Player> getPlayers(){
		return players;
	}
}
