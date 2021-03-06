package com.progressinme.repository;

import com.progressinme.domain.Account;

public interface AccountRepository {
	public void update(Account account);

	public Account find(Long id);
}
