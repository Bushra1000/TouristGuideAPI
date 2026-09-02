package com.example.touristguideapi.service;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class TouristService {

    private final TouristRepository touristrepository;

    public TouristService(TouristRepository touristrepository){
        this.touristrepository = touristrepository;
    }

    public ArrayList<TouristAttraction> getAllAttractions(){
        return TouristRepository.getAllAttractions();
    }

    public TouristAttraction findMatchingAttractionByName(String name){
        return TouristRepository.findMatchingAttractionByName(name);
    }
















}

