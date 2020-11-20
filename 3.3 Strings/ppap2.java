class ppap2{
    public static void main(String[]args){
        ppap("I have a pen, I have a apple");
        ppap("I have a ball, I have a golf");        

    }

    public static void ppap (String str){
        int c= str.indexOf(",");
        int s=str.lastIndexOf(" ");
        String ob1=str.substring(9, c);
        String ob2=str.substring(s+1);
        ob2=ob2.substring(0,1).toUpperCase()+ob2.substring(1);
        
        System.out.println("Uh! "+ob2+" "+ob1);
        
        
      

    }


}