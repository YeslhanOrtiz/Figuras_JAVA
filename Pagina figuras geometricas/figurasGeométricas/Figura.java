package figurasGeométricas;

public class Figura {
    private double a,p,l,b,h;

    public void Figura(){}

    public void Figura(double a,double p,double l,double b,double h){

	this.a = a;
	this.p = p;
	this.l = l;
	this.b = b;
	this.h = h;

}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
