import java.util.*;
public class test1{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc=0,x1=0,x2=0,y1=0,y2=0,z1=0,z2=0;
        if(sc.hasNextInt()){
            tc=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<tc;i++){
            if(sc.hasNextInt()){
                x1=sc.nextInt();
            }
            if(sc.hasNextInt()){
                x2=sc.nextInt();
            }
            if(sc.hasNextInt()){
                y1=sc.nextInt();
            }
            if(sc.hasNextInt()){
                y2=sc.nextInt();
            }
            if(sc.hasNextInt()){
                z1=sc.nextInt();
            }
            if(sc.hasNextInt()){
                z2=sc.nextInt();
            }
            if(x1>x2){
            	++res;
            }else if(y1>y2){
                ++res;
            }else if(z1<z2){
                ++res;
            }
            if(res>0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
            res=0;
        }
        
     }
}