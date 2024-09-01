public class toStringCar {
        int noOfWheel;
        int NoOfDoor;
        int maxSpeed;
        String name;
        String modelNumber;
        String company;

     toStringCar(int noOfWheel, int noOfDoor, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheel = noOfWheel;
        this.NoOfDoor = noOfDoor;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "noOfWheel=" + noOfWheel +
//                ", NoOfDoor=" + NoOfDoor +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", modelNumber='" + modelNumber + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//     }
     @Override
    public String toString() {
         java.lang.StringBuilder sb = new java.lang.StringBuilder("car{");
         sb.append(" noOfWheel=").append(noOfWheel);
         sb.append(", noOfDoor=").append(NoOfDoor).append(", maxspeed=").append(maxSpeed).append(", name=").append(name)
                 .append(", modelNumber").append(modelNumber).append(", company= ").append(company);
         sb.append(" } ");
         return sb.toString();
     }
     public static void main(String[] args) {
        toStringCar sb = new toStringCar(4,4,120,
                             "swift", "SW128","Mautri");
        System.out.println(sb);

    }
}
