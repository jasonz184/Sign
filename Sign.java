public class Sign
{
    String result = "";
    public Sign(String message, int width)
    {
        for(int i = 0; i < width; i++)
        {
            result += message.substring(i, i++);
        }
        
    }
}