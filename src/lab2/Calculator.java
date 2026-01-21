package lab2;

public class Calculator {
    // сумма
    public int summa(int first, int second){
        int summ = first + second;
        return summ;
    }

    public double summa(double first, double second){
        double summ = first + second;
        return summ;
    }

    public long summa(long first, long second){
        long summ = first + second;
        return summ;
    }

    // вычитание
    public int minus(int first, int second){
        int minus = first - second;
        return minus;
    }

    public double minus(double first, double second){
        double minus = first - second;
        return minus;
    }

    public long minus(long first, long second){
        long minus = first - second;
        return minus;
    }

    // умножение
    public int expand(int first, int second){
        int exp = first * second;
        return exp;
    }

    public double expand(double first, double second){
        double exp = first * second;
        return exp;
    }

    public long expand(long first, long second){
        long exp = first * second;
        return exp;
    }

    // деление
    public double slash(int first, int second){
        if (second == 0){
            System.out.println("Зачем на ноль делишь? Ошибка!");
        }

        return ((double)first / (double)second);

    }

    public double slash(double first, double second){
        if (second == 0){
            System.out.println("Зачем на ноль делишь? Ошибка!");
        }
        return first / second;

    }

    public double slash(long first, long second){
        if (second == 0){
            System.out.println("Зачем на ноль делишь? Ошибка!");
        }
        return ((double)first / (double)second);

    }
}
