import java.util.*;
public class capitalizefirstChar {
public static void capitalizeFirstChar(String str)
{
StringTokenizer st = new StringTokenizer(str," ");
    StringBuilder sb = new StringBuilder();
    while(st.hasMoreTokens()){
        String word = st.nextToken();
        if(word.length() > 0){
            char firstChar = Character.toUpperCase(word.charAt(0));
            String restofWord = word.substring(1);
            sb.append(firstChar).append(restofWord);
        }
        if(st.hasMoreTokens()){
            sb.append(" ");
        }
    }
    System.out.println(sb.toString());
}

public static void main(String args[]){
    String str = "my name is yashasvi";
    capitalizeFirstChar(str);
}
}
