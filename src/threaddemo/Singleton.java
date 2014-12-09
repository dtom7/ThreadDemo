/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Dony Thomas
 */
public class Singleton {
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Singleton(String name) {
        this.name = name;
    }
    
    private static ThreadLocal<Singleton> tl = new ThreadLocal<Singleton>();
    
    public static Singleton getCurrentSingleton() {
        return tl.get();
    }
    
    public static void setCurrentSingleton(Singleton s) {
        tl.set(s);
    }
}
