package session2;

public class TamGiac2 {
    public int a;
    public int b;
    public int c;

    public TamGiac2(){

    }

    public TamGiac2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int getChuvi(){
        return a+b+c;
    }
    public double getDientich(){
        double p = (double)(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
