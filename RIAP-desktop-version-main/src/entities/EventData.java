/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author SENA
 */

import java.util.Date;
import java.sql.Time;

public class EventData {
    
    private Long id_event; 
    private Date date_event;
    private Time end_time;
    private String location; 
    private String objective; 
    private Time start_time;

    public EventData() {
    }

    public EventData(Long id_event, Date date_event, Time end_time, String location, String objective, Time start_time) {
        this.id_event = id_event;
        this.date_event = date_event;
        this.end_time = end_time;
        this.location = location;
        this.objective = objective;
        this.start_time = start_time;
    }

    public Long getId_event() {
        return id_event;
    }

    public void setId_event(Long id_event) {
        this.id_event = id_event;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }
    
    
}
