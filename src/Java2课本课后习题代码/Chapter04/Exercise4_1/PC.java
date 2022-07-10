package Java2课本课后习题代码.Chapter04.Exercise4_1;

public class PC {
    CPU cpu ;
    HardDisk hardDisk ;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    void show(){
        System.out.printf("CPU速度%d，硬盘容量%d",  cpu.getSpeed(), hardDisk.getAmmount());
    }
}
