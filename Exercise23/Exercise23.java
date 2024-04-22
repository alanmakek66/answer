package Exercise23;

public class Exercise23 {

  public static void main(String[] args) {
    Machine myMachine = new Machine("MachineA");
    myMachine.start();
    myMachine.stop();

    // During the runtime, JVM know which start() method will be called
    // Why it takes advantages using Machine for type declaration
    Machine computer = new Computer("ComputerB");
    computer.start();
    computer.stop();
    //computer.restart(); // why this method call will cause compile error?

    Computer computer2 = new Computer("ComputerC");
    computer2.restart(); // this is fine, why?
}
  
}
