package bank_application.ex1;

public class AggregationDemo {
  // 클래스 다이어그램에서 전체와 부분 관계를 나타내며 ,속이 빈 마름모로 표시
  // 한 객체가 다른 객체를 포함하는 관계
  CPU c = new CPU();
  MainBoard m = new MainBoard();

  Computer com = new Computer(c, m);

}

class Computer {
  private CPU c;
  private MainBoard m;

  public Computer(CPU c, MainBoard m) {
    this.c = c;
    this.m = m;
  }
}

class CPU {}

class MainBoard {}