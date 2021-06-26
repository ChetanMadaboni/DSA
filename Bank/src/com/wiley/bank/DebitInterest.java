package com.wiley.bank;

public interface DebitInterest extends Intrest {
	void deductMonthlyInt();
	void deductHafYrlyInt();
	void deductAnnualInt();
}
