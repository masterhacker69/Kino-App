import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Import {

    private ArrayList<Film> list = new ArrayList<Film>();

    public ArrayList<Film> getList(){
        return list;
    }

    public Import(){
        String zeile = null;
        try{
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));

            while (in.ready()){
                if((zeile = in.readLine())!=null){
                    System.out.println(zeile);
                    importToList(zeile);
                }
            }

        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (Film f:list){
            System.out.println("Titel: " + f.titel + "Ort: " + f.ort + "Kino: " + f.kino + "Uhrzeit: " + f.zeit + "Genre: " + f.genre + "FSK: " + f.fsk);
        }
    }

    private void importToList(String zeile){
        String[] filmAttribute = zeile.split(";");
        Film neuerFilm = new Film ();

        neuerFilm.titel=filmAttribute[0];
        neuerFilm.ort=filmAttribute[1];
        neuerFilm.kino=filmAttribute[2];
        neuerFilm.zeit=filmAttribute[3];
        neuerFilm.genre=filmAttribute[4];
        neuerFilm.fsk=filmAttribute[5];

        list.add(neuerFilm);
    }
}
