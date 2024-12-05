package Applications.Library_system;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /* -------------------------- ADMIN -------------------------- */
    /* --------------------------LIBRARIAN-------------------------- */
    // add librarian
    public static void addLibrarian(Admin currentAdmin, int numberOfLibrarians, int adminID) {
        String librarianDetail = " ";
        int librarians = 0;

        librarianDetail = "Admin " + adminID + " added " + numberOfLibrarians + " Librarians Successfully";

        for (int i = 0; i < numberOfLibrarians; i++) {
            librarians = currentAdmin.addLibrarian();
        }

        System.out.println(librarianDetail);
        System.out.println("Total number of librarians: " + librarians);

    }

    // delete librarian
    public static void deleteLibrarian(Admin currentAdmin, int LibrarianID, int adminID) {
        if (currentAdmin.deleteLibrarian(LibrarianID)) {
            System.out.println("Admin " + adminID + " deleted LibrarianID " + LibrarianID + " Successfully");
        }
    }

    // view librarian
    public static void viewLibrarian(Admin currentAdmin) {
        currentAdmin.viewLibrarians();
    }

    /* --------------------------STUDENT-------------------------- */
    // add Student
    public static void addStudent(Admin currentAdmin, Librarian currentLibrarian, int noOfStudents) {
        int students = 0;

        for (int i = 0; i < noOfStudents; i++) {
            students = currentLibrarian.addStudent();
        }

        System.out.println("Admin " + currentAdmin.adminID + " added " + noOfStudents + " students to Librarian "
                + currentLibrarian.librarianID);
        System.out.println("Total number of students for Librarian ID " +currentLibrarian.librarianID+" : "+ students);
    }

    public static void deleteStudent(Admin currentAdmin,Librarian currentLibrarian,int studentID)
    {
        if (currentLibrarian.deleteStudent(studentID)) {
            System.out.println("Admin " + currentAdmin.adminID + " deleted Student "+studentID+" from Librarian "+currentLibrarian.librarianID);
        }
    }

    public static void viewStudent(Admin currentAdmin,Librarian currentLibrarian) {
        System.out.println("Admin ID - "+ currentAdmin.adminID + " with Librarian ID - " + currentLibrarian.librarianID+" : ");
        currentLibrarian.viewStudent();
    }

    /* --------------------------LIBRARIAN-------------------------- */

    //add books
    public static void addBooks(Librarian currentLibrarian,String bookName)
    {
        currentLibrarian.addBooks(bookName);
    }

    public static void deleteBooks(Librarian currentLibrarian,String bookName)
    {
        currentLibrarian.deleteBooks(bookName);
        System.out.println(bookName+" has been deleted from Librarian "+currentLibrarian.librarianID);
    }

    public static void viewBooks(Librarian currentLibrarian)
    {
        currentLibrarian.viewBooks();
    }

    public static void issueBooks(Librarian currentLibrarian,Student currentStudent,String bookName)
    {
        currentLibrarian.issueBooks(currentStudent,bookName);
        System.out.println("Book: "+bookName+" has been issued to Student "+currentStudent.studentID);
    }

    public static void viewNewBookReq(Librarian currentLibrarian)
    {
        currentLibrarian.viewNewBookReq();
    }

    /* --------------------------STUDENT-------------------------- */

    public static void viewBooksfromLibrary(Librarian currentLibrarian)
    {
        currentLibrarian.viewBooks();
    }

    public static void viewBooksfromStudent(Student currentStudent)
    {
        currentStudent.viewBooks();
    }

    public static void addNewBookReq(Librarian currentLibrarian,Student currentStudent,String bookName)
    {
        currentLibrarian.newBooksRequests(currentStudent,bookName);
    }
    public static void addOldBookReq(Student currentStudent,String bookName)
    {
        currentStudent.oldBookRequest(bookName);
    }

    public static void returnBooksToLibrarian(Librarian currentLibrarian,Student currentStudent,String bookName)
    {
        currentStudent.returnBooks(currentLibrarian,bookName);
        System.out.println("Book: "+bookName+" has been returned to Librarian "+currentLibrarian.librarianID);
    }

    public static void main(String[] args) {
        ArrayList<Admin> admins = new ArrayList<Admin>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of admins: ");
        int adminCount = in.nextInt();

        for (int i = 0; i < adminCount; i++) {
            admins.add(new Admin());
        }

        while (true) {
            System.out.println("1.Admin 2.Librarian 3.Student");
            int role = in.nextInt();

            switch (role) {
                // admin
                case 1: {
                    System.out.println("Enter adminID: ");
                    int adminID = in.nextInt();

                    if (adminID > adminCount) {
                        System.out.println("Invalid adminID");
                        break;
                    }

                    Admin currentAdmin = null;
                    Librarian currentLibrarian = null;
                    for (Admin a : admins) {
                        if (adminID == a.adminID) {
                            currentAdmin = a;
                            break;
                        }
                    }

                    System.out.println("1.Add Librarian 2.Delete Librarian 3.View Librarians");
                    System.out.println("4.Add Student 5.Delete Student 6.View Students");
                    int choice = in.nextInt();
                    if(choice>3 && choice<7)
                    {
                        System.out.println("Enter LibrarianID: ");
                        int librarianID = in.nextInt();
                        for (Librarian l : currentAdmin.librarians) {
                            if (librarianID == l.librarianID) {
                                currentLibrarian = l;
                                break;
                            }
                        }
                        if(currentLibrarian == null)
                        {
                            System.out.println("Librarian with ID " + librarianID + " is not found");
                            break;
                        }
                    }
                    
                    switch (choice) {
                        case 1: {
                            System.out.println("Enter number of librarians to add: ");
                            int noOfLibrarians = in.nextInt();
                            // call addLibrarian function to add librarian
                            addLibrarian(currentAdmin, noOfLibrarians, adminID);
                            break;
                        }
                        case 2: {
                            if(currentAdmin.librarians.isEmpty())
                            {
                                System.out.println("No librarians exists...");
                                break;
                            }
                            System.out.println("Enter number of Librarians to delete: ");
                            int noOfLibrarians = in.nextInt();
                            for(int i=0;i<noOfLibrarians;i++)
                            {
                                System.out.println("Enter LibrarianID: ");
                                int librarianID = in.nextInt();
                                // call delete function to remove librarian
                                deleteLibrarian(currentAdmin, librarianID, adminID);
                            }
                            break;
                        }
                        case 3: {
                            viewLibrarian(currentAdmin);
                            break;
                        }
                        case 4: {

                            System.out.println("Enter number of students to add: ");
                            int noOfStudents = in.nextInt();
                            addStudent(currentAdmin, currentLibrarian, noOfStudents);
                            break;
                        }
                        case 5: {
                            if(currentLibrarian.students.isEmpty())
                            {
                                System.out.println("No Students exists...");
                                break;
                            }
                            System.out.println("Enter number of Students to delete: ");
                            int noOfStudents = in.nextInt();
                            for(int i=0;i<noOfStudents;i++)
                            {
                                System.out.println("Enter StudentID: ");
                                int studentID = in.nextInt();
                                // call delete function to remove librarian
                                deleteStudent(currentAdmin, currentLibrarian,studentID);
                            }
                            break;
                        }
                        case 6:
                        {
                            if(currentLibrarian.students.isEmpty())
                            {
                                System.out.println("No Students exists...");
                                break;
                            }
                            //call view function to view list of students
                            viewStudent(currentAdmin,currentLibrarian);
                            break;
                        }
                        default: {
                            System.out.println("Invalid entry...");
                            break;
                        }

                    }
                    break;

                }
                // librarian
                case 2: {
                    System.out.println("Enter LibrarianID: ");
                    int librarianID = in.nextInt();
                    Librarian currentLibrarian = null;

                    outerLoop:
                    for(int i=0;i<admins.size();i++)
                    {
                        for(Librarian l:admins.get(i).librarians)
                        {
                            if(librarianID == l.librarianID)
                            {
                                currentLibrarian = l;
                                break outerLoop;
                            }
                        }

                    }

                    if(currentLibrarian == null)
                    {
                        System.out.println("Invalid Entry...No Librarian exists with an ID - "+librarianID);
                        break;
                    }
                    System.out.println("1.Add Books 2.Delete Books 3.View Books 4.Issue Books 5.See new Books Requests");
                    int choice = in.nextInt();
                    switch(choice)
                    {
                        case 1:
                        {
                            viewNewBookReq(currentLibrarian);
                            System.out.println("Enter the number of Books to add: ");
                            int noOfBooks = in.nextInt();
                            in.nextLine();
                            String bookName = null;
                            for(int i=0;i<noOfBooks;i++)
                            {
                                System.out.println("Enter bookName: ");
                                bookName = in.nextLine();
                                addBooks(currentLibrarian,bookName);
                            }
                            System.out.println("Librarian "+currentLibrarian.librarianID+" added "+noOfBooks+" books");
                            break;
                        }
                        case 2:
                        {
                            if(currentLibrarian.books.isEmpty())
                            {
                                System.out.println("No books exists");
                                break;
                            }
                            System.out.println("Enter the number of Books to delete: ");
                            int noOfBooks = in.nextInt();
                            in.nextLine();
                            String bookName = null;
                            for(int i=0;i<noOfBooks;i++)
                            {
                                System.out.println("Enter bookName: ");
                                bookName = in.nextLine();
                                deleteBooks(currentLibrarian,bookName);
                            }
                            System.out.println("Librarian "+currentLibrarian.librarianID+" deleted "+noOfBooks+" books");
                            break;
                        }
                        case 3:
                        {
                            if(currentLibrarian.books.isEmpty())
                            {
                                System.out.println("No books exists....");
                                break;
                            }
                            System.out.println("Total Books from Librarian "+currentLibrarian.librarianID+": "+currentLibrarian.books.size()+" books");
                            viewBooks(currentLibrarian);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter studentID: ");
                            int studentID = in.nextInt();
                            Student currentStudent = null;
                            for(Student s:currentLibrarian.students)
                            {
                                if(studentID == s.studentID)
                                {
                                    currentStudent = s;
                                    break;
                                }
                            }
                            if(currentStudent == null)
                            {
                                System.out.println("Student ID: "+studentID+" does not exists...");
                                break;
                            }
                            if(currentStudent.oldBooksReq.isEmpty())
                            {
                                System.out.println("No Requests exists...");
                                break;
                            }
                            else {
                                System.out.println("Requests: ");
                                currentStudent.viewRequests();
                            }

                            System.out.println("Enter number of books to issue: ");
                            int noOfBooks = in.nextInt();
                            in.nextLine();
                            String bookName = null;
                            for(int i=0;i<noOfBooks;i++)
                            {
                                System.out.println("Enter book to issue: ");
                                bookName = in.nextLine();
                                issueBooks(currentLibrarian,currentStudent,bookName);
                            }
                            System.out.println("Librarian "+currentLibrarian.librarianID+" issued "+noOfBooks+" books to StudentID "+currentStudent.studentID);
                            break;
                        }
                        case 5:
                        {
                            if(currentLibrarian.newBooksReq.isEmpty())
                            {
                                System.out.println("No new books addition requests exists");
                                break;
                            }
                            viewNewBookReq(currentLibrarian);
                            break;
                        }
                        default: {
                            System.out.println("Invalid entry...");
                            break;
                        }
                    }
                    break;
                }
                // student
                case 3: {
                    System.out.println("Enter studentID: ");
                    int studentID = in.nextInt();
                    Student currentStudent = null;
                    Librarian currentLibrarian = null;

                    outerLoop:
                    for(int i=0;i<admins.size();i++)
                    {
                        for(Librarian l:admins.get(i).librarians)
                        {
                            for(Student s:l.students)
                            {
                                if(studentID == s.studentID)
                                {
                                    currentStudent = s;
                                    currentLibrarian = l;
                                    break outerLoop;
                                }
                            }
                        }

                    }

                    if(currentStudent == null)
                    {
                        System.out.println("Invalid Entry...No Student exists with an ID - "+studentID);
                        break;
                    }
                    System.out.println("1.View Books from Library 2.View Books issued to Student 3.Request 4.Return books to Library");
                    int choice = in.nextInt();
                    switch(choice)
                    {
                        case 1:
                        {
                            if(currentLibrarian.books.isEmpty())
                            {
                                System.out.println("No books exists...");
                                break;
                            }
                            System.out.println("Books from Librarian "+currentLibrarian.librarianID);
                            viewBooksfromLibrary(currentLibrarian);
                            break;
                        }
                        case 2:
                        {
                            if(currentStudent.books.isEmpty())
                            {
                                System.out.println("No books exists");
                                break;
                            }
                            System.out.println("Books from Student "+currentStudent.studentID);
                            viewBooksfromStudent(currentStudent);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("1.Request to add new addition in Library");
                            System.out.println("2.Request to issue already available book");
                            int choose = in.nextInt();
                            switch(choose)
                            {
                                case 1:
                                {
                                    System.out.println("Enter number of New Books to be added for Requests: ");
                                    int noOfNewBooks = in.nextInt();
                                    in.nextLine();
                                    String bookName = null;
                                    for(int i=0;i<noOfNewBooks;i++)
                                    {
                                        System.out.println("Enter bookName: ");
                                        bookName = in.nextLine();
                                        addNewBookReq(currentLibrarian,currentStudent,bookName);
                                    }
                                    System.out.println("Total: "+noOfNewBooks+" new books has been requested to Librarian to add");
                                    break;

                                }
                                case 2:
                                {
                                    if(currentLibrarian.books.isEmpty())
                                    {
                                        System.out.println("No books available in the Library...");
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Available Books: ");
                                        currentLibrarian.viewBooks();
                                    }

                                    System.out.println("Enter number of requests: ");
                                    int noOfRequest = in.nextInt();
                                    in.nextLine();
                                    String bookName = null;
                                    for(int i=0;i<noOfRequest;i++)
                                    {
                                        System.out.println("Enter bookName to Request: ");
                                        bookName = in.nextLine();
                                        if(!(currentLibrarian.books.containsKey(bookName)))
                                        {
                                            System.out.println("Oops!...No such book exists in the Library");
                                            continue;
                                        }
                                        addOldBookReq(currentStudent,bookName);
                                    }
                                    System.out.println("Total: "+noOfRequest+" books has been requested for issue to Librarian "+currentLibrarian.librarianID);
                                    break;
                                }
                                default: {
                                    System.out.println("Invalid entry...");
                                    break;
                                }
                            }
                            break;
                        }
                        case 4:
                        {
                            if(currentStudent.books.isEmpty())
                            {
                                System.out.println("No books exists....");
                                break;
                            }

                            System.out.println("Enter number of books to return to Library: ");
                            int noOfBooks = in.nextInt();
                            in.nextLine();
                            if(noOfBooks>currentStudent.books.size())
                            {
                                System.out.println("Number exceeded the number of books present");
                                break;
                            }
                            String bookName = null;
                            for(int i=0;i<noOfBooks;i++)
                            {
                                System.out.println("Enter bookName: ");
                                bookName = in.nextLine();
                                if(!(currentStudent.books.containsKey(bookName)))
                                {
                                    System.out.println("Book does not exists");
                                    break;
                                }
                                returnBooksToLibrarian(currentLibrarian,currentStudent,bookName);
                            }
                            break;
                        }
                        default: {
                            System.out.println("Invalid entry...");
                            break;
                        }
                    }
                    break;
                }
                // edge case
                default: {
                    System.out.println("Invalid entry...");
                    break;
                }
            }
        }
    }
}