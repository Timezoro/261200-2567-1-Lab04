public class HealthRecord {
    private String name;
    private static final int MIN_ALLOWED_HEIGHT = 10; 
    private static final int MAX_ALLOWED_HEIGHT = 300;
    int height;
    static int minheight = 10;
    static int maxheight = 10;

    public HealthRecord(String name, int height) {
        this.name = name;
        if(height < MIN_ALLOWED_HEIGHT || height > MAX_ALLOWED_HEIGHT){
           System.out.println("Invalid height");
        }else{
            if(height > minheight && height < maxheight){
                minheight = height;
            }
            if(height > maxheight){
                maxheight = height;
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public void setheight(int height){
        if(height < MIN_ALLOWED_HEIGHT || height > MAX_ALLOWED_HEIGHT){
            System.out.println("Invalid height");
        }
        else{
            this.height = height;

            if(height > minheight && height < maxheight){
                minheight = height;
            }
            if(height > maxheight){
                maxheight = height;
            }
        }
    }

}


