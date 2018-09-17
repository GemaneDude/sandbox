package Main;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Classes.Team;
import Classes.TeamFactory;

public class Match {
	private TeamFactory teams;
	private String fixture1, fixture2, fixture3, fixture4, fixture5, fixture6, fixture7, fixture8;
	private List<Team> teamList;
	private List<String> fixtures;

	public Match() {
		teams = new TeamFactory();
		teamList = teams.getTeams();
	}

	public void createFixtures() {
		fixture1 = teamList.get(0).getName()  + " - " + teamList.get(1).getName();
		fixture2 = teamList.get(2).getName()  + " - " + teamList.get(3).getName();
		fixture3 = teamList.get(4).getName()  + " - " + teamList.get(5).getName();
		fixture4 = teamList.get(6).getName()  + " - " + teamList.get(7).getName();
		fixture5 = teamList.get(8).getName()  + " - " + teamList.get(9).getName();
		fixture6 = teamList.get(10).getName()  + " - " + teamList.get(11).getName();
		fixture7 = teamList.get(12).getName()  + " - " + teamList.get(13).getName();
		fixture8 = teamList.get(14).getName()  + " - " + teamList.get(15).getName();

		fixtures = new ArrayList<>();
		fixtures.add(fixture1);
		fixtures.add(fixture2);
		fixtures.add(fixture3);
		fixtures.add(fixture4);
		fixtures.add(fixture5);
		fixtures.add(fixture6);
		fixtures.add(fixture7);
		fixtures.add(fixture8);

		//System.out.println(fixture1 + "\n" + fixture2 + "\n" + fixture3 + "\n" + fixture4 + "\n" + fixture5 + "\n" + fixture6 + "\n" + fixture7 + "\n" + fixture8 + "\n");
	}

	public void playGames() {
		Random random = new Random();
		Random randomScore = new Random();

		int j = 0;
		for(int i=0; i<fixtures.size();i++) {
			int number = random.nextInt(10)+1;
			if(number<=5) {									//5 chances in 10 home team wins
				int score1 = randomScore.nextInt(3)+1; 
				int score2 = randomScore.nextInt(3);
				if(score1 == score2) {
					score2-=1;
				}
				else if(score1 < score2) {
					score1 += score2;
					score1 -= 2;
					score2 -= 2;
				}
				System.out.println(fixtures.get(i) + "\n" + teamList.get(j).getName() + " wins " + score1 + "-" + score2);

				if(score1 != 0) {
					System.out.println("Goals " + teamList.get(j).getName() + ": ");
				}
				if(score2 != 0) {
					System.out.println("Goals " + teamList.get(j+1).getName() + ": ");
					System.out.print("\n");
				}
				else {
					System.out.print("\n");
				}
			}
			else if(number>5 && number <=8) {				//3 chances in 10 for a draw
				int score1 = randomScore.nextInt(4);
				System.out.println(fixtures.get(i) + "\n" + "It's a draw: " + score1 + "-" + score1);

				if(score1 != 0) {
					System.out.println("Goals " + teamList.get(j).getName() + ": ");
					System.out.println("Goals " + teamList.get(j+1).getName() + ": ");
					System.out.print(" \n");
				}
				else {
					System.out.print("\n");
				}
			}
			else {											//2 chances in 10 away team wins
				int score1 = randomScore.nextInt(3);
				int score2 = randomScore.nextInt(3)+1;
				if(score1 == score2) {
					score1-=1;
				}
				else if(score1 > score2) {
					score2 += score1;
					score1 -= 2;
					score2 -= 2;
				}
				System.out.println(fixtures.get(i) + "\n" + teamList.get(j+1).getName() + " wins " + score1 + "-" + score2);

				if(score1 != 0) {
					System.out.println("Goals " + teamList.get(j).getName() + ": ");
				}

				if(score2 != 0) {
					System.out.println("Goals " + teamList.get(j+1).getName() + ": ");
					System.out.print("\n");
				}
			}
			j += 2;
		}
	}


	public static void main(String[] args) {
		Match match = new Match();
		match.createFixtures();
		match.playGames();
	}

}

