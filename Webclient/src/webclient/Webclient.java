/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webclient;

import java.util.Iterator;
import java.util.List;
import ws.Person;

/**
 *
 * @author Dumindu
 */
public class Webclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("All persons --->");
        List<ws.Person> personList = searchpersons();
        for (Iterator<Person> it = personList.iterator(); it.hasNext();) {
            Person person = it.next();
            System.out.println("pid " + person.getId());
            System.out.println("name " + person.getName());
            System.out.println("age " + person.getAddress());
        
    }
    }

    private static java.util.List<ws.Person> searchpersons() {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.searchpersons();
    }
    
}
