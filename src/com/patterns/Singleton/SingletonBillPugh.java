package com.patterns.Singleton;

public class SingletonBillPugh {
	private SingletonBillPugh(){}

	private static class SingletonBill {
		private static final SingletonBillPugh single = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return SingletonBill.single;
	}
}
