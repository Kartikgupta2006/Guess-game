import java.util.Locale;

class string_concatenateAndConvert {
    public static void main(String[] args) {
        String Firstname = "Kartik";
        String LastName = "Gupta";
        String fullName = Firstname.concat(" " + LastName);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
    }
}
