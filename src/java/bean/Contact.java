/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author yunshuliang
 */
public class Contact {
    private String name;
    private String mobile;
    
    public void setName(String name){
        this.name=name;
    }
        
    public void setMobile(String mobile){
        this.mobile=mobile;    
    }
    
    public String getName(){
        return this.name;    
    }
    
    public String getMobile(){
        return this.mobile;    
    }
}
