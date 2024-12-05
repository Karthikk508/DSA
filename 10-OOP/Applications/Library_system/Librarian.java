//librarians

// 1.add books
// 2.delete books
// 3.view books
// 4.issue books (after seeing requests)
package Applications.Library_system;
import java.util.HashMap;
import java.util.ArrayList;


public class Librarian
{
    static int id = 1;
    int librarianID;
    ArrayList<Student> students;
    HashMap<String,Integer> books;
    //key - BookName and value - studentID
    HashMap<String,Student> newBooksReq;

    public Librarian()
    {
        librarianID = id;
        id = id+1;
        students = new ArrayList<Student>();
        books = new HashMap<String,Integer>();
        newBooksReq = new HashMap<String,Student>();
    }

    public int addStudent()
    {
        Student s = new Student();
        students.add(s);
        return students.size();
    }

    public boolean deleteStudent(int studentID)
    {

            for(int i=0;i<students.size();i++)
            {
                if(studentID == students.get(i).studentID)
                {
                    students.remove(i);
                    System.out.println("Student ID "+studentID+" has been deleted");
                    return true;
                }
            }
            System.out.println("Invalid entry... Student with "+ studentID +" is not found");
            return false;

    }

    public void viewStudent()
    {
        for(Student s:students)
        {
            System.out.println("Student "+ s.studentID);
        }
    }

    public void addBooks(String bookName)
    {
            newBooksReq.remove(bookName);

            books.put(bookName,books.getOrDefault(bookName,0)+1);
    }

    public void deleteBooks(String bookName)
    {
        if(books.containsKey(bookName))
        {
            if(books.get(bookName)>1)
            {
                books.put(bookName,books.get(bookName)-1);
            }
            else
            {
                books.remove(bookName);
            }
        }
        else
        {
            System.out.println("Book does not exists...");
        }
    }

    public void viewBooks()
    {
        for(String key:books.keySet())
        {
            System.out.println("BookName: "+key+"                                  "+"Count: "+books.get(key));
        }
    }

    public void issueBooks(Student currentStudent,String bookName)
    {
        if(!(currentStudent.oldBooksReq.containsKey(bookName)))
        {
            System.out.println("Book: "+bookName+" is not requested by the Student "+currentStudent.studentID);
            return;
        }
        if(books.containsKey(bookName))
        {
            if(books.get(bookName)>1)
            {
                books.put(bookName,books.get(bookName)-1);
            }
            else
            {
                books.remove(bookName);
            }
        }
        else
        {
            System.out.println("Book does not exists...");
            return;
        }
        currentStudent.getBooks(bookName);
    }

    public void newBooksRequests(Student currentStudent,String bookName)
    {
        newBooksReq.put(bookName,currentStudent);
    }

    public void viewNewBookReq()
    {
        if(!(newBooksReq.isEmpty()))
        {
            System.out.println("New Book Requests: ");
        }

        for(String key: newBooksReq.keySet())
        {
            System.out.println("BookName: "+key+"                                  "+"Request from studentID:"+ newBooksReq.get(key).studentID);
        }
    }
}
