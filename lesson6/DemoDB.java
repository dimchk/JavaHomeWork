package lesson6;

import java.sql.*;

public class DemoDB {
    final static String CREATE = "CREATE TABLE Persons ( PersonID int,LastName varchar(255),FirstName varchar(255), Address varchar(255), City varchar(255))";
    final static String INSERT = "INSERT INTO Persons VALUES ('1', 'Test', 'Test', 'TestAdress', 'Kyiv')";
    final static String SELECT = "SELECT *  From Persons WHERE PersonID = ?";

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:54320/?user=postgres&password=postgres");
            Statement st = con.createStatement();
            //st.execute(INSERT);
            PreparedStatement ps  = con.prepareStatement(SELECT);
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            //ResultSet rs = st.executeQuery(SELECT);
            while (rs.next())
            {
                System.out.println(rs.getInt("PersonID") + rs.getString("LastName"));
            }
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
