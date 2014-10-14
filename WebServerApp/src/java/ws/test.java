/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bs.Oparations;
import bs.person;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sapu
 */
@WebService(serviceName = "test")
public class test {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "insert")
    public int insert() {
        //TODO write your implementation code here:
        Oparations obj = new Oparations();
        obj.insertData();
        return 1;
    }
    @WebMethod(operationName = "searchpersons")
    public List<person> searchpersons() {
        
        Oparations obj = new Oparations();
        return obj.getdata();
        
        
        //TODO write your implementation code here:
       
    }
}
