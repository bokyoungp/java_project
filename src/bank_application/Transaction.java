package bank_application;

public class Transaction {
  // 집합관계
  private long seqno;
  private Client client;
  private Account account;
  private Clerk clierk;
  private Kubun kubun;
  private String trans_date;
  private Status status;

  public Transaction(Client client, Account account, Clerk clierk) {
    this.client = client;
    this.account = account;
    this.clierk = clierk;
  }
}
