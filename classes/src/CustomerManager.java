import Entities.Customer;

public class CustomerManager {
    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    private Customer customer;

    public void Add() {
        System.out.println("Customer added." + customer.getFirstName() + " " + customer.getLastName());
    }

    public void Remove() {
        System.out.println("Customer added." + customer.getFirstName() + " " + customer.getLastName());
    }

    public void Update() {
        System.out.println("Customer added." + customer.getFirstName() + " " + customer.getLastName());
    }
}
