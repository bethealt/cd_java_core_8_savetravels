package com.bethealt.savetravels.repositories;
import com.bethealt.savetravels.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository

public interface ExpenseRepository extends CrudRepository<Expense, Long> {

    List<Expense> findAll();

}