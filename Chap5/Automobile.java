public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;
    public Automobile(int i, String ma, String mo, String c,
                      int y, double mp) {
                          id = i;
                          make = ma;
                          model = mo;
                          color = c;
                          year = y;
                          mpg = mp;
    }
    public void setId(int i) {
        id = i;
        if (id < 0 || id>9999){
            id = 0;}
    }
    public void setMake(String ma) {
        make = ma;
    }
    public void setModel(String mo) {
        model = mo;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setYear(int y) {
        year = y;
        if (y > 2019 || y < 2005){
            year = 0;}
            
    }
    public void setMpg(double mp) {
        mpg = mp;
        if (mpg > 60 || mpg < 10){
            mpg = 0;}
    }
    public int getId() {
        return id; }
    public String getMake() {
        return make;}
    public String getModel() {
        return model;}
    public String getColor() {
        return color;}
    public int getYear() {
        return year;}
    public double getMpg() {
        return mpg;}
}
