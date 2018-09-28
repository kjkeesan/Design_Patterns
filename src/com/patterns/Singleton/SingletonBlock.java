package com.patterns.Singleton;

public class SingletonBlock {
	

	    private static SingletonBlock single;
	    
	    private SingletonBlock(){}
	    
	    //Used for exception handling
	    static{
	        try{
	            single = new SingletonBlock();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
	    public static SingletonBlock getInstance(){
	        return single;
	    }
}
