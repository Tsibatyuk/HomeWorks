package Tests;

public class JusttestForPractice {
    int population;
    int a, b, c;
    String planetName;

    public void planetEarth() {

        System.out.println("Here we are live");
    }
    public void planetMars(){
        System.out.println("Here we will live");
    }

    public static void main(String[] args) {
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
    public void first(int a){
        this.a = a;    }
    public void second(int b){
        this.b = b;    }
    public void third(int c){
        this.c = c;

    }
}





