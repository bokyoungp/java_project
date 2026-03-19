package ch18;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo3 {
  public static void main(String[] args) {
    Connection con = DBDemo.makeConnection();
    String sql = "UPDATE table1 SET address = ? WHERE (id = ?)";

    Statement stmt = null;
    try {
      stmt = con.createStatement();
      int count = stmt.executeUpdate(sql);
      if(count > 0) {
        System.out.println(count + " 건의 데이터가 수정되었습니다.");
      } else {
        System.out.println("데이터 수정에 실패했습니다.");
      }
    } catch (SQLException e) {
      System.out.println("데이터 수정에 실패했습니다.");
    }
  } // DELETE FROM `test`.`table1` WHERE (`id` = '4');

}
