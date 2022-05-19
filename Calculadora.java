public class Calculadora{
    //tipo de retorno: int
    //nome: somar
    //lista de parâmetros: (a, b)
    //corpo
    int somar (int a, int b){
        return a + b;
        //int res = a + b;
        //return res;    
    }

    float somar(float a, float b){
        return a + b;
    }

    float somar(int a, float b){
        return a + b;
    }

    int somar(int a, int b, int c){
        return a + b + c;
    }
    
    int somar (String s1, String s2){
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
    //impleementar um método somar que viabilize a compilação da linha 19 do outro lado
    int somar (String s, int a){
        return Integer.parseInt(s) + a;
    }

    //e agora?
    int somar (int a, String s){
        //reescrever a linha abaixo
        //não vale usar o operador +
        return somar (s, a);
        //return Integer.parseInt(s) + a;
    }
}