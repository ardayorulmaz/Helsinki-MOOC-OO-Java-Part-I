import java.util.Scanner;
import nhlstats.NHLStatistics;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
 
        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players by penalty amount");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Statistics for PHI");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("Statistics for ANA");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
        
    }
}