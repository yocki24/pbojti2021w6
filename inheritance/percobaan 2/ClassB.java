public class ClassB extends ClassA{
    private int z;

    public void setSuper(int x, int y){
        super.x = x;
        super.y = y;
    }
    public void setZ(int z){
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai z: " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah: " + (super.x + super.y + z));
    }
}
