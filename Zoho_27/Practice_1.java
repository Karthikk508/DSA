class Practice_1 {

        public static void main(String[]args) {

            System.out.println(zoho("abca"));

        }
    public static boolean zoho(String s) {

    int i = 0;

    int j = s.length() - 1;

       while(i <= j){

        if(s.charAt(i) == s.charAt(j)){

            i++;
            j--;

        }

        else return help(s, i + 1, j) || help(s, i, j - 1);

    }

        return true;

}

public static boolean help(String s, int i, int j){

    while(i <= j){

        if(s.charAt(i) == s.charAt(j)){

            i++;

            j--;

        }

        else return false;

    }

    return true;

}

}

