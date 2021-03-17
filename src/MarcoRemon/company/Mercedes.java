package MarcoRemon.company;

public class Mercedes extends Auto implements Vehiculo {

    private String brand;
    private String color;
    private String duenho;
    private final int baseGear=0;
    private int actualGear;
    private final int maxGear=5;



    private String patente;

    public Mercedes(String brand, String color, String duenho,String patente) {
        super(300, 35, 3,patente);
        this.brand = brand;
        this.color = color;
        this.duenho = duenho;
    }

    @Override
    public void brake(int currentSpeed, int stoppingGear) {
        System.out.println("Car is braking at:"+(currentSpeed-(stoppingGear*2.5))+ " miles per second");
    }

    @Override
    public void accelerate(int sps, int time) {
        System.out.println("Current speed increasing by:"+(sps*time)+ " in time");
    }

    @Override
    public int switchGear() {
        System.out.println("Switching gears");

        if (actualGear!=maxGear){
            return this.actualGear+1;
        }else System.out.println("Dayum. Dont go full Icarus here boi");
        this.actualGear=baseGear;
        return actualGear;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getDuenho() {
        return duenho;
    }


}
