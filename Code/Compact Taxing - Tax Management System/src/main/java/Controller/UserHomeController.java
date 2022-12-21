/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.User_ProfileView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class UserHomeController {
    public boolean open(){
        User_ProfileView profile = new User_ProfileView();
        profile.setVisible(true);
        return true;
    }
}
