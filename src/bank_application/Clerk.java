package bank_application;

import java.util.ArrayList;

public class Clerk {
  private String code;
  private String name;

  // 생성자
  public Clerk(String code, String name) {
    this.code = code;
    this.name = name;
  }
  // getter

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  static ArrayList<String> clerks = new ArrayList<>();
}
