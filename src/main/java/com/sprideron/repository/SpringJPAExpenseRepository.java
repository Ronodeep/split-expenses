package com.sprideron.repository;

import com.sprideron.models.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringJPAExpenseRepository extends JpaRepository<ExpenseCategory,Long> {
}
