package bank_application;

public class Account {
  // 필드 - 계좌번호, 계좌주, 초기입금액
  private int code;
  private Client client;
  private String password;
  private String opendate;
  private String closedate;
  private boolean active;
  private int balance;
  // 상수 선언- 0 , 1_000_000
  final int MIN_BALANCE = 0;
  final int MAX_BALANCE = 1_000_000;

  public Account(Client client) {
    this.client = client;
  }

  public int getCode() {
    return code;
  }

  public Client getClient() {
    return client;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    // rule
    this.password = password;
  }

  public String getOpendate() {
    return opendate;
  }

  public String getClosedate() {
    return closedate;
  }

  public void setClosedate(String closedate) {
    this.closedate = closedate;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public int getBalance() {
    return balance;
  }


}
