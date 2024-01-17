 public class Exercise11_TwoRockets {
    public static void main(String[] args) {
        roof();
        sector();
        body();
        sector();
        label();
        sector();
        body();
        sector();
        roof();
    }

    private static void roof() {

        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
        System.out.println("/      \\ /      \\");

    }

    private static void sector() {
        System.out.print("+------+");
        System.out.print(" ");
        System.out.println("+------+");
    }

    private static void body() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("|      | |      |");
        }
    }

    private static void label() {
        System.out.println("|" + "United" + "|" + " " + "|" + "United" + "|");
        System.out.println("|" + "States" + "|" + " " + "|" + "States" + "|");

    }
 }


 // I can eliminate the redundancy of having to type the characters and spaces by dividing them up into
 // modular sections that I can piece together in a lego-like format.
 // The redundancy of having to essentially manually double every set of characters you have for the second rocket,
 // cannot be eliminated without utilizing multiple nested for loops which creates more redundancy.