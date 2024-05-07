package player1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class holder {
  private List<Player> playerList;

  public holder() {
    this.playerList = new ArrayList<>();
  }

  public List<Player> getList() {
    return this.playerList;
  }

  public List<Player> getMalePlayer() {
    return this.getList().stream().filter(e -> Gender.Male.equals(e.getGender()))
        .collect(Collectors.toList());
  }

  public double getAverageAge() {
    return this.playerList.stream().collect(Collectors.averagingDouble(e -> e.getAge()));
  }

  public List<String> getNameList() {
    return this.getList().stream().map(e -> e.getName()).collect(Collectors.toList());
  }

  public Map<Country, String> getGroupByCountrynName() {

    Map<Country, String> m1 = this.getList().stream()
        .collect(
            Collectors.groupingBy(e -> e.getCountry(), Collectors.mapping(e -> e.getName(), Collectors.joining(","))));

    return m1;

  }
  public int getTotalAGE(){
    return
    this.getList().stream().collect(Collectors.summingInt(e->e.getAge()));
  }

  @Override
  public String toString() {
    return " play = " + this.playerList;
  }

  public static void main(String[] args) {
    Player p1 = Player.build()
        .name("sally")
        .age(18)
        .country(Country.China)
        .gender(Gender.Female)
        .build();
    Player p2 = Player.build()
        .name("sam")
        .age(20)
        .country(Country.China)
        .gender(Gender.Male)
        .build();
    Player p3 = Player.build()
        .name("ken")
        .age(30)
        .country(Country.USA)
        .gender(Gender.Male)
        .build();
    Player p4 = Player.build()
        .name("ben")
        .age(55)
        .country(Country.Japan)
        .gender(Gender.Male)
        .build();
    Player p5 = Player.build()
        .name("bolt")
        .age(55)
        .country(Country.USA)
        .gender(Gender.Male)
        .build();
    Player p6 = Player.build()
        .name("winnie")
        .age(55)
        .country(Country.China)
        .gender(Gender.Female)
        .build();

    holder h1 = new holder();
    h1.getList().add(p1);
    h1.getList().add(p2);
    h1.getList().add(p3);
    h1.getList().add(p4);
    h1.getList().add(p5);
    h1.getList().add(p6);

    System.out.println(h1.getMalePlayer());
    System.out.println(h1.getAverageAge());
    System.out.println(h1.getNameList());
    System.out.println(h1.getGroupByCountrynName());
    System.out.println(h1.getTotalAGE());
    
    

  }

}
