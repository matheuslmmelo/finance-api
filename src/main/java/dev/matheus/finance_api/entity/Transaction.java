package dev.matheus.finance_api.entity;

import dev.matheus.finance_api.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    private UUID transactionId = UUID.randomUUID();

    private BigDecimal amount;

    private LocalDate date;

    private String description;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;//INCOME/EXPENSE

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;//FOOD/MOVING/HEALTH/OTHERS

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
