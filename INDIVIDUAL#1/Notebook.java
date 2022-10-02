public class Notebook extends Computer{
    private int battery;

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public Notebook() {
        super();
    }

    public Notebook(double frequency, int ram, int videoMemory, String motherboardType, int battery) {
        super(frequency, ram, videoMemory, motherboardType);
        this.battery = battery;
    }


    void print(){
        System.out.println("CPU Frequency: " + getFrequency() + "GHz " + "RAM:" + getRam() + "gb " + "Video Memory: " + getVideoMemory() + "gb " + "Motherboard type" + getMotherboardType() + " "+ "Battery time" + battery + "h ");
    }
    void batteryChange(int x){
        battery = x;
    }
}
