package com.patterns.Singleton;

public class SingletonEager {
	private static final SingletonEager single=new SingletonEager();
	
	private SingletonEager(){
		
	}
	
	public static SingletonEager getInstance(){
		return single;
	}
	
	
}
	