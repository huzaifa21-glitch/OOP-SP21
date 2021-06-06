import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HumanResource {
       private int index ;

       private ArrayList<Association> resource = new ArrayList();


       public  void Add(Association... resource){
           if (index==1){
for (Association r: resource){
           this.resource.add(r);
}

           index++;
       }else {
          extend();
          index++;
           }
           this.resource.addAll(Arrays.asList(resource));

       }
    private void extend() {
        ArrayList<Association> extendedResources = new ArrayList();
        for (Association EXRes : extendedResources) {
            this.resource.add(EXRes);
        }
        Collections.copy(resource, extendedResources);
    }
    public boolean delete(int index) {
        ArrayList<Association> extendedResources = new ArrayList();
        boolean exists = false;
        int lastIndex = -1;

        for (int i = 0; i < resource.size() && resource.get(i) != null; ++i) {
            if (index == i) {
                exists = true;
                continue;
            }

            lastIndex = i;
        }

        if (exists) {
            Collections.copy(resource, extendedResources);
            resource.set(lastIndex, null);
        }

        return exists;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("HumanResource:\n");

        for (int i = 0; i < resource.size() && resource.get(i) != null; ++i) {
            res.append(resource.get(i)).append("\n");
        }

        return res.toString();
    }
/* @Override
    public String toString() {

        StringBuilder res = new StringBuilder("HumanResource:\n");

        for (int i = 0; i < resources.size() && resources.get(i) != null; ++i) {
            res.append(resources.get(i)).append("\n");
        }

        return res.toString();
    }
    public void addEntity( String s , int id , String type){
        if(index == -1){
            entity = new Person2[1];
            index++;
        } else{
            extend();
            index++;
        }

        if (type.equals("Student"))
            entity[index] = new Student2(s , id);
        else if (type.equals("Teacher"))
        {
            entity[index] = new Teacher2(s , id);
        }

        if ( entity[index] instanceof Student2)//
        {
            ((Student2)entity[index]).associate();
        }
        else if ( entity[index] instanceof Teacher2)
        {
            ((Teacher2)entity[index]).associate();
        }

    }

    private void extend(){
        Person2[] extendedArray = new Person2[index+2];
        for(int i = 0; i<=index;i++){
            extendedArray[i] = entity[i];
        }
        entity = extendedArray;
    }

    public String toString(){
        String s="";
        for(int i=0;i<=index;i++){
            s = s+entity[i]+"\n";
        }
        return s;
    }

    public void delete(String name){
        Person2[] newArray = new Person2[index];
        boolean del = false;
        int isolatedIndex=0;
        for(int i=0;i<=index;i++){
            if((entity[i].getName()).equals(name))
            {
                del = true;
                continue;
            }
            newArray[isolatedIndex] = entity[i];
            isolatedIndex++;
        }
        if (del)
        {
            index--;
            del =false;
        }
       entity = newArray;
    }
*/

}

