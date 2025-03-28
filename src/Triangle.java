public class Triangle extends Shape {
    private int SideA;
    private int SideB;
    private int SideC;

    // area,perimeter, shape extends, attributes are private, A ve B - 90* , toString
    //Mainde triangle oluştur, alanını çevresini yazdır

    public Triangle(Point Top,int SideA,int SideB,int SideC){
        super(Top);
        this.SideA = SideA;
        this.SideB = SideB;
        this.SideC = SideC;
    }

    public Triangle(Point Top,int SideAB,int SideC){
        super(Top);
        this.SideA = SideAB;
        this.SideB = SideAB;
        this.SideC = SideC;
    }

    public int getSideA() {
        return SideA;
    }

    public void setSideA(int sideA) {
        SideA = sideA;
    }

    public int getSideB() {
        return SideB;
    }

    public void setSideB(int sideB) {
        SideB = sideB;
    }

    public int getSideC() {
        return SideC;
    }

    public void setSideC(int sideC) {
        SideC = sideC;
    }


    @Override
    public double area(){
        return 0.5*SideA*SideB;
    }

    @Override
    public double perimeter(){
        return SideA+SideB+SideC;

    }
    @Override
    public String toString() {
        return "Triangle{" +
                "SideB=" + SideB +
                ", SideA=" + SideA +
                ", SideC=" + SideC +
                ", location=" + location +
                '}';
    }
}
