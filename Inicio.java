import java.security.Principal;
import java.util.* ;

// Introdução ao java
// Tipos primitivos: boolean(true,false), char('x' um caractere), string( cadeia de caracteres "xx"), int(numero inteiro ( 123) ), long( grande némero inteiro: (12344545)), float(numero com casas decimais: (1.323441)), double( número com Mais casas decimais :(1.18273197323)), void(vazio)

//Orientação ao Objeto:  
// Atributos: Caracteristicas, podendo ser variáveis ou constantes, todos possuem um tipo especifico.
// Metodos: Também chamadas funções, são as ações que o algoritmo realiza.
// Classes: forma de classificar elementos do mesmo tipo, também podemos classificar como abstração de objeto.
// Objeto: Concretização de classe; valores preenchidos.
//Coriocidade: toda nova classe que criamos se torna um tipo, exemplo: pessoa
// O metodo void faz uma ação sem executar valor.



//Criando um atribut:
// 'tipo' 'nome' ="2342342423432424" sintaquese de criação de atributo
//int cpf  = [1223343] [213131] ; // 32bits
//long cpf = [121232133133] ; //62bitz
//String cpf  = "232342343243" ;

// Sintase java criação

public class Main
{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // in entrada de dados, out saida de dados
        System.out.println("digite o valor de A");
        System.out.println("digite o valor de B");
        System.out.println("digite o valor de C");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        Main principal = new Main();
        String msg = "mensagem qualquer";
        principal.atv1(msg);
        principal.atv1p(A,B,C);
    }
        public void atv1p(int A, int B, int C){
            int delta = calcDelta(A, B, C);
            double x1 = -(B + Math.sqrt(delta))/ (2*A);

        }

        public int calcDelta(int A, int B, int C){
            int delta = B*B - 4*A*C;
            return delta;
        }

     public void atv1(String mensagem){
        System.out.print(mensagem); //sintase do printe do java
     }
}
