package com.progressinme.service;

import java.math.BigDecimal;

import com.progressinme.domain.Account;

public interface AccountService {
	public void transferMoney(Long sourceId, Long destinationId, BigDecimal balance);

	public Account getAccount(Long id);
}
