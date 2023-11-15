import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Repository {
    public static ArrayList<Book> getBook (){
        ArrayList<Book> listBook = new ArrayList<>();

        //tạo đối tượng gson
        Gson gson = new Gson();

        //đọc file
        try {
            FileReader reader = new FileReader("Book.json");
            //lấy kiểu mong muốn được convert sang
            Type objectType = new TypeToken<ArrayList<Book>>(){}.getType();
            listBook = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return listBook;
    }
}
