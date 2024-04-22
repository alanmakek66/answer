package Exercise23;

class Computer extends Machine {

  public Computer(String name){
    super(name);

  }
  @Override
  public void start(){
    System.out.println("Start Computer: " + this.name);
  }

  @Override
  public void stop(){
    System.out.println("Stop Computer: " + this.name);
  }

  public void restart(){
    System.out.println("Restart Computer: "+ this.name);
  }

  

  // Implement Constructor

  // Implement start() method

  // Implement stop() method

  // Implement restart()
}