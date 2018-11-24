package com.example.DrinkWater;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
  @Bean
  CommandLineRunner initDatabase(WaterConditionRepository waterConditionRepository){
    return args -> {
      log.info("Preloading" + waterConditionRepository.save(new WaterCondition("Gdańsk", true)));
      log.info("Preloading" + waterConditionRepository.save(new WaterCondition("Warszawa", false
      )));
    };
  }
}
