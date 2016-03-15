package pl.angrymarschmallow.calculatoran;

/**
 * Interfejs do klasy kalkulatora.
 */
public interface CalculatorEngine {
    double multip(double a, double b);   // Mnożenie
    double div(double a, double b);      // Dzielenie
    double sum(double... a);             // Dodawanie
    double substr(double a, double b);   // Odejmowanie
    double pow(double a, double b);      // Potęgowanie
    double sqrt(double a, double b);     // Pierwiastkowanie

    double[] quadratic(double a, double b, double c); // Zakładam, że zwraca listę pierwiastków i deltę, opisz dokładnie

    double sin(double a);
    double cos(double a);
    double tg(double a);
    double ctg(double a);

    //DFT(); Nie wiem co bierze i co zwraca, wyedytuj :]
}
