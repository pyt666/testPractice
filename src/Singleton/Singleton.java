/**
 * 
 */
package Singleton;

/**
 * @author pyt
 *
 */
public class Singleton {
    /*
     * 单例模式的基础实现
     * 不支持多线程，不是严格意义上的单例模式
    private static Singleton instance;  
    private Singleton (){}    
    public static Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }*/
	
	/*
	 * 懒汉式，支持延迟加载，支持多线程，必须加锁synchronized才能保证单例，但加锁影响效率
	private static Singleton instance;  
    private Singleton (){}  
    public static synchronized Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    } */
	
	/*
	 * 饿汉式，无延迟加载，较为常用，但容易产生垃圾对象
	 * 类加载时就初始化，浪费内存
	private static Singleton instance = new Singleton();  
    private Singleton (){}  
    public static Singleton getInstance() {  
    return instance;  
    }*/
	
	/*
	 * 如何使两种单例模式既具有延迟加载的特性，又支持多线程
	 */
   /*
    * 方法一：DCL
    * 采用双检锁
    private volatile static Singleton singleton;  
    private Singleton (){}  
    public static Singleton getSingleton() {  
	    if (singleton == null) {  
	        synchronized (Singleton.class) {  
		        if (singleton == null) {  
		            singleton = new Singleton();  
		        }  
	        }  
	    }  
	    return singleton;  
    }*/
	
	/*
	 * 方法二：登记式/静态内部类
	private static class SingletonHolder {  
	    private static final Singleton INSTANCE = new Singleton();  
	}  
    private Singleton (){}  
    public static final Singleton getInstance() {  
    	return SingletonHolder.INSTANCE;  
    }*/
	
	 
}
