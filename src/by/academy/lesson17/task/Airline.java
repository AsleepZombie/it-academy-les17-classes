package src.by.academy.lesson17.task;

import java.sql.Time;

public class Airline {
    //пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    private final long number;
    private String target;
    private String airplane;
    private Time flightTime;
    private int dayWeekNumber;

    public Airline(long number, String target, String airplane, Time flightTime, int dayWeekNumber) {
        this.number = number;
        this.target = target;
        this.airplane = airplane;
        this.flightTime = flightTime;
        this.dayWeekNumber = dayWeekNumber;
    }

    public Airline(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public Time getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Time flightTime) {
        this.flightTime = flightTime;
    }

    public int getDayWeekNumber() {
        return dayWeekNumber;
    }

    public void setDayWeekNumber(int dayWeekNumber) {
        this.dayWeekNumber = dayWeekNumber;
    }

    public String getDayOfTheWeek() {
        switch (dayWeekNumber) {
            //Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
        }
        return "";
    }

    public void setData(String target, String airplane, Time flightTime, int dayWeekNumber) {
        this.target = target;
        this.airplane = airplane;
        this.flightTime = flightTime;
        this.dayWeekNumber = dayWeekNumber;
    }

    @Override
    public String toString() {
        return "(" + number + ")->" + target + " at " + flightTime
                + " " + getDayOfTheWeek() + " by " + airplane;
    }
}
