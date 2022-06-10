package ClaseN2SemanaN3;


import java.util.*;

public class Controller {

    public static void main(String[] args) {
        ArrayList<ContactBook>contactBooks = new ArrayList<>();
        view.menu(contactBooks);


       for (int i=0;i<contactBooks.size();i++){
           System.out.println(contactBooks.get(i));
       }
    }
}
