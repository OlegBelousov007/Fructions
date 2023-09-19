/**
 * класс Fractions - базовый класс для дробей
 * @author Белоусов О.А.
 */
    public class Fraction {
        private int numerator;
        private int denominator;

        Fraction() {
            this.numerator = numerator;
            this.denominator = 1;
        }

        public Fraction(int numerator, int denominatcor) {
            this.numerator = numerator;
            this.denominator = denominatcor;
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public Fraction sum(Fraction fraction) {
            Fraction result = sum(fraction, this);
            return result;
        }

        public Fraction sum(Fraction a, Fraction b) {

            int newDenominator = Math.naimObKrat(a.denominator, b.denominator);
            int cNumerator = a.numerator * (newDenominator / a.denominator) + b.numerator * (newDenominator / b.denominator);

            Fraction newF = new Fraction(cNumerator, newDenominator);
            return newF;
        }

        @Override
        public String toString() {
            return "Fraction(дробь){" + "numerator(числитель)= " + numerator + ", denominator(знаменатель)= " + denominator + '}';
        }
    }



