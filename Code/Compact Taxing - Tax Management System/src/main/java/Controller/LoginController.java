/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;
import View.Home_PanelView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class LoginController {
    public boolean login(String id, String password){
        try{
            if(id.equals(id) && password.equals(password)){
                JOptionPane.showMessageDialog(null, "Successfull Login");
                Home_PanelView user = Home_Panel();
                user.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"User ID or Password mismatch! Try again");
            }
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
}
