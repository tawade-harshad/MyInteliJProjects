import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pool1 {
    public static void main(String[] args) throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername("harshad_t");
        ds.setPassword("letmein19");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

        Connection conObj = ds.getConnection();
        PreparedStatement ps = conObj.prepareStatement("Select * from users");
        ResultSet rsObj = ps.executeQuery();

        System.out.println("********** USERS TABLE DETAILS ***********");
        while(rsObj.next()){
            System.out.println("User Id : " +rsObj.getString(1));
            System.out.println("User Name : " +rsObj.getString(5));
            System.out.println("User Pwd : " +rsObj.getString(2));
            System.out.println("User Contact : " +rsObj.getString(3));
            System.out.println("User Email : " +rsObj.getString(4));
            System.out.println(" ");
        }
        System.out.println("***************** TABLE END ****************");
        System.out.println("\n============ Releasing Connection Object to Pool ===============");
        ps.close();
        rsObj.close();
        conObj.close();
    }
}
