import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Mma {
    public static void main(String[] args) {
        String path = "D://";
        File file = new File(path+"SomeGir");

        if (!file.exists()){
            file.mkdir();
            System.out.println("Папка создана");
        }else {
            System.out.println("Папка уже создана");
            File filetext = new File("Do://SomeGir/note.txt");
            try{
                filetext.createNewFile();
                System.out.println("Файл успешно создана");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
