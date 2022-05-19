public class TesteCalculadoraV2 {
    public static void main(String[] args) {
        var calc = new Calculadora();
        int a = 2, b = 3;
        float f1 = 3.5f, f2 = 4.7F;

        String s1 = "5", s2 = "74";

        calc.somar(a, b);

        calc.somar(f1, f2);

        calc.somar(a, f1);

        calc.somar(a, b, 15);

        calc.somar(s1, s2);

        calc.somar(s1, b);

        calc.somar(5, "74");

    }    
}
