package src.by.academy.lesson17.task.aggregator;

import src.by.academy.lesson17.task.Customer;
import src.by.academy.lesson17.util.Util;

import java.util.ArrayList;

public class CustomerAggregator {
    private ArrayList<Customer> customers;

    public CustomerAggregator() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public Customer findCustomerById(long id){
        for (Customer customer: customers) {
            if (customer.getId() == id)
                return customer;
        }
        return null;
    }

    public boolean editCustomerById(long id, String firstName, String secondName, String middleName, String address, String creditCardNumber, String bankAccountNumber){
        Customer customer = findCustomerById(id);
        if (customer != null) {
            customer.setData(firstName, secondName, middleName, address, creditCardNumber, bankAccountNumber);
            return true;
        }
        return false;
    }

    public boolean removeCustomerById(long id){
        Customer customer = findCustomerById(id);
        if (customer != null) {
            customers.remove(customer);
            return true;
        }
        return false;
    }

    public void showCustomerList() {
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }

    public void showCustomerSortLIst() {
        ArrayList<String> names = new ArrayList<>();
        String print;
        for (Customer customer: customers) {
            names.add(customer.toString());
        }
        System.out.println();
        while (!names.isEmpty()) {
            print = names.getFirst();
            for (int i = 1; i < names.size(); i++) {
                if (!Util.isAlphabeticallyHigher(print, names.get(i))) {
                    print = names.get(i);
                }
            }
            System.out.println(print);
            names.remove(print);
        }
    }

    public void showCustomerListByCreditCardInterval(long min, long max) {
        long cardNumber;
        for (Customer customer: customers) {
            cardNumber = Long.parseLong(customer.getCreditCardNumber());
            if ((cardNumber >= min) && (cardNumber <= max))
                System.out.println(customer);
        }
    }
}
