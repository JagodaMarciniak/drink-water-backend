package com.example.DrinkWater;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterConditionRepository extends JpaRepository<WaterCondition,Long> {
  Optional<WaterCondition> findOneByCityName(String cityName);
}
