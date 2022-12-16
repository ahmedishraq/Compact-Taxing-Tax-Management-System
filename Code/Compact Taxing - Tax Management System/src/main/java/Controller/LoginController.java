/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.User_HomeView;
import javax.swing.JOptionPane;
import View.User_RegisterView;
import View.User_LoginView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class LoginController {
    
    public boolean userPortal(){
        User_LoginView user = new User_LoginView();
        user.setVisible(true);
        return true;
    }
    
    public boolean login(String id, String password){
        try{
            if(id.equals("ishraq") && password.equals("1234")){
                JOptionPane.showMessageDialog(null, "Successfull Login");
                User_HomeView user = new User_HomeView();
                user.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"User ID or Password mismatch! Try again");
                User_LoginView user = new User_LoginView();
                user.setVisible(true);
            }
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public int test(int a, int b){
        return a + b;
    }
    
}
