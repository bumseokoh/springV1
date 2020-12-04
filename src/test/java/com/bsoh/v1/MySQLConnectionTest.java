package com.bsoh.v1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
public class MySQLConnectionTest {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PW = "00000123";

    @Test
    public void testConnection() throws Exception{

        Class.forName(DRIVER);

        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            System.out.println(con);
        }catch(Exception e) {
            e.printStackTrace();
        }//try_
    }//testConnection_
}//MySQLConnectionTest_