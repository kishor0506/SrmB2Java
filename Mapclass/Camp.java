package Mapclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Camp {
	public static class Player {
        int score;
        String name;
        public Player(int s, String str) {
            score = s;
            name = str;
        }
    }
    public static class SortbyScore implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.score - o2.score;
        }
    }
    public static void main(String[] args) {
        ArrayList<Player> al = new ArrayList<>();
        al.add(new Player(54, "Rohit"));
        al.add(new Player(67, "Dhawan"));
        al.add(new Player(101, "Dhoni"));
        al.add(new Player(34, "virat"));
        Collections.sort(al, new SortbyScore());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).name + " " + al.get(i).score);
        }
    }
}
