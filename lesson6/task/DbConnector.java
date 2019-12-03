package lesson6.task;

import java.sql.*;


public class DbConnector {
    final static String SELECT = "SELECT *  From Persons";
    private Connection con;

    public DbConnector() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            try {
                con = DriverManager.getConnection("jdbc:postgresql://localhost:54320/?user=postgres&password=postgres");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ResultSet getPersonList() throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(SELECT);
        st.close();
        con.close();
        return rs;
    }

}
