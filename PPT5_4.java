public class PPT5_4 {
    int modelYear;
    String modelName;

    public PPT5_4(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        PPT5_4 myObj = new PPT5_4(1969, "Mustang");
        System.out.println(myObj.modelYear + " " + myObj.modelName);
    }
}