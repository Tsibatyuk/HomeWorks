package Tests;

import org.testng.annotations.Test;

public class JusttestForPractice {
    int population;
    String planetName;

    public void quantity(int population){
        this.population = population;    }
    public void namePlanet(String planetName){
        this.planetName = planetName;
    }

@Test
    public void ourPlanet() {
        population = 12;
        planetName = "Earth";
    System.out.println("planet " + planetName, "has "+population);
    }




}
