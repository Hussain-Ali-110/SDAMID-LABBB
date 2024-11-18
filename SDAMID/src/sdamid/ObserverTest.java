/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdamid;

 

import BUSINESSLAYERS.Admin;
import BUSINESSLAYERS.University;
import BUSINESSLAYERS.User;
import DATALAYERS.Transport;

public class ObserverTest {
    public static void main(String[] args) {
        Admin admin = new Admin();
        University university = new University();
        User user = new User();
        Transport transport = new Transport();
        transport.addObserver(admin);
        transport.addObserver(university);
        transport.addObserver(user);
        transport.publicTcpApplyFilter("Filter 1");
        transport.publicTcpApplyFilter("Filter 2");

        transport.removeObserver(university);
        transport.publicTcpApplyFilter("Filter 3");
    }
}

