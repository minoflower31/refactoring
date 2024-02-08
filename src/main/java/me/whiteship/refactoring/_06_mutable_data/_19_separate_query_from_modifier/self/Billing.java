package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.self;

import me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.Customer;
import me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.EmailGateway;
import me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.Invoice;

public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    public double getTotalOutstanding() {
        return customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
    }

    private void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
