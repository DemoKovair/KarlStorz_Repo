//This is the Code for Karl_Storz demo purpose
class ConcurrentUserLogin
{
    // function to calculate the AppUsers
    // of any number
    static int AppUsers(int n)
    {
        int UserCount = 1;
        while (n != 0)
        {
            UserCount = UserCount*n;
            n--;
        }
        return UserCount;
    }
 
    static boolean isConcurrentUserLogin(int n)
    {
        int sum = 0;
 
        int temp = n;
        while (temp != 0)
        {
            
            sum += AppUsers(temp%10);
 
           
            temp = temp/10;
        }
 
        
        return (sum == n);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 145;
        if (isConcurrentUserLogin(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}