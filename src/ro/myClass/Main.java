package ro.myClass;

import ro.myClass.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("I7 10700K","RTX 2080",16,2,250);
        Laptop laptop = new Laptop("I9 10900K" ,"RTX 3090",32,1,500);
        Phone phone = new Phone("Samsung galaxy s22","Cortex-X2",8,10);
        Tablet tablet = new Tablet("Samsung tablet","ARM Cortex-A73",8,32,10);
        ArrayList<Device> devices = new ArrayList<>();
        devices.add(computer);
        devices.add(laptop);
        devices.add(phone);
        devices.add(tablet);
        Gadgets gadgets = new Gadgets(devices);
        gadgets.updateRAM(16);
        gadgets.updateCPU("Intel core");
        gadgets.describe();


    }
}