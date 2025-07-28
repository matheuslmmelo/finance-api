package dev.matheus.finance_api.repository;

import dev.matheus.finance_api.entity.Transaction;
import dev.matheus.finance_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    List<Transaction> findByUser(User user);
    List<Transaction> findByCategoryName(String categoryName);
}
