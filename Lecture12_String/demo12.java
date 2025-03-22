package Lecture12_String;

public class demo12 {
    public static void main(String[] args) {
     String name =  "rahulkhilari1242@gmail.com" ; 
     String userName = "";

     for(int i = 0 ; i < name.length() ; i++){
        if(name.charAt(i) == '@'){
            userName = userName + "";
            break;
        }else{
            userName = userName + name.charAt(i);
        }
     }
     System.out.println(name);
     System.out.println(userName);
    }
}
