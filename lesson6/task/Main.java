package lesson6.task;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonController controller = new PersonController();
        try {
            List persons = controller.getPersonList();
            System.out.println(persons);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
