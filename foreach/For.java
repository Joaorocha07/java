package foreach;

public class For {
    public static void main(String[] args) {
        String[] vect = new String[] {"maria", "Bob", "Alex"};

        System.out.println("\nteste com o for normal:");
        for(int x = 0; x < vect.length; x++) {
            System.out.println(vect[x]);
        }

        System.out.println("\nteste com outro modelo de for:");
        for(String obj : vect) {
            System.out.println(obj);
        }


    }
}
