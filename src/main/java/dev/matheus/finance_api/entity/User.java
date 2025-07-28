package dev.matheus.finance_api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private UUID userId = UUID.randomUUID();

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Account> accountList;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactionList;
}
