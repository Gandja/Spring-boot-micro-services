package com.easysolutions.ratingsdataservice.resources;

import com.easysolutions.ratingsdataservice.models.Rating;
import com.easysolutions.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {

        return new Rating(movieId, 9);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1", 5),
                new Rating("2", 7)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);

        return userRating;
    }
}
