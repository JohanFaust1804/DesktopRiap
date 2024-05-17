/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author SENA
 */

import entities.EventData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import logicBd.ConnectionDB;

public class EventService {

    public void addEvent(EventData event) {
        String query = "INSERT INTO events (date_event, end_time, location, objective, start_time) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionDB.getConnectionBD();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setDate(1, new java.sql.Date(event.getDate_event().getTime()));
            statement.setTime(2, event.getEnd_time());
            statement.setString(3, event.getLocation());
            statement.setString(4, event.getObjective());
            statement.setTime(5, event.getStart_time());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar el error
        }
    }

    public void deleteEvent(Long eventId) {
        String query = "DELETE FROM events WHERE id_event = ?";

        try (Connection connection = ConnectionDB.getConnectionBD();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setLong(1, eventId);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar el error
        }
    }

    public void modifyEvent(EventData event) {
        String query = "UPDATE events SET date_event = ?, end_time = ?, location = ?, objective = ?, start_time = ? WHERE id_event = ?";

        try (Connection connection = ConnectionDB.getConnectionBD();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setDate(1, new java.sql.Date(event.getDate_event().getTime()));
            statement.setTime(2, event.getEnd_time());
            statement.setString(3, event.getLocation());
            statement.setString(4, event.getObjective());
            statement.setTime(5, event.getStart_time());
            statement.setLong(6, event.getId_event());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar el error
        }
    }
}

