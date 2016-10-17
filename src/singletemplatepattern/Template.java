/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletemplatepattern;

/**
 *
 * @author RYAN DARNELL"S CODE ONLY
 */
public abstract class Template {
    
    public Template(){
        
    }
    
    public final void templateRun(){
        op1();
        op2();
        op3();
        hook();
    }
    
    public void op1(){
        System.out.println("base 1");
    }
    
    public void op2(){
        System.out.println("base 2");
    }
    
    public void op3(){
        System.out.println("base 3");
    }
    
    public void hook(){
        System.out.println("Base hook!");
    }
    
}
