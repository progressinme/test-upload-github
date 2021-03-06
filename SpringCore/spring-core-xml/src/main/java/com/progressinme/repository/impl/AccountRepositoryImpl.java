package com.progressinme.repository.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.progressinme.domain.Account;
import com.progressinme.repository.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

	private Map<Long, Account> accountMap = new HashMap<Long, Account>();
	{
		Account account1 = new Account();
		account1.setId(1L);
		account1.setName("Budi");
		account1.setAccountNumber("001");
		account1.setBalance(new BigDecimal(100000));

		Account account2 = new Account();
		account2.setId(2L);
		account2.setName("Silvi");
		account2.setAccountNumber("002");
		account2.setBalance(new BigDecimal(300000));
	}

	@Override
	public void update(Account account) {
		accountMap.put(account.getId(), account);
	}

	@Override
	public Account find(Long id) {

		return accountMap.get(id);	
	}

}
