//Librarian
// 1.add librarian
// 2.delete librarian
// 3.view librarian

//Student
// 1.add student
// 2.delete student
// 3.view student
package Applications.Library_system;
import java.util.ArrayList;

public class Admin
{
    static int id =1;
    int adminID;
    ArrayList<Librarian> librarians;
    ArrayList<String> librarianDetails;

    public Admin()
    {
        adminID = id;
        id = id +1;
        librarians = new ArrayList<Librarian>();
        librarianDetails = new ArrayList<String>();
    }

    public int addLibrarian()
    {
        Librarian l = new Librarian();
        librarians.add(l);
        return librarians.size();
    }

    public boolean deleteLibrarian(int librarianID)
    {
        for(int i=0;i<librarians.size();i++)
        {
            if(librarianID == librarians.get(i).librarianID)
            {
                librarians.remove(i);
                System.out.println("librarian ID "+librarianID+" has been deleted");
                return true;
            }
        }
        System.out.println("Invalid entry... Librarian with "+ librarianID+" is not found");
        return false;

    }

    public void viewLibrarians()
    {
        if(librarians.isEmpty())
        {
            System.out.println("No Librarians exists...");
            return;
        }
        for (Librarian librarian : librarians) {
            System.out.println("Librarian ID: " + librarian.librarianID);
        }
        System.out.println("Total number of librarians: "+librarians.size());
    }
}

