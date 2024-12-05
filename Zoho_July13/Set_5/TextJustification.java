package Set_5;

import java.util.ArrayList;
import java.util.List;

class TextJustification  {

    public static void main(String[] args) {

       String[] words = {"This", "is", "an","example", "of", "text", "justification."};
       int max = 16;
       System.out.println(fullJustify(words,max));


    }
    public static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<>();
        int index = 0 ;

        while(index < words.length)
        {

            int count = words[index].length()+1;
            int last = index + 1;

            while(last < words.length && words[last].length()+count+1 <= maxWidth)
            {
                count += 1 + words[last].length();
                last++;
            }

            StringBuilder builder = new StringBuilder();
            builder.append(words[index]);

            int diff = last - index - 1;


            if(last == words.length || diff == 0)
            {
                for(int i = index+1; i<last; i++)
                {
                    builder.append(" ");
                    builder.append(words[i]);
                }
                for(int i = count; i<maxWidth; i++)
                {
                    builder.append(" ");
                }
            }
            else
            {
                int space = (maxWidth - (count - 1))/diff;
                int extraSpace = (maxWidth - (count - 1)) % diff;

                for(int i = index+1; i<last; i++)
                {
                    for(int j = 0; j<space; j++)
                    {
                        builder.append(" ");
                    }
                    while(extraSpace > 0)
                    {
                        builder.append(" ");
                        extraSpace--;
                    }
                    builder.append(" ");
                    builder.append(words[i]);
                }
            }
            ans.add(builder.toString());
            index = last;
        }
        return ans;

    }
//    public static List<String> fullJustify(String[] words, int maxWidth) {
//
//        List<String> lines = new ArrayList<>();
//
//        int index = 0;
//        while(index < words.length)
//        {
//            int count = words[index].length();
//            int last = index + 1;
//            while(last < words.length)
//            {
//                if(count+1+words[last].length() > maxWidth) break;
//                count = count+1+words[last].length();
//                last++;
//            }
//            StringBuilder builder = new StringBuilder();
//            builder.append(words[index]);
//
//            int diff = last-index-1;
//
//            if(last == words.length || diff == 0)
//            {
//                for(int i = index+1; i<last; i++)
//                {
//                    builder.append(" ");
//                    builder.append(words[i]);
//                }
//                for(int i = builder.length(); i<maxWidth; i++)
//                {
//                    builder.append(" ");
//                }
//            }
//            else
//            {
//                // Calculate spaces
//                int spaces = (maxWidth - count) / diff;
//                int extraSpaces = (maxWidth - count) % diff;
//                for (int i =index + 1; i < last; i++){
//                    for (int s = spaces; s > 0; s--){
//                        builder.append(" ");
//                    }
//                    if (extraSpaces > 0) {
//                        builder.append(" ");
//                        extraSpaces--;
//                    }
//                    builder.append(" ");
//                    builder.append(words[i]);
//                }
//            }
//            lines.add(builder.toString());
//            index = last;
//        }
//        return lines;
//    }
}