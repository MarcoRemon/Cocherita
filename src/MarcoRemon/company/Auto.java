package MarcoRemon.company;

public abstract class Auto {

    private final int maxSpeed;
    private final int sps;
    private final int stoppingGear;
    private final String patente;

    public String getPatente() {
        return patente;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSps() {
        return sps;
    }

    public int getStoppingGear() {
        return stoppingGear;
    }

    public Auto(int maxSpeed, int sps, int stoppingGear,String patente) {
        this.maxSpeed = maxSpeed;
        this.sps = sps;
        this.stoppingGear = stoppingGear;
        this.patente=patente;

    }



}
