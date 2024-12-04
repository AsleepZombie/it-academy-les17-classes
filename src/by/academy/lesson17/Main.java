package src.by.academy.lesson17;

import src.by.academy.lesson17.task.Airline;
import src.by.academy.lesson17.task.Customer;
import src.by.academy.lesson17.task.aggregator.AirlineAggregator;
import src.by.academy.lesson17.task.aggregator.CustomerAggregator;
import src.by.academy.lesson17.util.Splitter;

import java.sql.Time;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        CustomerAggregator customers = new CustomerAggregator();
        customers.addCustomer(new Customer(++id));
        customers.editCustomerById(id,"Василий", "Итишников", "Иванович", "где-то", "123456789", "cl-342");
        customers.addCustomer(new Customer(++id,"Пётр", "Кадровик", "Петрович", "там", "321465979", "cl-7894"));
        customers.addCustomer(new Customer(++id,"Антон", "Канцеляров", "Антонович", "далеко", "456123579", "cl-8451"));
        customers.addCustomer(new Customer(++id,"Александра", "Персоналова", "Петровна", "где вырос", "984156546", "cl-385"));
        customers.addCustomer(new Customer(++id,"Алексей", "Казначеев", "Алексеевич", "тут", "741536256", "cl-451"));
        customers.addCustomer(new Customer(++id,"Ирина", "Кадровик", "Александровна", "нигде", "7481564687", "cl-74856"));
        customers.addCustomer(new Customer(++id,"Илья", "Итишников", "Васильевич", "близко", "4815367685", "cl-465"));
        customers.addCustomer(new Customer(++id,"Степан", "Рисовик", "Иванович", "рядом", "7415687945", "cl-7414"));

        customers.showCustomerList();
        System.out.println();
        customers.showCustomerSortLIst();
        System.out.println();
        customers.showCustomerListByCreditCardInterval(234567894,741945648);
        Splitter.split();

        AirlineAggregator airlines = new AirlineAggregator();
        airlines.addAirplane(new Airline(34675));
        airlines.editAirplaneByNumber(34675, "Minsk", "srf-5gr", Time.valueOf("14:45:00"), 5);
        airlines.addAirplane(new Airline(451678, "London", "vg86", Time.valueOf("16:00:00"), 1));
        airlines.addAirplane(new Airline(478, "Astana", "vfv9-8h", Time.valueOf("13:30:00"), 2));
        airlines.addAirplane(new Airline(74178, "Berlin", "fvy67", Time.valueOf("12:15:00"), 3));
        airlines.addAirplane(new Airline(78945, "Gibraltar", "zas-465k", Time.valueOf("17:20:00"), 4));
        airlines.addAirplane(new Airline(31454, "Lima", "lkjb-5", Time.valueOf("19:40:00"), 5));
        airlines.addAirplane(new Airline(8419, "Madrid", "cr56ubh", Time.valueOf("20:10:00"), 6));
        airlines.addAirplane(new Airline(41998, "Moscow", "ftcv89r", Time.valueOf("10:50:00"), 7));
        airlines.addAirplane(new Airline(9165, "Paris", "dr-87", Time.valueOf("23:30:00"), 3));
        airlines.addAirplane(new Airline(34815, "Rome", "12gh-i", Time.valueOf("05:15:00"), 4));
        airlines.addAirplane(new Airline(21989, "Seoul", "jvhv645", Time.valueOf("00:05:00"), 1));

        airlines.showAirplaneList();
        System.out.println();
        airlines.showAirplaneListByTarget("Minsk");
        System.out.println();
        airlines.showAirplaneListByDayNumber(1);
        System.out.println();
        airlines.showAirplaneListByDayNumber(4);
        System.out.println();
        airlines.showAirplaneListByDayNumber(7);
        System.out.println();
        airlines.showAirplaneListByDayNumberByTime(4, Time.valueOf("06:00:00"));

    }
}
