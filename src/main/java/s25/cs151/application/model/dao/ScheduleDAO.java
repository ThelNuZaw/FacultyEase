package s25.cs151.application.model.dao;

import javafx.collections.ObservableList;
import s25.cs151.application.model.Schedule;

import java.io.IOException;

public interface ScheduleDAO {
    void save(Schedule schedule) throws IOException;
    ObservableList<Schedule> load() throws IOException;
    boolean scheduleExists(String studentName, String date) throws IOException;
}