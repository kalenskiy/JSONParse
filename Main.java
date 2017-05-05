package JSONParse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Dom.com\\IdeaProjects\\XMLParse\\src\\JSONw\\json.txt");
        String res;
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            byte[] bytes = new byte[(int)raf.length()];
            raf.read(bytes);
            res = new String(bytes);
        }
        //System.out.println(res);
        Gson gson = new GsonBuilder().create();
        Person person = (Person) gson.fromJson(res, Person.class);
        System.out.println(person.toString());
    }
}
