public class Marks {

   static int marks1;
    static int marks2;
    static int marks3;

    Marks(){
      marks1 = marks1;
      marks3 = marks3;
      marks2 = marks2;
    }
    Marks(int mark1,int mark2,int mark3){
       marks1 = mark1;
       marks2 = mark2;
       marks3 = mark3;
    }

    public void result(){
         int sum= marks1+marks2+marks3;
        System.out.println("Result:"+sum);
    }
}
