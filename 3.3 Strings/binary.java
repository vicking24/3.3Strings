class binary {

    public static void main (String[]args){
        convert (10); //1010
        convert (398); //110001110

    }

    public static void convert (int num){
        String ans="";
        for (int i=10; i>=0; i--){
            if (num<Math.pow(2,i)){
                ans=ans+"0";
        
            } else {
            
                if (num/Math.pow(2,i)>=0){
                ans=ans+"1";
                num=num-(int)(Math.pow(2,i));
                
                
                }
            
            
            
            }
            
           

        }
        System.out.println (ans);

    }

}