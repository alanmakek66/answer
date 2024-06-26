import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * In this exercise, try to create an enum Fruit, with two fields, name (String) and price (int).
 * Revise foodTable to HashMap<Integer, Fruit>.
 * 
 * Expected Output: 
 * Before change: 
 * 1 = Apple 
 * 3 = Strawberry
 * 
 * After change: 
 * 1 = APPLE, price = 20 
 * 3 = STRAWBERRY, price = 70
 */
class Exercise26 {
    // finite number of instances
    enum Fruit {
        Apple("Apple",20),
        Strawberry("Strawberry",70),
        Orange("Orange",30),
        ;
        private String name;
        private int price;
        
        private Fruit(String name,int price){
            this.name=name;
            this.price=price;
        }

        public String toString(){
            return " = "+this.name+"price = "+this.price;
        }

        // code here
    }

    public static void main(String[] args) {
        // initialize a HashMap
        //HashMap<Integer, String> foodTable = new HashMap<>();
        HashMap<Integer,Fruit> foodTable = new HashMap<>();
        

        

        // Add elements using put method
        foodTable.put(1, Fruit.Apple);
        foodTable.put(3, Fruit.Strawberry);
        foodTable.put(2, Fruit.Orange);

        // Remove elements 2
        foodTable.remove(2);

        // Iterate the map using
        // for-each loop
        // Iterating HashMap through for loop
        for (Map.Entry<Integer, Fruit> set : foodTable.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }
}
