package com.group.libraryapp.dto.day.response;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayResponse {

    private String dayOfTheWeek;

    public DayResponse(String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        this.dayOfTheWeek = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);
    }
    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
