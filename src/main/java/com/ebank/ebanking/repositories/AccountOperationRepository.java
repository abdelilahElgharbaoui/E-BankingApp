package com.ebank.ebanking.repositories;

import com.ebank.ebanking.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
   // Page<AccountOperation> findByBankAccountId(String accountId, Pageable pageable);
}
