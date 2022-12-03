/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.User_LoginView;
import View.User_RegisterView;
import org.w3c.dom.UserDataHandler;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class RegisterController {
    public boolean registrationPortal(){
        User_RegisterView reg = new User_RegisterView();
        reg.setVisible(true);
        return true;
    }
    
    public boolean register(String email, String id, String password){
        try{
            //System.out.println("email: "+email+" "+"User ID:"+id+" Password: "+password);
            User_LoginView user = new User_LoginView();
            user.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
}
