//students

// 1.view books from library
// 2.view books from self
// 3.Request for new addition
// 4.Request to issue available book
// 5.Return books to librarian
package Applications.Library_system;
import java.util.HashMap;

public class Student
{
    static int id =1;
    int studentID;
    HashMap<String,Integer> books;
    HashMap<String,Integer> oldBooksReq;

    public Student()
    {
        studentID = id;
        id = id+1;
        books = new HashMap<String,Integer>();
        oldBooksReq = new HashMap<String,Integer>();
    }

    public void getBooks(String bookName)
    {
        books.put(bookName,books.getOrDefault(bookName,0)+1);

        oldBooksReq.remove(bookName);
    }

    public void viewBooks()
    {
        for(String key: books.keySet())
        {
            System.out.println("BookName: "+key+" Count: "+ books.get(key));
        }
    }

    public void oldBookRequest(String bookName)
    {

        oldBooksReq.put(bookName,oldBooksReq.getOrDefault(bookName,0)+1);
    }

    public void viewRequests()
    {
        for(String key: oldBooksReq.keySet())
        {
            System.out.println("BookName: "+key+" Count: "+ oldBooksReq.get(key));
        }
    }

    public void returnBooks(Librarian currentLibrarian,String bookName)
    {
        if(books.containsKey(bookName)&&books.get(bookName)>1)
        {
            books.put(bookName,books.get(bookName)-1);
        }
        else
        {
            books.remove(bookName);
        }
        currentLibrarian.addBooks(bookName);
    }

}

