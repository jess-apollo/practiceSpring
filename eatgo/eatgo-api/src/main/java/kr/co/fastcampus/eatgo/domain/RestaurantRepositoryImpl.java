//package kr.co.fastcampus.eatgo.domain;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class RestaurantRepositoryImpl implements RestaurantRepository {
//    private List<Restaurant> restaurants = new ArrayList<>();
//
//    public RestaurantRepositoryImpl() {
//        restaurants.add(new Restaurant(1L, "Bob zip", "Seoul"));
//        restaurants.add(new Restaurant(2L, "Cyber Food", "Seoul"));
//    }
//
//    @Override
//    public List<Restaurant> findAll() {
//        return restaurants;
//    }
//
//    @Override
//    public Optional<Restaurant> findById(Long id) {
//        Restaurant restaurant = restaurants.stream()
//                .filter(r -> r.getId().equals(id))
//                .findFirst()
//                .orElse(null);
//        // .get() -> 그냥 가져오기
//
//        return restaurant;
//    }
//
//    @Override
//    public Restaurant save(Restaurant restaurant) {
//        restaurant.setId(1234L);
//        restaurants.add(restaurant);
//        return restaurant;
//    }
//}
