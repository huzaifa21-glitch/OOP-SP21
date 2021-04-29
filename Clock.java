
class Clock{
 String hrs,mins,secs;
 public Clock(){

 }
 public Clock(String h,String m, String s){
  hrs=h;
  mins=m;
  secs=s;
 }

 public void display(){

  System.out.println(hrs+":"+mins+":"+secs);
 }

}