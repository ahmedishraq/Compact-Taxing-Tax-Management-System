/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ahmed_ishraq <https://github.com/ahmedishraq>
 */
public class UserModel {
    private String id;
    private String pass;
    
    
    public void setId(String id){
        this.id = id; 
    }
    
    public String getId(){
        return id;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getPass(){
        return pass;
    }
}
