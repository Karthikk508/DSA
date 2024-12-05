
public class Max_char_btw_2same_char
{

    public static void main(String[] args) {

        String s = "absbcbsfksfbna";
        System.out.println(maxChars(s));
    }
    public static int maxChars(String str)
    {
        //code here
        int freq = -1;
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))){
                int temp = str.lastIndexOf(str.charAt(i))-str.indexOf(str.charAt(i))-1;
                if(temp>freq){
                    freq = temp;
                }
            }
        }
        return (freq!=-1)?freq:-1;
    }
}