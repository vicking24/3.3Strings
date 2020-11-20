import java.util.Scanner;

class PPAP{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print ("Your first object: ");
        String o1= sc.next();
        System.out.print ("Your second object: ");
        String o2= sc.next();
        
        System.out.print ("Your third object: ");
        String o3= sc.next();
        System.out.print ("Your fourth object: ");
        String o4= sc.next();
        
        System.out.println ("");
        System.out.println ("I have a "+o1+", I have a "+o2);
        System.out.print ("Uh! " +o2+" "+o1);

        System.out.println ("");
        System.out.println ("I have a "+o3+", I have a "+o4);
        System.out.print ("Uh! " +o4+" "+o3);
        
    }

}