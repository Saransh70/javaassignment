package com;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{
            c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Javamain","root","Sana9868471333");
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
