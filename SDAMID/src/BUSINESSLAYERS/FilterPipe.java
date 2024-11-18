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
public class FilterPipe {

    private String status;
    public void applyFilter(String filter) {
        this.status = "Status after applying filter: " + filter;
        notifyObservers();
    }

    public void publicTcpApplyFilter(String filter) {
        System.out.println("Applying TCP filter: " + filter);
        applyFilter(filter);
    }

    public String getStatus() {
        return status;
    }

    private void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
