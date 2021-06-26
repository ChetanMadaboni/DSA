package com.wiley.bank;

public interface DepositAcc extends Account {
	void withDraw();
	void deposit();
	void getBalance();
}
