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
public class LoginControllerTest {

    @Test
    public void loginSuccessfull() {
        System.out.println("Login Protal Testing");
        final String id = "ishraq";
        final String pass = "1234";
        LoginController loginTest = new LoginController();
        boolean expResult = true;
        boolean result = loginTest.login(id,pass);
        assertEquals(expResult, result);
    }

}
