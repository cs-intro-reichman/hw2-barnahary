// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String s = args[0].toUpperCase();
        int length = s.length();
        String an ="AEFHILMNORSXaefhilmnorsx";
        for (int i = 0; i < length; i++) {
                char o = s.charAt(i);
                if (an.indexOf(o) != -1) {
                        System.out.println("Give me an " + o + ": " + o + "!");
                } else {
                        System.out.println("Give me a  " + o + ": " + o + "!");
                }
        }
        int n = Integer.parseInt(args[1]);
        System.out.println("What does that spell?");
                for (int t = 0; t < n; t++)
                System.out.println(s + "!!!");
        }
        }
