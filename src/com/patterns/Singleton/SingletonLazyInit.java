package com.patterns.Singleton;

public class SingletonLazyInit {
	private static SingletonLazyInit single;

	private SingletonLazyInit(){}

	public static SingletonLazyInit getInstance() {
		if (single == null) {
			single = new SingletonLazyInit();
		}
		return single;
	}
}
