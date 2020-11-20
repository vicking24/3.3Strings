class pigLatin {

    public static void main (String[]args){
        String a= "car";
        String b= "you are awesome";
        System.out.println (a+"-> "+p(a));
        System.out.println (b+"-> "+p(b));
    }

    public static String p (String str){
        String ans="";
        
        if (str.length()<=2) return str;
        
        while (str.indexOf(" ")>0) {
            String word= str.substring(0, str.indexOf(" "));
            if (word.length()<=2){
            ans=ans+word+" ";
            } else {
           
            ans=ans+word.substring(1)+word.charAt(0)+"ay ";
        }
            str=str.substring(str.indexOf(" ")+1);
        
        
        }
        
        ans=ans+str.substring(1)+str.charAt(0)+"ay";
        
        return ans;
    }

}
