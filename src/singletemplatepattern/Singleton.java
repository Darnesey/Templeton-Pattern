/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletemplatepattern;

/**
 *
 * @author James Hunter
 */
public class Singleton extends Template{
    
    private static Singleton single;
    
    private Singleton() {
        
    }
    
    public static Singleton createInstance(){
        if (single == null)
            single = new Singleton();
        return single;
    }
    
    public void op1(){
        System.out.println("Single 1");
    }

    @Override
    public void hook() {
        System.out.println("Single hook!");
        //super.hook(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void op3() {
        System.out.println("Single 3!");
//super.op3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void op2() {
        System.out.println("Single 2!");
        //super.op2(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
