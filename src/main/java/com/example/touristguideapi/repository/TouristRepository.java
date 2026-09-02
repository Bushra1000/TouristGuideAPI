package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TouristRepository {

    private static ArrayList<TouristAttraction> attractions = new ArrayList<>();


    public TouristRepository() {

        if (attractions.isEmpty()) {

            attractions.add(new TouristAttraction(
                    "Brønshøj Torv",
                    "Et torv i Brønshøj"
            ));

            attractions.add(new TouristAttraction(
                    "Utterslev Mose",
                    "Et naturområde"
            ));

            attractions.add(new TouristAttraction(
                    "Brønshøj Bibliotek",
                    "Et bibliotek i Brønshøj"
            ));
        }
    }


    // Hent alle attraktioner
    public static ArrayList<TouristAttraction> getAllAttractions() {
        return attractions;
    }


    // Find én attraktion ud fra navn
    public static TouristAttraction findMatchingAttractionByName(String name) {

        for (TouristAttraction attraction : attractions) {

            if (attraction.getName().equalsIgnoreCase(name)) {
                return attraction;
            }
        }

        return null;
    }


    // Tilføj
    public static void addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
    }


    // Opdater
    public static void updateAttraction(TouristAttraction updatedAttraction) {

        for (TouristAttraction attraction : attractions) {

            if (attraction.getName()
                    .equalsIgnoreCase(updatedAttraction.getName())) {

                attraction.setDescription(updatedAttraction.getDescription());
                return;
            }
        }
    }


    // Slet
    public static void deleteAttraction(String name) {

        attractions.removeIf(
                attraction ->
                        attraction.getName().equalsIgnoreCase(name)
        );
    }
}
    // Create an ArrayList

    // add the attractions

    // our attractions

    //Brønshøj Torv
    //Utterlevels mose
    //Brønshøj Bibliotek
    //Zaynos
    //Rytterskolen


    // make a one line description to each attraction

    // Include CRUD to the class

    // Bushra



