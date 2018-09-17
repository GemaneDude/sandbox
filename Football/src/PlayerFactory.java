import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerFactory {
	private Player player1, player2, player3, player4, player5, player6, player7, player8, player9, player10;
	private List<Player> playerList1;
	
	public PlayerFactory() {
		player1 = new Player("Alexis Saelemaekers", "LB");
		player2 = new Player("Andy Najar", "RB");
		player3 = new Player("Sebastiaan Bornauw", "CB");
		player4 = new Player("Antonio Milic", "CB");
		player5 = new Player("Dennis Appiah", "CB");
		player6 = new Player("Jevhen Makarenko", "CM");
		player7 = new Player("Adrien Trebel", "CM");
		player8 = new Player("Pieter Gerkens", "CM");
		player9 = new Player("Landry Dimata", "FW");
		player10 = new Player("Ivan Santini", "FW");
		
		playerList1 = new ArrayList<Player>();
		playerList1.add(player1);
		playerList1.add(player2);
		playerList1.add(player3);
		playerList1.add(player4);
		playerList1.add(player5);
		playerList1.add(player6);
		playerList1.add(player7);
		playerList1.add(player8);
		playerList1.add(player9);
		playerList1.add(player10);
		
		Collections.shuffle(playerList1);
	}
	
	public List<Player> getPlayerList1(){
		return playerList1;
	}
	
	public void showPlayerList1() {
		System.out.println(playerList1);
	}
	
	public static void main(String[] args) {
		PlayerFactory players = new PlayerFactory();
		players.showPlayerList1();

	}

}
