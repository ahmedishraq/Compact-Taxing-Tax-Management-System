/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Admin_LoginView;
import View.User_HomeView;
import View.User_LoginView;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class AdminController {
    
    public boolean adminPortal(){
        Admin_LoginView admin = new Admin_LoginView();
        admin.setVisible(true);
        return true;
    }

    public boolean login(String id, String password) {
        try {
            if (id.equals("ishraq") && password.equals("1234")) {
                JOptionPane.showMessageDialog(null, "Successfull Login");
                User_HomeView user = new User_HomeView();
                user.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "User ID or Password mismatch! Try again");
                Admin_LoginView admin = new Admin_LoginView();
                admin.setVisible(true);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
