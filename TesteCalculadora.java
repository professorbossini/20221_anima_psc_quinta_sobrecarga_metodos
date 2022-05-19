import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        //1. Instanciar a classe Calculadora
        //Ou seja, construir um objeto do tipo Calculadora
        //Calculadora calc = new Calculadora();
        var calc = new Calculadora();

        //2. Obter dois inteiros junto ao usuário
        var a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        var a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        //3. Somar os dois inteiros utilizando o método somar da calculdora
        var resultado = calc.somar(2, 3);
        
        //4. Exibir o resultado
        JOptionPane.showMessageDialog(null, "Resultado da soma: " + resultado);
        

    }
}
