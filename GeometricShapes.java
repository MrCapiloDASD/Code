public class GeometricShapes {
    public static void main (String[] args){


        // Area Formula: 1/2 * base * height
        double base = 29.0;
        double height = 20.0;
        double area = 0.5 * base * height;

        // Perimeter: base + height + hypotenuse (sqrt(a^2 + b^2))
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        double perimeter = base + height + hypotenuse;


        // Output results
        System.out.println("Right Triangle Results: " + area + "m");
        System.out.println("Perimeter: " + perimeter + "m" );

    }

}
