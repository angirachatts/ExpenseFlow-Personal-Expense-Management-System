package com.example.expenseflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expenseflow.entity.IncomeCategory;

public interface IncomeCategoryRepository extends JpaRepository<IncomeCategory, Long> {
}