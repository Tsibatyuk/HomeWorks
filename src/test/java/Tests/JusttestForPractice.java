package Tests;

import java.util.Scanner;

public class JusttestForPractice extends Constructors implements Learning {
    int population;
    int a, b, c;
    String planetName;

    public void planetEarth() {

        System.out.println("Here we are live");
    }
    public void planetMars(){
        System.out.println("Here we will live");
    }

    public void constructor() {
        JusttestForPractice planet = new JusttestForPractice();
        JusttestForPractice planet2 = new JusttestForPractice();

        planet.population = 12;
        planet.planetName = "Earth";
        System.out.println(planet.population + " " + planet.planetName);
        planet.planetEarth();

        planet2.population = 21;
        planet2.planetName = "Mars";
        System.out.println(planet2.population+" "+planet2.planetName);
        planet2.planetMars();


    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors();


        Scanner num = new Scanner(System.in);
        int chislo;
        System.out.println("naberu yakes chislo");
        chislo = num.nextInt();
        if(chislo == 1){
        System.out.println("ne te chislo");
        }

        if (chislo == 2){
        System.out.println("te chislo");
        constructors.someInformation();}



    }

    @Override
    public void someInformation() {
        System.out.println("create some interface");
    }
}





