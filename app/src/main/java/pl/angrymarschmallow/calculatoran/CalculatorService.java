package pl.angrymarschmallow.calculatoran;

/**
 * Główna klasa obliczająca (typu Service, nic nie przechowuje, nie jest obiektem w rozumieniu
 * Domain Drive Development - zawiera jedynie metody, które coś robią i zawsze wynik zwracają)
 */
public class CalculatorService implements CalculatorEngine {
    // Miejsce na implementację metod z interfejsu :]

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
