package com.goorm.jejuPowerTest.app.place.respository;

import com.goorm.jejuPowerTest.app.place.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaceRepository extends JpaRepository<Place, Long>{
    Optional<Place> findByCategory(String category);
}
