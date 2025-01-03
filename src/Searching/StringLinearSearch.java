package Searching;

public class StringLinearSearch {
    public static void main(String[] args) {
            
        String str ="Jai Sri Ram and Jai Hnuman";
        char searchChar = 'i'; 
        boolean found = false;
        // for(int i= 0;i<str.length();i++){
        //     if(str.charAt(i) == searchChar){
        //         System.out.println("The character found at index: "+i);
        //         found= true;
        //         break;
        //     }
        // }
           for(int i=0;i<str.toCharArray().length;i++){
            if(str.toCharArray()[i] == searchChar){
                System.out.println("The character found at index: "+i);
                found = true;
                break;
            }
        }

        if(!found){
        System.out.println("The character not found in the string");

        }


     

    }
}
