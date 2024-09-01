public class forEachLoop {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "ram", "sita", "mohan", "kartik"
        };
        printArray(arr);
        printArrayForEach(arr);
    }
    public static void printArrayForEach(String[] arr){
        for(String name: arr){
            System.out.println(name);
        }

        }
    public static void printArray(String[] arr){
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
