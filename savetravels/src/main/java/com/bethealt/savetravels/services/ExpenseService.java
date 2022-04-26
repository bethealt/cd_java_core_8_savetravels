package com.bethealt.savetravels.services;
import com.bethealt.savetravels.models.*;
import com.bethealt.savetravels.repositories.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    // returns all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }

    // creates an expense
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // retrieves an expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        }
        else {
            return null;
        }
    }

    // updates an expense
    public Expense udpateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // deletes an expense
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
    
}
