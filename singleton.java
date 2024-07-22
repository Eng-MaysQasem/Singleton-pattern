
package singleton;
public class singleton {
    private singleton(){}
   private static singleton UniqeInstance;
    public static singleton getInstance(){
        if(UniqeInstance==null){
            UniqeInstance=new singleton();//lazy intilization create when request
        }
        return UniqeInstance;
    }
    
    
}
