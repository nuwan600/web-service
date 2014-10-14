/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bs;

import db.Dbconection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dumindu
 */
public class Oparations {
    
    Connection con = Dbconection.getConnection();
    Statement statement = null;
    ResultSet resultSet = null;
    
    
   public  List<person> getdata()
           
   {
       List<person> personlist = new ArrayList<person>();
       
       
   try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from  EAD.PERSON");
            
            while (resultSet.next()) {
                person p = new person();

                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setAddress(resultSet.getString("address"));
                
                System.out.println("name");

                personlist.add(p);
            }
        } catch (SQLException ex) {
            
        } finally {
            
        }
        return personlist;
    }
   public void insertData()
   {
       try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("insert into  EAD.PERSON values(2,'dumidu','aaaa')");
             System.out.println("inserted successfully");
       } catch (Exception e) {
             System.out.println("came to catch");
       }
   
   }
}