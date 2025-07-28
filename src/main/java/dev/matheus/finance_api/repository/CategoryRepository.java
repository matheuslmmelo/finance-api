package dev.matheus.finance_api.repository;

import dev.matheus.finance_api.entity.Category;
import dev.matheus.finance_api.enums.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByName(String categoryName);
    List<Category> findByTransactionType(TransactionType transactionType);
}
