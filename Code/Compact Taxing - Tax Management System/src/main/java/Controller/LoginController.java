/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;
import View.Home_PanelView;
import View.User_LoginView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class LoginController {
    public boolean login(String id, String password){
        try{
            if(id.equals("ishraq") && password.equals("1234")){
                JOptionPane.showMessageDialog(null, "Successfull Login");
                Home_PanelView user = new Home_PanelView();
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
    
}
