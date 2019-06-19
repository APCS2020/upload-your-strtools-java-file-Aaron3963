public class StrTools{
    /*public 可以在cilent program 里调用
    static 静态方法，可以用classname.methodname()调用
    boolean 判断 return type(Ture||False)
    */
    public static String ChangeFirstChar(String str){
        // String remain = str.substring(1);
        // String first = str.substring(0,1);
        // return first.toUpperCase()+remain;
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }

    public static String addPeriod(String str){
        return str+ ".";
    }
    public static String ReplaceChar(String target, String replace, String str ){
        return str.substring(0,str.indexOf(target))+replace+str.substring(str.indexOf(target)+target.length());
    }

    public static String SeperateCharWithSpace(String str){
        int index = 0;
        String tmp = "";
        while(index < str.length()-1){
            tmp += str.substring(index,index+1);
            tmp += ", ";
            index ++;
        }
        return tmp + str.substring(str.length()-1)+".";
    }

    public static String ReverString(String str){
        int index = str.length()-1;
        String tmp = "";
        while(index >= 0){
        //for(int index = str.length()-1;index>=0;index --){    
            tmp += str.substring(index,index+1);
            index --;
        }
        return tmp;
    }
        // int index = str.length();
        // while (index > 0){
        //     tmp += str.substring(index-1,index);
        //}
        //因为length()会出现下标+1，所以index 容易越界。
        //因为substring可以在末尾越界，因此在这里substring(index-1,index)OK
        

    public static String palindrome(String str) {
        return str+ReverString(str);
    }

    public static String palindromeHalfStr(String str){
        int length = str.length();
        int index = 0 ; 

        if(length % 2 == 0)
            //index = length/2-1;
            index = length/2;
        else if(length % 2 == 1)
            index = (length+1)/2;

        return str.substring(0,index)+ReverString(str.substring(0,index));
    }

    public static boolean checkPalindrome(String str){
        return((str.length() % 2 == 0 && str.substring(0,str.length()/2).compareTo(ReverString(str.substring(str.length()/2)))==0)||
              (str.length()%2==1 && str.substring(0,str.length()/2).compareTo(ReverString(str.substring(str.length()/2+1)))==0)); 
        }
        //============Best Method======================
        // String frontPart = str.substring(0,str.length()/2);
        // String backPart = "";
        
        // if(str.length()%2 == 0)
        //     backPart = str.substring(str.length()/2 , str.length());
        // else
        //     backPart = str.substring(str.length()/2+1);

        // return ReverString(backPart).equals(frontPart);
        //}
        
        //==============Method 3=================
            // int length = str.length();
        // String frontPart = str.substring(0,length()/2);
            //int check = frontPart.compareTo(ReverString(str.substring(length/2)));
            
        //     if (check == 0)
        //         return true;
        //     else
        //         return false;   
        // }

        // else{
        //     int check = frontPart.compareTo(ReverString(str.substring(length/2+1)));
        //     if(check == 0)
        //         return true;
        //     else
        //         return false;
        // }
    //}   

    
    public static void main(String[] args){
        // String str = "the dog is cute.";
        // String changed = ChangeFirstChar(str);
        // String replace = ReplaceChar("dog","cat",str);
        // System.out.println(changed);=
        // System.out.println(replace);
        String str = "ABCDqDCBA";
        String seperate = SeperateCharWithSpace(str);
        String reverse = ReverString(str);
        String palindrome = palindromeHalfStr(str);
        boolean checkP = checkPalindrome(str);
        System.out.println(checkP);
    }
}
