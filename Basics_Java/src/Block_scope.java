public class Block_scope {
    public static void main(String[] args) {
        int a=10;

        {
            a=20;
            int c=10;
            System.out.println("The variables can be accessed inside the scope " + c);
        }

        System.out.println(a + " " +a); //c instead of a will give us error // if any variable is declared inside the scope it cannot be accessed outside the block
    }
}
