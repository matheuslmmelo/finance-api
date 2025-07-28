package dev.matheus.finance_api.repository;

import dev.matheus.finance_api.entity.Account;
import dev.matheus.finance_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findByAccountIdAndUser(UUID id, User user);
    List<Account> findByUser(User user);
}
