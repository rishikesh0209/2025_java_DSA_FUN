public class StringMethods {
    public static void main(String[] args){
        String abc = "Hello Brother";

        boolean check = abc.equals("hello brother"); // returns false
        System.out.println("check value 1: " + check);
        check= abc.equalsIgnoreCase("hello brother");// return true as it ignore the case;

        System.out.println("check value 2: " + check);

        char character = abc.charAt(1);
        System.out.println("char at 1: " + character);
        
        int length = abc.length();
        System.out.println("lenght of string check " + length);

        char[] charArray = {'y','o','t','a'};
        System.out.println("char to array of:" + charArray + "to: "+ charArray.toString());

        int indexOfChar = abc.indexOf("o");
        System.out.println("index pf character 'o' is " + indexOfChar);

        StringBuilder reversedABc= new StringBuilder("acsadffwfsdvfersef");
        System.out.println("reverse of: " + reversedABc + " is: " +reversedABc.reverse().toString());
        System.out.println("Original StringBuilder content after reverse(): " + reversedABc.getClass().getSimpleName());
        char[] charabc = abc.toCharArray();
        System.out.println("String to char array: "  +charabc[0]);

        String[] splitString = "apple,bannana,mango,nuts,cashew".split(",");
        for(String str:splitString){
            System.out.println("str is: "+str);
        }

    }
}
