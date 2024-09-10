public class Contador {
    public static void main(String[] args) {
        int parameter1 = IO.getInt("Digite o primeiro parâmetro:");
        int parameter2 = IO.getInt("Digite o segundo parâmetro:");

        try {
            count(parameter1, parameter2);
        } catch (InvalidParametersException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro.");
            System.exit(1);
        }
    }

    static void count(int p1, int p2) throws InvalidParametersException{
        if (p1 >= p2) {
            throw new InvalidParametersException();
        }

        int num_count = p2 - p1;

        for (int i = 0; i <= num_count; i++) {
            System.out.println(p1 + i);
        }
    }
}
