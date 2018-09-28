package com.patterns.Singleton;

public class SingletonThreadSaf {
	private static SingletonThreadSaf single;
    
    private SingletonThreadSaf(){}
    
   /* public static synchronized SingletonThreadSaf getInstance(){
        if(single == null){
            single = new SingletonThreadSaf();
        }
        return single;
    }*/
   
    
    /*To make the use of the synchronised methodwwhen only thread is created and reduce 
    the cost of the synchronised method*/
    public static SingletonThreadSaf getInstanceUsingDoubleLocking(){
        if(single == null){
            synchronized (SingletonThreadSaf.class) {
                if(single == null){
                    single = new SingletonThreadSaf();
                }
            }
        }
        return single;
    }
    
}
