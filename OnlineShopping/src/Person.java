/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vaibhavatul47
 */
public abstract class Person {
    
    String uName;
    String name;
    String mobileno;
    String pass;
    String squen;
    String sans;
    String city;
    String address;
    
    abstract boolean isValidUser();
    abstract boolean knowsSecurityAns(int SecQues, String Ans);
    abstract void updatePassword(String pwd);
}
