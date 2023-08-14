public class AppConfig
{
    /*
    Suponha que você tenha um aplicativo que requer várias configurações, como URLs de serviços, chaves de API ou outras preferências. 
    Essas configurações precisam ser CARREGADAS e MANTIDAS consistentes em todo o aplicativo.
    */

    private static AppConfig instance = null;
    private String apiUrl;
    private String apiKey;

    private AppConfig(String apiUrl, String apiKey)
    {
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
    }


    public static AppConfig getInstance()
    {
        if(instance == null) //não houve instanciação ainda
        {
            instance = new AppConfig("API_URL.COM", "API_KEY00412363");
        }
        return instance;
    }

    public String getApiUrl()
    {
        return this.apiUrl;
    }

    public String getApiKey()
    {
        return this.apiKey;
    }


    @Override
    public String toString()
    {
        return "URL da API > " + getApiUrl() + "\nCHAVE da API > " + getApiKey();
    }
}