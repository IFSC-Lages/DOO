package atividade0502;

public class Calculadora {

    private int num1, num2;
    private String operador;

    public Calculadora() {
    }

    public int calcular(String expressao) throws ErroPersonalizadoException {

        String[] stringSeparada;
        stringSeparada = expressao.split(" ");

        try {
            num1 = Integer.parseInt(stringSeparada[0]);
        } catch (Exception e) {
            throw new ErroPersonalizadoException("Primeiro valor não é um número!");
        }

        try {
            num2 = Integer.parseInt(stringSeparada[2]);
        } catch (Exception e) {
            throw new ErroPersonalizadoException("Segundo valor não é um número!");
        }

        operador = stringSeparada[1];

        if (operador.charAt(0) == '/' && num2 == 0) {
            throw new ErroPersonalizadoException("Denominador não pode ser 0");
        }

        {
            switch (operador) {
                case "/":
                    return num1 / num2;
                case "*":
                    return num1 * num2;

                case "+":
                    return num1 + num2;

                case "-":
                    return num1 - num2;
                default: throw new ErroPersonalizadoException("Operador desconhecido!");
            }
        }
        
    }

}
