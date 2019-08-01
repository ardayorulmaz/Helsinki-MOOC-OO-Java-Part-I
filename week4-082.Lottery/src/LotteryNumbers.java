
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    
  
    public LotteryNumbers() {
       
        drawNumbers();
       
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int drawn;
                

        while (this.numbers.size() < 7) {
            drawn = random.nextInt(40);
            if (!containsNumber(drawn) && drawn >0) 
            {
            this.numbers.add(drawn);
            }
        }

        // We'll format a list for the numbers
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
        // Test here if the number is already in the drawn numbers
    }
}
