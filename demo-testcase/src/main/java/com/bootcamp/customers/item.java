package com.bootcamp.customers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor

public class item {
  private String desc;
  private double price;
  private int quantity;
}
