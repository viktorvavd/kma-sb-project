package com.example.financial_manager.components;

import com.example.financial_manager.managers.IncomeManager;
import com.example.financial_manager.wrappers.Income;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IncomeManagerImpl implements IncomeManager {
    private List<Income> incomes = new ArrayList<>();

    @Override
    public void addIncome(Income income) {
        incomes.add(income);
    }

    @Override
    public List<Income> getAllIncomes() {
        return incomes;
    }

    @Override
    public double calculateTotalIncome() {
        return incomes.stream().mapToDouble(Income::getIncomeAmount).sum();
    }
}
