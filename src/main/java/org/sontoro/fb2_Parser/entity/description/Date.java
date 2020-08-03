package org.sontoro.fb2_Parser.entity.description;

import java.sql.Timestamp;

public class Date {
    public Timestamp dateTimestamp;
    public String date;

    public Date(Timestamp dateTimestamp, String date) {
        this.dateTimestamp = dateTimestamp;
        this.date = date;
    }

    public Timestamp getDateTimestamp() {
        return dateTimestamp;
    }

    public void setDateTimestamp(Timestamp dateTimestamp) {
        this.dateTimestamp = dateTimestamp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
