package dev.matheus.finance_api.entity;

import dev.matheus.finance_api.enums.AccountType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    private UUID accountId = UUID.randomUUID();

    private String accountName;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column(nullable = false)
    private BigDecimal balance = BigDecimal.ZERO;

    private LocalDate openingDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;
}
