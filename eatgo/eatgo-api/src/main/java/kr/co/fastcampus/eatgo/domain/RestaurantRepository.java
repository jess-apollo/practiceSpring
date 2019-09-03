package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findAll();

    // Optional: null 등의 오류 방지
    Optional<Restaurant> findById(Long id);

    Restaurant save(Restaurant restaurant);
}
