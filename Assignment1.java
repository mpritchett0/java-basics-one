public class Assignment1 {

    public static void printPattern(int a) {
        switch(a) {
            case 1:
                String s = "*";
                for(int i = 1; i<5; i++) {
                    System.out.println(s);
                    s+="*";
                }
                System.out.println(".........");
                break;
            case 2:
                System.out.println("..........");
                String k = "****";
                for(int i = 4; i>0; i--){
                    System.out.println(k.substring(0,i));
                }
                break;
            case 3:
                int l = 1;
                for(int i = 5; i>=2; i--){
                    String z = "";
                    for(int o = i; o>0; o--){
                        z +=" ";
                    }
                    for(int p = l; p>0; p--){
                        z +="*";
                    }
                    System.out.println(z);
                    l+=2;
                }
                System.out.println("...........");
                break;
            case 4:
                System.out.println("............");
                int m = 7;
                for(int i = 2; i<=5; i++){
                    String d = "";
                    for(int o = i; o>0; o--){
                        d +=" ";
                    }
                    for(int p = m; p>0; p--){
                        d +="*";
                    }
                    System.out.println(d);
                    m-=2;
                }
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
