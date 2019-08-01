/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.ArrayList;

public class Team {

    private ArrayList<Player> teamlist = new ArrayList<Player>();
    private String teamName;
    private int maxSize;
    

    public Team(String teamName) {
        this.teamName = teamName;
        this.maxSize=16;
       
       }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if (this.teamlist.size() < this.maxSize) {
            this.teamlist.add(player);
                  }
    }

    public void printPlayers() {
        for (Player player : this.teamlist) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.teamlist.size();
    }

    public int goals() {
        int goals=0;
        for (Player player : teamlist) {
           goals += player.goals();
        }
        return goals;
    }

}
