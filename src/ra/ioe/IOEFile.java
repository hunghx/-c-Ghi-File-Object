package ra.ioe;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOEFile {
    public static List<Book> readFile() throws IOException, ClassNotFoundException {
        File file = new File("book.txt");
        if(!file.exists()){
            return new ArrayList<>();
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Book> list =(List<Book>) ois.readObject();
        return list;
    }

    public static void writeFile(List<Book> list) throws IOException {
        File file = new File("book.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
    }
    public static List<Author> readFileAuthor() throws IOException, ClassNotFoundException {
        File file = new File("author.txt");
        if(!file.exists()){
            return new ArrayList<>();
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Author> list =(List<Author>) ois.readObject();
        return list;
    }

    public static void writeFileAuthor(List<Author> list) throws IOException {
        File file = new File("author.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
    }
}
