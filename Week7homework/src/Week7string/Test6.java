package Week7string;
/* 6. Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/
public class Test6 {
    public static void main(String[] args) {
        String S1 = new String("I@love@java");
        String str2 = S1.replaceAll("@", " ");
        System.out.println("Our String is ': " + S1);
        System.out.println("Replacing all '@' with ' ': " + str2);
        System.out.println("Replacing 'I' with 'We ': " + str2.replace("I", "We"));//replace() fun used;

    }
}
