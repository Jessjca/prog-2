public class App 
{
    public static void main(String[] args) throws Exception 
    {
        AppConfig ac1 = AppConfig.getInstance();
        System.out.println(ac1);
        System.out.println();
        AppConfig ac2 = AppConfig.getInstance();
        System.out.println(ac2);
    }
}
