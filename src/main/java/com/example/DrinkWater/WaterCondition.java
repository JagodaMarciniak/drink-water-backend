package com.example.DrinkWater;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class WaterCondition {
  private @NonNull @Id @GeneratedValue
  Long id;
  private @NonNull
  String cityName;
  private @NonNull
  boolean isWaterSafeToDrink;

  private WaterCondition() {
  }

  public WaterCondition(String cityName, boolean isWaterSafeToDrink) {
    this.cityName = cityName;
    this.isWaterSafeToDrink = isWaterSafeToDrink;
  }

}
