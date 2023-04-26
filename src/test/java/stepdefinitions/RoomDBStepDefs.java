package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.sl.In;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class RoomDBStepDefs {

    @Given("Olusan odayi room_number ile dogrula")
    public void olusan_odayi_room_number_ile_dogrula() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db_v2", "select_user", "Medunna_pass_@6");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM room ORDER BY created_date DESC");

        List<Integer> roomNumberList = new ArrayList<>();
        while (resultSet.next()) {

            roomNumberList.add(resultSet.getInt("room_number"));
        }

        System.out.println("roomNumberList = " + roomNumberList);

       // assertTrue(roomNumberList.contains(roomNumber));
        
    }
}