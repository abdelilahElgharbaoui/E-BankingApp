package com.ebank.ebanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CA") // sera active si on a Single_Table dans BankAccount Class
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentAccount extends BankAccount {
    private double overDraft;
}
