package ro.myClass.models;

public class Laptop implements Device {

    private String cpu;
    private String gpu;
    private int ram;
    private int hdd;
    private int ssd;

    public Laptop(String cpu, String gpu, int ram, int hdd, int ssd) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
    }

    @Override
    public void describe() {
        System.out.println("Laptop");
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("HDD: " + hdd + "TB");
        System.out.println("SSD: " + ssd + "GB");
        System.out.println("\n=========================\n");
    }

    @Override
    public void updateCPU(String cpu) {
        this.setCpu(cpu);

    }

    @Override
    public Device clone() {
        String cpu = this.cpu;
        String gpu= this.gpu;
        int ram=this.ram;
        int hdd=this.hdd;
        int ssd=this.ssd;
        Laptop laptop = new Laptop(cpu,gpu,ram,hdd,ssd);
        return laptop;
    }

    @Override
    public void updateRAM(int memory) {
        this.setRam(memory);

    }
    @Override
    public String toString(){
        return cpu+","+gpu+","+ram+","+ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
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

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
}
