package person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class person {
  private int age;
  private String name;

  public person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return " age = " + this.age + " name " + this.name;
  }

  public static void main(String[] args) {
    List<person> p1 = new ArrayList<>(List.of(new person(10, "sam"), new person(10, "ken"), new person(20, "peter")));

    /*
     * Map<Integer,String> new1=
     * p1.stream().collect(Collectors.toMap(e->e.getAge(), e->e.getName()));
     */

    Map<Integer, List<person>> new2 = p1.stream().collect(Collectors.groupingBy(e -> e.getAge()));
    System.out.println(new2);

    List<person> p2 = new ArrayList<>(List.of(
        new person(10, "sam"),
        new person(10, "ken"),
        new person(20, "peter")));

    Map<Integer, String> groupedByAge = p1.stream()
        .collect(Collectors.groupingBy(
          e->e.getAge(),
            Collectors.mapping(e->e.getName(), Collectors.joining(", "))));

    System.out.println(groupedByAge);

  }

}
