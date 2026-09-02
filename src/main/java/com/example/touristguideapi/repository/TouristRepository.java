package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository

public class TouristRepository {

        private ArrayList<TouristAttraction> attractions = new ArrayList<>();

        public TouristRepository() {

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

            attractions.add(new TouristAttraction(
                    "Brønshøj Kirke" ,
                    "Et historisk kirke ved Brønshøj Torv"

            ));

            attractions.add(new TouristAttraction(
                    "Bellahøj Friluftsscene",
                    "Et udendørs scene "
            ));


        }

        public ArrayList<TouristAttraction> getAllAttractions() {
            return attractions;
        }

        public TouristAttraction getAttractionByName(String name) {

            for (TouristAttraction attraction : attractions) {

                if (attraction.getName().equalsIgnoreCase(name)) {
                    return attraction;
                }
            }

            return null;
        }

        public TouristAttraction addAttraction(TouristAttraction attraction) {
            attractions.add(attraction);

            return attraction;
        }

        public void updateAttraction(TouristAttraction updatedAttraction) {

            for (TouristAttraction attraction : attractions) {

                if (attraction.getName()
                        .equalsIgnoreCase(updatedAttraction.getName())) {

                    attraction.setDescription(
                            updatedAttraction.getDescription()
                    );
                }
            }
        }

        public void deleteAttraction(String name) {

            attractions.removeIf(
                    attraction ->
                            attraction.getName().equalsIgnoreCase(name)
            );
        }
    }




