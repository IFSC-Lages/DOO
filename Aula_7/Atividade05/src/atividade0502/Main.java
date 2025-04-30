package atividade0502;

public class Main {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        try {
            System.out.println(c.calcular("10 / 2"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }

        try {
            System.out.println(c.calcular("8 * 3"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }

        try {
            System.out.println(c.calcular("7 - 5"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }

        try {
            System.out.println(c.calcular("7 / 0"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }

        try {
            System.out.println(c.calcular("a / 0"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }

        try {
            System.out.println(c.calcular("7 / a"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }

        try {
            System.out.println(c.calcular("7 a 0"));

        } catch (ErroPersonalizadoException e) {
            System.out.println("ErroPersonalizadoException: " + e.getMessage());
        }
    }
}
