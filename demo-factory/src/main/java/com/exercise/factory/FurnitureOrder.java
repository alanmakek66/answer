package com.exercise.factory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
      this.ordersOfFurnitures=new HashMap<>();
        // TODO: Complete the constructor
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
      if (this.ordersOfFurnitures.containsKey(type)) {
        int currentCount = this.ordersOfFurnitures.get(type);
        int newCount = currentCount + furnitureCount;
        this.ordersOfFurnitures.put(type, newCount);
    } else {
        this.ordersOfFurnitures.put(type, furnitureCount);
    }
        
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        float totalCost = 0;
    for (Map.Entry<Furniture, Integer> entry : this.ordersOfFurnitures.entrySet()) {
        Furniture furniture = entry.getKey();
        int quantity = entry.getValue();
        float unitPrice = furniture.cost(); 
        float itemCost = unitPrice * quantity;
        totalCost += itemCost;
    }
    return totalCost;
        
        
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        int count=0;
        for(Map.Entry<Furniture, Integer> entry : this.ordersOfFurnitures.entrySet()){
          if(type.equals(entry.getKey())){
            count=entry.getValue();
          }
        }
      
        return count ;
    }

    public float getTypeCost(Furniture type) {
       
        /* float TypeCost=0;
         for(Map.Entry<Furniture, Integer> entry : this.getOrderedFurniture().entrySet()){
          if(type.equals(entry.getKey())){
            TypeCost=type.cost()*entry.getValue();
            
          }
        }  */
        
        
        return (float) (this.getTypeCount(type)*type.cost());
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int quantity=0;
        for(Map.Entry<Furniture, Integer> entry : this.getOrderedFurniture().entrySet()){
          quantity=quantity+entry.getValue();
        }

        return quantity;
    }
}
