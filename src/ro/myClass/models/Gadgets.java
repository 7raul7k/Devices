package ro.myClass.models;

import java.util.ArrayList;

public class Gadgets implements Device{
    private ArrayList<Device> devices;

    public Gadgets(ArrayList<Device> devices) {
        this.devices = devices;
    }


    @Override
    public void describe() {
        for (int i = 0 ; i < devices.size();i++){
            devices.get(i).describe();
        }

    }

    @Override
    public void updateCPU(String cpu) {
        for (int i = 0 ; i < devices.size();i++){
            this.devices.get(i).updateCPU(cpu);
        }

    }

    @Override
    public Device clone() {
       ArrayList<Device> devices1 = new ArrayList<>();
       for (int i = 0 ; i < devices.size();i++){
           devices1.add(this.devices.get(i).clone());
       }
       return (Device) devices1;
    }

    @Override
    public void updateRAM(int memory) {
        for (int i = 0 ; i < devices.size();i++){
            this.devices.get(i).updateRAM(memory);
        }
    }
}
