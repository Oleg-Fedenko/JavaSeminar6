package JavaSeminar6;

public class laptop {
    //public static int counter = 0;
    //private int id;
    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public laptop(String name, int ram, int storageCap, String os, String colour, double diagonal){
        //this.id = counter++;
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n", 
                    this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof laptop) {
            return this.name.equals(((laptop) obj).name) && this.ram == ((laptop) obj).ram 
                                && this.storageCap == ((laptop) obj).storageCap && this.os.equals(((laptop) obj).os) 
                                && this.colour.equals(((laptop) obj).colour) && this.diagonal == ((laptop) obj).diagonal;
        }
        return false;
        
    }

    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.storageCap;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
    
}