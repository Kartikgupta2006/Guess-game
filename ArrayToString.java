public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[]{
        "this", "that", "is", "are" , "you", "am"
        };
        java.lang.StringBuilder sb= new  java.lang.StringBuilder();
        for (String str :arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
