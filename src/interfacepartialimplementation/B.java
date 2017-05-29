/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepartialimplementation;

/**
 *
 * @author tiago.lucas
 */
public abstract class B implements A{
    @Override
    public void showA(){
        System.out.println("showA() of A interface");
    }
}
