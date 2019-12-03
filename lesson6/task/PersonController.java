package lesson6.task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonController {
    public List getPersonList() throws SQLException {
        DbConnector db = new DbConnector();
        ResultSet rs = db.getPersonList();
        List<Person> persons = new ArrayList();

        while (rs.next()) {
            Person person = new Person(rs.getInt("personId"),
                    rs.getString("lastname"),
                    rs.getString("firstname"),
                    rs.getString("address"),
                    rs.getString("city"));
            persons.add(person);
        }
        return persons;
    }
}
