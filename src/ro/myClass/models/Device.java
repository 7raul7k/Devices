package ro.myClass.models;

public interface Device {
    void describe();
    void updateCPU(String cpu);
    Device clone();
    void updateRAM(int memory);
}
