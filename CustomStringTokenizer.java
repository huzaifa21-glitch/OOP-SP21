import java.util.StringTokenizer;

class CustomStringTokenizer {


    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), finalCount=0;
        String temp;
        boolean flag;
        double dValue;

        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();

            try{
                dValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException e){
                flag=false;
            }

            if(!flag)
                finalCount++;
        }
        return finalCount;
    }

    public static void main(String[] args) {
        int tokens;
        StringTokenizer sT1 = new StringTokenizer("There are 4 bugs in this program");
        StringTokenizer sT2 = new StringTokenizer("There are four bugs in this program");

        tokens = countTokens(sT1);
        System.out.println("Number of Tokens in string 1: "+ tokens);

        tokens = countTokens(sT2);
        System.out.println("Number of Tokens in string 2: "+ tokens);
    }
}