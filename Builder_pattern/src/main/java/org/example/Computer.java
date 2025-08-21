package org.example;

public class Computer {

    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbC;
    private boolean hasGigabitWiFi;

    public Computer(ComputerBuilder builder) {
        this.diskSize = builder.diskSize;
        this.ramSize = builder.ramSize;
        this.hasUsbC = builder.hasUsbC;
        this.hasGigabitWiFi = builder.hasGigabitWiFi;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean isHasUsbC() {
        return hasUsbC;
    }

    public boolean isHasGigabitWiFi() {
        return hasGigabitWiFi;
    }

    public static class ComputerBuilder {

        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbC;
        private boolean hasGigabitWiFi;

        public ComputerBuilder() {}

        public Computer build() {
            return new Computer(this);
        }

        public ComputerBuilder addRam(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder addHdd(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder hasUsbC(boolean hasUsbC) {
            this.hasUsbC = hasUsbC;
            return this;
        }

        public ComputerBuilder hasGigabitWifi(boolean hasGigabitWiFi) {
            this.hasGigabitWiFi = hasGigabitWiFi;
            return this;
        }
    }


}
