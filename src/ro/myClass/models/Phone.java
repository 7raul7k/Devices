package ro.myClass.models;

public class Phone implements Device {
    private String name;
    private String cpu;
    private int ram;
    private int mp;

    public Phone(String name,String cpu, int ram, int mp) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.mp = mp;
    }

    @Override
    public void describe() {
        System.out.println("Phone name:  " + name);
        System.out.println("CPU: " + cpu);
        System.out.println("Ram: " + ram +" GB");
        System.out.println(mp + "MP");
        System.out.println("\n===========================\n");

    }

    @Override
    public void updateCPU(String cpu) {
        this.setCpu(cpu);


    }

    @Override
    public Device clone() {
      String name = this.name;
      String cpu1 = this.cpu;
      int mp = this.mp;
      Phone phone = new Phone(name,cpu1,ram,mp);
      return phone;
    }

    @Override
    public void updateRAM(int memory) {
        this.setRam(memory);

    }

    @Override
    public String toString(){
        return name+","+cpu+","+mp;
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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
