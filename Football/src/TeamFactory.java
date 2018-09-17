import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamFactory {
	private Team team1, team2, team3, team4, team5, team6, team7, team8, team9, team10, team11, team12, team13, team14, team15, team16;
	private List<Team> teamList;
	private List<Player> playerList1;
	
	public TeamFactory() {
		team1 = new Team("Anderlecht", 100, playerList1);
		team2 = new Team("Club Brugge", 100, playerList1);
		team3 = new Team("Genk", 100, playerList1);
		team4 = new Team("Gent", 100, playerList1);
		team5 = new Team("Standard de Liège", 100, playerList1);
		team6 = new Team("Antwerp", 80, playerList1);
		team7 = new Team("Oostende", 70, playerList1);
		team8 = new Team("Cercle Brugge", 50, playerList1);
		team9 = new Team("Charleroi", 80, playerList1);
		team10 = new Team("Eupen", 50, playerList1);
		team11 = new Team("Sint-Truiden", 70, playerList1);
		team12 = new Team("Zulte-Waregem", 70, playerList1);
		team13 = new Team("Kortrijk", 60, playerList1);
		team14 = new Team("Lokeren", 60, playerList1);
		team15 = new Team("Waasland-Beveren", 60, playerList1);
		team16 = new Team("Mouscron", 50, playerList1);	
		
		teamList = new ArrayList<Team>();
		teamList.add(team1);
		teamList.add(team2);
		teamList.add(team3);
		teamList.add(team4);
		teamList.add(team5);
		teamList.add(team6);
		teamList.add(team7);
		teamList.add(team8);
		teamList.add(team9);
		teamList.add(team10);
		teamList.add(team11);
		teamList.add(team12);
		teamList.add(team13);
		teamList.add(team14);
		teamList.add(team15);
		teamList.add(team16);	
		
		Collections.shuffle(teamList);
	}

	
	public List<Team> getTeams(){
		return teamList;
	}
	
	public void showTeams() {
		System.out.println(teamList);
	}
	
	public static void main(String[] args) {
		TeamFactory teams = new TeamFactory();
		teams.showTeams();
	}
}
