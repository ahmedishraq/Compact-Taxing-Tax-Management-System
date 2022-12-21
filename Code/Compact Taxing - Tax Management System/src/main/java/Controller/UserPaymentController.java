/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.User_AppoinmentView;
import View.User_DocumentsView;
import View.User_PaymentView;
import View.User_ProfileView;
import View.User_ReceiptView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class UserPaymentController {
    public boolean open(){
        User_PaymentView pay = new User_PaymentView();
        pay.setVisible(true);
        return true;
    }
}
