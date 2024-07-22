
package singleton;

public class test {
     public static void main(String[] args) {
         singleton s1=singleton.getInstance();
         System.out.print(s1);//singleton.singleton@372f7a8d
         //as we notice in output the same address this is mean there is one object only
         singleton s2=singleton.getInstance();
          System.out.print(s2);//singleton.singleton@372f7a8d
         
     }
}
