package com.shailendra.profileservice.profileservice.service;

import com.shailendra.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
