public class switchTernaryPrac {

    public static void main(String [] args){
        
        
        char pw = 'C'; //pw set as 'C'
        
        String result = (pw == 'C') ? "Enter" : "Access Denied"; //result char == pw, password is correct, returns true, "Enter" ***MUST SAVE TERNANARY AS ANOTHER INSTANCE
       
        System.out.println(result); //print resut of pw confirmation
        
        int seatNumber = 4; //seat int 4
        
        String name; //declare string name
        
        switch (seatNumber){ //switch is set to seatnumber integer with {} braces
        
    case 1: name = "Bob"; //case 1
                break;      //break needed for switch
    case 2: name = "James"; //case 2
                break;      //break needed for switch
    case 3: name = "Joe"; //case 3
                break;     //break needed for switch
    case 4: name = "Chris Weiss"; //true case
                break;     //break needed for switch
    default: name = "Not present!"; //default case
                break;     //break needed for switch
        }
        
        System.out.println(name);
    
    }
}
