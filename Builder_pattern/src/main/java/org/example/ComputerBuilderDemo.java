package org.example;

public class ComputerBuilderDemo {
    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();

        builder.addHdd(HDD.MAX).hasUsbC(true).hasGigabitWifi(true);

        Computer computer = builder.build();

        System.out.println(computer.getDiskSize());
        System.out.println(computer.isHasGigabitWiFi());
        System.out.println(computer.getRamSize());
        System.out.println(computer.isHasUsbC());
    }
}
