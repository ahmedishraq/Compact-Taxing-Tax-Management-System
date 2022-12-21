/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Admin_TaxCalculationView1;
import View.User_AppoinmentView;
import View.User_DocumentsView;
import View.User_ProfileView;
import View.User_ReceiptView;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class AdminTaxCalculationController1 {
    public boolean open(){
        Admin_TaxCalculationView1 tc = new Admin_TaxCalculationView1();
        tc.setVisible(true);
        return true;
    }
}
