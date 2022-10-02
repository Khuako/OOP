public class Computer {
    private double frequency;
    private int ram;
    private int videoMemory;
    private String motherboardType;
    Computer(){
        frequency = 2.2;
        ram = 4;
        videoMemory = 2;
        motherboardType = "ATX";
    }

    public Computer(double frequency, int ram, int videoMemory, String motherboardType) {
        this.frequency = frequency;
        this.ram = ram;
        this.videoMemory = videoMemory;
        this.motherboardType = motherboardType;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
    }

    public String getMotherboardType() {
        return motherboardType;
    }

    public void setMotherboardType(String motherboardType) {
        this.motherboardType = motherboardType;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "CPU frequency=" + frequency + "GHz" +
                " , RAM=" + ram + "GB"+
                " , Video memory=" + videoMemory + "GB" +
                " , Type of motherboard='" + motherboardType + '\'';
    }
    void print(){
        System.out.println(toString());
    }
}
