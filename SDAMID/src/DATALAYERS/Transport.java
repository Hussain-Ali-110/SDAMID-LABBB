/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATALAYERS;

/**
 *
 * @author FA22-BSE-050
 */
  import java.util.ArrayList;
import java.util.List;

public class Transport {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

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
}

