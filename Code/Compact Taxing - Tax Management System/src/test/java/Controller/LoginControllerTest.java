/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class LoginControllerTest {
    
    @Test
    public void loginSuccessfull(){
        LoginController login = new LoginController();
        Assert.assertEquals(4, login.test(2,2));
    }
    
}
