package MarcoRemon.company;

public interface Vehiculo {
    public void brake(int currentSpeed,int stoppingGear);

    public void accelerate(int sps,int time);

    public int switchGear();
}
