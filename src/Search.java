import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Search {
    public static void search(){

        for (Film titel : list.getList ){

            // ich möchte gerne die ArrayList verwenden, aber habe Probleme mit dem Getter....

        }
    }
    public static String input(String ausgabe){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ausgabe);

        try {
            return br.readLine();
        } catch (Exception e){
            return "";
        }
    }
}
