package figurasGeométricas;

public class trapezoide {
    /*-trapezoides asimétricos
    Es una figura que no tiene lados paralelos ni eje de simetría.La suma de susángulos interiores será de 360°.
    Area= A=(B+b/2)h
    perímetro = P=L+L+L+L */
    private double l, p, a, b, bm, h;

    public trapezoide(){}

    public trapezoide(double l,double p,double a,double b, double bm,double h){
        this.p = p;
        this.l = l;
        this.a = a;
        this.b = b;
        this.bm = bm;
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getBm() {
        return bm;
    }

    public void setBm(double bm) {
        this.bm = bm;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void calcularArea(double b, double bm, double h){
        System.out.println("Para calcular el area de la figura tenemos una base menor de "+ b +", una base mayor de "+ bm +" y una altura de "+h);
        a= ((b+bm)/2)*h;
        System.out.println("El valor de el area es: "+a);
    }

    public void calcularPerimetro(double l){
        System.out.println("Para calcular el perimetro de la figura tenemos "+ l);
        for(int i=0;i<=4;i++){
            p = l + p;
        }
        System.out.println("El valor de el perímetro es: "+p);
    }
}
