public class Main {
    public static void main(String[] args){
        // String = a reference data type that can store one or more characters
        //   reference data types have access to useful methods

        String name = " Damian ";

        boolean result = name.equals(" Damian ");
        System.out.println(name + " = Damian " + result);

        result = name.equalsIgnoreCase("daMIAN");
        System.out.println(name + " = daMIAN "  + result);

        int lenght = name.length();
        System.out.println("lenght = " + lenght);

        int index = 2;
        char character = name.charAt(index);
        System.out.println("character at index " + index + " is " + character);

        int indexOf = name.indexOf("i");
        System.out.println("i is found at index " + indexOf);

        boolean empty = name.isEmpty();
        System.out.println("is the name empty? " + empty);

        String upperCase = name.toUpperCase();
        System.out.println("upper cased: " + upperCase);

        String lowerCase = upperCase.toLowerCase();
        System.out.println("lower cased: " + lowerCase);

        String trimmed = name.trim();
        System.out.println("Trimmed: " + trimmed);

        String replaced = name.replace('a','e');
        System.out.println("Replaced: " + replaced);


    }
}
