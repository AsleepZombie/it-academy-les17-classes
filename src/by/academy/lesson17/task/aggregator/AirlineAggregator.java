package src.by.academy.lesson17.task.aggregator;

import src.by.academy.lesson17.task.Airline;

import java.sql.Time;
import java.util.ArrayList;

public class AirlineAggregator {
    private ArrayList<Airline> airlines;

    public AirlineAggregator() {
        airlines = new ArrayList<>();
    }

    public void addAirplane(Airline airline){
        airlines.add(airline);
    }

    public Airline findAirplaneByNumber(long number){
        for (Airline airline : airlines) {
            if (airline.getNumber() == number)
                return airline;
        }
        return null;
    }

    public void editAirplaneByNumber(long number, String target, String airplane, Time flightTime, int dayWeekNumber){
        Airline airline = findAirplaneByNumber(number);
        if (airline != null)
            airline.setData(target, airplane, flightTime, dayWeekNumber);
    }

    public void removeAirplaneByNumber(long number){
        Airline airline = findAirplaneByNumber(number);
        if (airline != null)
            airlines.remove(airline);
    }

    public void showAirplaneList() {
        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }

    public void showAirplaneListByTarget(String target) {
        for (Airline airline : airlines) {
            if (airline.getTarget().equals(target))
                System.out.println(airline);
        }
    }

    public void showAirplaneListByDayNumber(int dayNumber) {
        for (Airline airline : airlines) {
            if (airline.getDayWeekNumber() == dayNumber)
                System.out.println(airline);
        }
    }

    public void showAirplaneListByDayNumberByTime(int dayNumber, Time time) {
        for (Airline airline : airlines) {
            if ((airline.getDayWeekNumber() == dayNumber) && (airline.getFlightTime().after(time)))
                System.out.println(airline);
        }
    }
}
