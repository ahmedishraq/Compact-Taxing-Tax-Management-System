/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class AdminControllerTest {
    
    @Test
    public void adminTestLogin(){
        System.out.println("Admin Portal Login Testing");
        String id = "admin";
        String pass = "1234";
        AdminController loginTest = new AdminController();
        boolean expResult = true;
        boolean result = loginTest.login(id, pass);
        assertEquals(expResult, result);
    }
}
