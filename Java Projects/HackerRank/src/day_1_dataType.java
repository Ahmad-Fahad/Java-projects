import java.util.Scanner;

/**
 * Created by Sign in on 12-06-2017.
 */
public class day_1_dataType {
    public static void main(String[] args) {
        String s = "HackerRank ";

        String _string_value = "";

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        _string_value = scan.nextLine();

        _string_value = s + _string_value ;

        String c = scan.nextLine();

        System.out.println(x);

        System.out.println(_string_value);
    }
}
