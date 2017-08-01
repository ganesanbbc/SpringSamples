package com.cts.customer.controller;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pets, Long> {
}
