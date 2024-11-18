/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTATIONLAYERS;

/**
 *
 * @author FA22-BSE-050
 */
 public class Main {
    public static void main(String[] args) {
        User user = new User();
        Admin admin = new Admin();
        University university = new University();

        Transport transport = new Transport();
        transport.addObserver(user);
        transport.addObserver(admin);
        transport.addObserver(university);

        FilterPipe filterPipe = new FilterPipe(transport);

        System.out.println("---- Applying High Priority Filter ----");
        filterPipe.pipeUpdate("High Priority");

        transport.removeObserver(user);
        System.out.println("\n---- Applying Low Priority Filter ----");
        filterPipe.pipeUpdate("Low Priority");

        System.out.println("\n---- Final Transport Status ----");
        System.out.println("Transport status: " + transport.getStatus());
    }
}
