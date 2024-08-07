package SearchingAndSorting.LinearSearch;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name = "Paresh";
        char target = 't';
        System.out.println(search2(name,target));
    }


    static boolean search2(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }

       for(char ch: str.toCharArray())
       {
           if (ch==target)
           {
               return true;
           }
       }
       return false;
    }

    static  boolean searchString(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;

    }
}
