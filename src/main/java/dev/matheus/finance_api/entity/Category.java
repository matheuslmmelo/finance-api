package dev.matheus.finance_api.entity;

import dev.matheus.finance_api.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String name;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @OneToMany(mappedBy = "category")
    private List<Transaction> transactions;
}
