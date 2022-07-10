package Java2课本课后习题代码.Chapter04.Exercise4_1;

public class Exercise4_1 {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmmount(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
