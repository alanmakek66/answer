package Exercise23;

class Machine {
  String name;

  public Machine(String name) {
      this.name = name;
  }

  public void start() {
      System.out.println("Start Machine: " + this.name);
  }

  public void stop() {
      System.out.println("Stop Machine: " + this.name);
  }
}
