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
import java.util.Scanner;

public class Birdwatch {

    private ArrayList<Bird> birdwatch;
    private String name;

    public Birdwatch(String name) {
        this.birdwatch = new ArrayList<Bird>();
        this.name = name;
    }

    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birdwatch.add(bird);
    }

    public void Statistics() {
        for (Bird bird : birdwatch) {
            System.out.println(bird);
        }
    }

    public void observeBird(String bird) {
        for (Bird birdname : this.birdwatch) {
            if (birdname.getName().equals(bird)) {
                birdname.observe();
            }
        }
    }

    public String ShowBird(String name) {
        for (Bird birdname : this.birdwatch) {
            if (birdname.getName().equals(name)) {
                System.out.print(birdname);
            }

        }
        return "bird not known";
    }

    public void BirdwatchCommand() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("?");
            String input = scanner.nextLine();
            if (input.toUpperCase().equals("ADD")) {
                System.out.println("Name:");
                String birdname = scanner.nextLine();
                System.out.println("Latin Name:");
                String latinname = scanner.nextLine();
                this.addBird(birdname, latinname);

            } else if (input.toUpperCase().equals("SHOW")) {
                System.out.println("What?");
                String searched = scanner.nextLine();
                this.ShowBird(searched);

            } else if (input.toUpperCase().equals("QUIT")) {
                break;
            } else if (input.toUpperCase().equals("OBSERVATION")) {
                System.out.println("What was observed:?");
                String birdname = scanner.nextLine();
                {

                    this.observeBird(birdname);
                }

            } else if (input.toUpperCase().equals("STATISTICS")) {
                for (Bird bird : birdwatch) {
                    System.out.println(bird);

                }

            }
        }
    }
}
