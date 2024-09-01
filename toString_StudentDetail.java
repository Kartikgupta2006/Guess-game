 class toString_StudentDetail {
      String name;
      int age;
      String roll;
      int house;


     public toString_StudentDetail(String name, int age, String roll, int house) {
         this.name = name;
         this.age = age;
         this.roll = roll;
         this.house = house;
     }

     @Override
     public String toString() {
         return "Student Detail:{ name:" + name +
                 ",  age:" + age +
                 ",  roll: " + roll +
                 ",  house:" + house + " }";
     }

     public static void main(String[] args) {
         toString_StudentDetail std1 = new toString_StudentDetail("kartik", 18,
                                                                  "231181134039", 222);
         System.out.println(std1);
     }
 }
