/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bayujp
 */
public class session {
     private static String user,id;
    
    public static void setuser(String user){
        session.user = user;
        
    }
    
    public static String getuser(){
    return user;
    }
    
    public static void setid(String id){
        session.id = id;
        
    }
    
    public static String getid(){
    return id;
    }
    
}
