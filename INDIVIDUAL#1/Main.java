import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Cpu frequency:");
        double freq = in.nextDouble();
        System.out.println("ram");
        int ram = in.nextInt();
        System.out.println("Video memory");
        int videoMemory = in.nextInt();
        System.out.println("Motherboard");
        String motherBoardType = in.nextLine();
        in.nextLine();
        Computer computer = new Computer(freq,ram,videoMemory,motherBoardType);
        System.out.println("battery time");
        int battery = in.nextInt();
        Notebook notebook = new Notebook(computer.getFrequency(), computer.getRam(), computer.getVideoMemory(), computer.getMotherboardType(), battery);
        notebook.print();
        notebook.batteryChange(10);
        notebook.print();

    }
}
