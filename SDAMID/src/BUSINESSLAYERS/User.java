/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESSLAYERS;

/**
 *
 * @author FA22-BSE-050
 */
 public class User implements Observer {
    @Override
    public void update(String message) {
        System.out.println("User received update: " + message);
    }
}