package com.jawaidhakim.model.bank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class AccountHolder
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String firstName;
    String lastName;
    LocalDate dob;
    String address;
    String phone;
    String email;

}
