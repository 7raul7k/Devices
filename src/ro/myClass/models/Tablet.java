package ro.myClass.models;

public class Tablet implements Device{
    private String name;
    private String cpu;
    private int ram;
    private int hdd;
    private int mp;

    public Tablet(String name, String cpu, int ram, int hdd, int mp) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.mp = mp;
    }

    @Override
    public void describe() {
        System.out.println("Tablet name: " + name);
        System.out.println("CPU: " + cpu);
        System.out.println("Ram: " + ram + " GB");
        System.out.println(mp + "MP");
        System.out.println("Storage: " + hdd + " TB");
        System.out.println("\n===========================\n");
    }

    @Override
    public void updateCPU(String cpu) {
        this.setCpu(cpu);

    }

    @Override
    public Device clone() {
        String name = this.name;
        String cpu = this.cpu;
        int ram = this.ram;
        int mp = this.mp;
        int hdd = this.hdd;
        Tablet tablet = new Tablet(name,cpu,ram,hdd,mp);
        return tablet;
    }
    @Override
    public String toString(){
        return name+","+cpu+","+ram+","+mp+","+hdd;
    }

    @Override
    public void updateRAM(int memory) {
        this.setRam(memory);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
