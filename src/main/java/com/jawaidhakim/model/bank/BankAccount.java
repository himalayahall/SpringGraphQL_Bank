package com.jawaidhakim.model.bank;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class BankAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    @Enumerated(EnumType.STRING)
    AccountType accountType;

    @ManyToOne
    AccountHolder accountHolder;

    LocalDateTime createdOn;

    LocalDateTime lastWithdrawalOn;

    Boolean active;

    BigDecimal currentBalance;

    Currency currency;
}
