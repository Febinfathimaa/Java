public class CPU {
    private double price;
    private Processor processor;
    private static RAM ram;

    public CPU(double price, int numCores, String processorManufacturer, int memory, String ramManufacturer) {
        this.price = price;
        this.processor = new Processor(numCores, processorManufacturer);
        this.ram = new RAM(memory, ramManufacturer);
    }

    public double getPrice() {
        return price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public static RAM getRAM() {
        return ram;
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(500.0, 4, "Intel", 8, "Kingston");
         System.out.println("Name:Febin fathima\nReg No:22MCA025\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:28/03/2023\n\n");
        System.out.println("CPU Price: $" + cpu.getPrice());
        System.out.println("Processor: " + cpu.getProcessor().getNumCores() + " cores, " +
                cpu.getProcessor().getManufacturer());
        System.out.println("RAM: " + cpu.getRAM().getMemory() + " GB, " +
                cpu.getRAM().getManufacturer());
    }

    private class Processor {
        private int numCores;
        private String manufacturer;

        public Processor(int numCores, String manufacturer) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
        }

        public int getNumCores() {
            return numCores;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    private static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }
}

