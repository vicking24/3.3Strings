class palindrome{
    public static void main (String[]args){

        String a=("racecar");
        String b=("fggf");
        String c=("fgfg");
        String d=("r ....aceca.r");
        String e=("A man, a plan, a canal: Panama.");
        System.out.println (p(a));
        System.out.println (p(b));
        System.out.println (p(c));
        System.out.println (p(d));
        System.out.println (p(e));

    }

    public static boolean p(String str){
        int f=0;
        int b=0;
        str=str.toLowerCase();
        for (int i=0; i<str.length()/2; i++){
            while (!Character.isLetter(str.charAt(i+f))){
                f++;
                //System.out.print("a");
            }

            while (!Character.isLetter(str.charAt(str.length()-1-i-b))) {
                b++;
                //System.out.print("b");
            } 
            //or you can create a new string that takes non character out
            //instead of b and f
            if (str.charAt(i+f)!=str.charAt(str.length()-1-i-b)){
                return false;

            }
        }
        return true;

    }

}