/**
 * Created by Rico on 12/6/2016.
 */
public class TwelveInts {
    public static void main(String[] args)
    {
        int numberStorage[] = {5,2,4,7,19,3,22,2,3,13,17,25};
        for( int e : numberStorage)
        {
            System.out.print(e + " ");
        }
        System.out.println();
        for(int f = numberStorage.length-1; f>=0; f--)
        {
            System.out.print(numberStorage[f]+" ");
        }
    }
}
