public class Main {
    public static void main(String[] arg){
        HealthRecord patient1 = new HealthRecord("John Doe", 175);
        HealthRecord patient2 = new HealthRecord("Doe John", 165);
        HealthRecord patient3 = new HealthRecord("John Smith", 185);
       
        patient1.setheight(200);
        patient2.setheight(10);
        System.out.println("Min Height: " + HealthRecord.minheight + " CM");
        System.out.println("Max Height: " + HealthRecord.maxheight + " CM");

    }

}
