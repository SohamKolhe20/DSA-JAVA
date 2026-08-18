package Array.Easy;

public class reverseWordsinString {
        static String reverseWords(String s) {
            // String[] str=s.trim().split("\\s+");

            // String out="";

            // for (int i=str.length-1;i>0;i--){
            //     out=out+str[i]+" ";
            // }
            // return out+str[0];

            StringBuilder ans = new StringBuilder();
            int l = s.length();
            int i = l - 1;

            while(i>=0){

                while(i>=0 && s.charAt(i) == ' '){
                    i--;
                }
                if (i < 0) {
                    break;
                }

                int j = i;

                while(j>=0 && s.charAt(j) != ' '){
                    j--;
                }

                if (ans.length() > 0) {
                    ans.append(' ');
                }

                ans.append(s,j+1,i+1);

                while(j>0 && s.charAt(j) == ' '){
                    j--;
                }
                i = j;


            }

            return ans.toString();
        }

    public static void main(String[] args) {
        String s = "MY NAME IS MOMO";


        System.out.println(reverseWords(s));
    }
}

