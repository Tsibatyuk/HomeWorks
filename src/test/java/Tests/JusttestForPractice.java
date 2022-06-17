package Tests;

import org.testng.annotations.Test;

public class JusttestForPractice {
    int population;
    String planetName;

    public String Ouer(int population, String planetName){
        this.population = population;
        this.planetName = planetName;
        return planetName;

    }

@Test
    public void ourPlanet(){

        Ouer(12,"Kaka" );
        System.out.println(Ouer(12,"kaka"));
    }




}
