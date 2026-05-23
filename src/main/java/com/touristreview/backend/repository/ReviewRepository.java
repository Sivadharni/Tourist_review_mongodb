package com.touristreview.backend.repository;

import com.touristreview.backend.models.Attraction;
import com.touristreview.backend.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {

    List<Review> findByAttraction(Attraction attraction);

}