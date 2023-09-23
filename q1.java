import java.util.*;
class Box
{
    int length;
    int width;
    int height;
    int volume(int l,int w,int h)
    {
        int c=l*w*h;
        return c;
    }
}
public class extends Box
{
    void print()
    {
        System.out.println("volume"+" "+(l*w*h));
    }
}