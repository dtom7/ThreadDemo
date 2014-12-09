/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dony Thomas
 */
public class RunnableClass implements Runnable {

    private int id;
    private Singleton s;

    public RunnableClass(int id, Singleton s) {
        this.id = id;
        this.s = s;
    }

    @Override
    public void run() {
        Singleton.setCurrentSingleton(s);
        System.out.println("Thread: " + this.id + " -- before: " + Singleton.getCurrentSingleton().getName() + " " + new Date());
        Singleton.getCurrentSingleton().setName("Singleton Class" + this.id);
        System.out.println("Thread: " + this.id + " -- after: " + Singleton.getCurrentSingleton().getName() + " " + new Date());
        //System.out.println("Thread: " + this.id + " -- before: " + this.s.getName() + " " + new Date());
        //this.s.setName("Singleton Class" + this.id);
        //System.out.println("Thread: " + this.id + " -- after: " + this.s.getName() + " " + new Date());
    }
}
