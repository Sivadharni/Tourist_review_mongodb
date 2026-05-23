package com.touristreview.backend.repository;

import com.touristreview.backend.models.Attraction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttractionRepository extends MongoRepository<Attraction, String> {

}