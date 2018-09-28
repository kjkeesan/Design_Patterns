package com.patterns.Singleton;

public class SingletonBillPugh {
	private SingletonBillPugh(){}

	private static class SingletonBill {
		private static final SingletonBill single = new SingletonBill();
	}

	public static SingletonBill getInstance() {
		return SingletonBill.single;
	}
}
