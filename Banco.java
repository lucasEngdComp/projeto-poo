package br.com.bb;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private List<Conta> listaContas = null; 
    // construtor
    Banco()
    {
        listaContas = new LinkedList<>();
    }

    public boolean cadastrarConta( int número,
                                   String titular,
                                   double saldoInicial ){

        // verificar se conta existe
        for( Conta c : listaContas ) // for-each
            if( c.getNúmero() == número )
                return false; // já existe!

        //for( int i = 0; i < listaContas.size(); i++)
        //    if( listaContas.get( i ).getNúmero() == número )
        //        return false; // já existe!

        // senão existir, devo criar a conta, cadastrar na lista
        // e retornar true
        Conta temp = new Conta( número, titular, saldoInicial );
        return listaContas.add( temp );

    }

    public int quantidadeContas()
    {
        return listaContas.size();
    }

    public boolean buscarConta( int número )
    {
        return false; // falta implementar com Test-driven development
    }
}

// TESTE - ------------------------

import java.util.Scanner;
 
public class String9 {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String s;
    char c;
    int i, n, ctalfa = 0, ctnum = 0;
 
    System.out.printf("Informe uma String:\n");
    s = ler.nextLine();
 
    System.out.println();
 
    n = s.length(); // tamanho da string (qtde de caracteres)
    for (i=0; i<n; i++) {
      c = s.charAt(i); // i-ésimo caractere da string 's'
// verificando se é um caractere alfabético
      if (((c >= 'A') && (c <= 'Z')) ||
          ((c >= 'a') && (c <= 'z'))) {
         ctalfa = ctalfa + 1;
         System.out.printf("%c ---> %da. letra\n", c, ctalfa);
      }
// verificando se é um caractere numérico
      else if ((c >= '0') && (c <= '9')) {
              ctnum = ctnum + 1;
              System.out.printf("%c ---> %do. número\n", c, ctnum);
           }
           else System.out.printf("%c\n", c);
    }
  }
 
}
