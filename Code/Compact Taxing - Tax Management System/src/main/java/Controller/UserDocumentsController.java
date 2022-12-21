/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.User_DocumentsView;
import View.User_ProfileView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class UserDocumentsController {
    public boolean open(){
        User_DocumentsView doc = new User_DocumentsView();
        doc.setVisible(true);
        return true;
    }
}
