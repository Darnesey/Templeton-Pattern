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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Singleton singly = Singleton.createInstance();
        Singleton single2 = Singleton.createInstance();
        singly.templateRun();
    }
    
}
