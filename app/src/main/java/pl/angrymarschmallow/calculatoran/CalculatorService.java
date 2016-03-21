package pl.angrymarschmallow.calculatoran;

/**
 * Główna klasa obliczająca (typu Service, nic nie przechowuje, nie jest obiektem w rozumieniu
 * Domain Drive Development - zawiera jedynie metody, które coś robią i zawsze wynik zwracają)
 */
public class CalculatorService implements CalculatorEngine {
    // Miejsce na implementację metod z interfejsu :]

    public CalculatorService() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double multip(double a, double b) {
        return 0;
    }

    @Override
    public double div(double a, double b) {
        return 0;
    }

    @Override
    public double sum(double... a) {
        return 0;
    }

    @Override
    public double substr(double a, double b) {
        return 0;
    }

    @Override
    public double pow(double a, double b) {
        return 0;
    }

    @Override
    public double sqrt(double a, double b) {
        return 0;
    }


    /**
     * zwraca delte i liste pierwiastkow w tablicy
     * @param a double
     * @param b double
     * @param c double
     * @return zwraca wartosc delty i pierwiastki
     */
    @Override
    public double[] quadratic(double a, double b, double c) {
        double[] rozw;
        double delta=(b*b)-(4*a*c);
        double x1,x2;
        if (delta<0){
            rozw = new double[1];
            rozw[0]=delta;
            return rozw;}
        else if (delta == 0)
        {
            x1=(-b)/(2*a);
            rozw = new double[2];
            rozw[0]=delta;
            rozw[1]=x1;
            return rozw;
        }
        else if (delta>0)
        {
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            rozw = new double[3];
            rozw[0]=delta;
            rozw[1]=x1;
            rozw[2]=x2;
        return rozw;
    }
        return null;
    }

    @Override
    public double sin(double a) {
        return Math.sin(Math.toRadians(a));
      }

    @Override
    public double cos(double a) {
        return  Math.cos(Math.toRadians(a));
    }

    @Override
    public double tg(double a) {
        return Math.tan(Math.toRadians(a));
    }

    @Override
    public double ctg(double a) {
        return 1/Math.tan(Math.toRadians(a));
    }

    @Override
    public boolean perfect(int a) {
        return false;
    }

    @Override
    public boolean first(int a) {
        return false;
    }

    @Override
    public double nwd(int a, int b) {
        return 0;
    }

    // ! Piszcie komentarze do metod.


    /**
     * dzielenie modularne
     * @param a - licznik
     * @param b - dzielnik
     * @return - wynik operacji dzielenia modularnego a przez b
     */
    @Override
    public int mod(int a, int b) {
        return  a % b;
    }

    /**
     * silnia
     * @param a - stopien potegi
     * @return - wartość n-silni
     */
    @Override
    public int fact(int a) {
        if (a < 1){
            return 1;
        }else {
            return a * fact(a -1);
        }
    }

}
