package com.answer.OrderAnditem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Setter
@Getter
@ToString

public class item {
  private String desc;
  private double price;
  @NonNull
  private int quantity;
  
}
