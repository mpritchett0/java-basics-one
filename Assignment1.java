public class Assignment1 {

    public static void printPattern(int a) {
        switch(a) {
            case 1:
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println(".........");
                break;
            case 2:
                System.out.println("..........");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 3:
                System.out.println("     *     ");
                System.out.println("    ***    ");
                System.out.println("   *****   ");
                System.out.println("  *******  ");
                System.out.println("...........");
                break;
            case 4:
                System.out.println("............");
                System.out.println("  *******  ");
                System.out.println("   *****   ");
                System.out.println("    ***    ");
                System.out.println("     *     ");
                break;
        }   
    }
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++) {
            System.out.println(i+")");
            printPattern(i);
        }
    }
}
