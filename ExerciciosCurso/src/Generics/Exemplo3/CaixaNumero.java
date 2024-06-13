package Generics.Exemplo3;

import Generics.Exemplo1.Caixa;

//Number: pai de int, double, float... pai dos numeros
                         //restringe N a ser apenas classes q herdam Number
public class CaixaNumero<N extends Number> extends Caixa<N>{

}
