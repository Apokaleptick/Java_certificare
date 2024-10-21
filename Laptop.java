import java.util.Objects;

public class Laptop {
    private int ram; 
    private int hdd; 
    private String os; 
    private String color;
    private String processor;
    private String gpu; 

    public Laptop(int ram, int hdd, String os, String color, String processor, String gpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.processor = processor;
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGpu() {
        return gpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "RAM=" + ram + " GB" +
                ", HDD=" + hdd + " GB" +
                ", OS='" + os + '\'' +
                ", Color='" + color + '\'' +
                ", Processor='" + processor + '\'' +
                ", GPU='" + gpu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && hdd == laptop.hdd &&
                os.equals(laptop.os) && color.equals(laptop.color) &&
                processor.equals(laptop.processor) && gpu.equals(laptop.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, os, color, processor, gpu);
    }
}

