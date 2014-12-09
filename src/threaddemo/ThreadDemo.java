/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Dony Thomas
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Main Thread ..");
        Singleton s = new Singleton("Singleton Class");
        
        
        Thread t1 = new Thread(new RunnableClass(1, s));
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(new RunnableClass(2, s));
        t2.start();
    }
}
