public class QuadraticEquationSolver {
    public static void main(String[] args) {
        QuadraticEquationSolver solve = new QuadraticEquationSolver();
        System.out.println(solve);
    }

    public double[] solve(int a, int b, int c) {
        double[] coef = new double[0];
        double[] coef1 = new double[1];
        double[] coef2 = new double[2];

        int d = b * b - 4 * a * c;

        if (d < 0) {
            return coef;
        } else if (d == 0) {
            double x1 = (b * (-1)) / (2 * a);
            coef1[0] = x1;
            return coef1;
        } else {
            double x1 = ((b * (-1)) + Math.sqrt(d)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(d)) / (2 * a);
            coef2[0] = x1;
            coef2[1] = x2;
            return coef2;
        }


    }
}
