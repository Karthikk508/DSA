package SecondRound_2nd_pdfProblems;

public class Qn_28 {
    
    
    public static void main(String[] args) {
        
        String s = "The quick brown fox jumps over the lazy dog";
        
        System.out.println(checkPanagram(s));
    }


    public static boolean checkPanagram (String s) {
        // your code 

        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                freq[s.charAt(i) - 'A']++;
            }

            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                freq[s.charAt(i) - 'a']++;
            }
        }

        for(int i : freq){
            if(i == 0){
                return false;
            }
        }
        return true;
    }
}
