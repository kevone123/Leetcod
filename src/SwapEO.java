import java.math.BigInteger;

public class SwapEO {
    // Function to swap even
    // and odd bits
    static int swapBits(int x)
    {
        // Get all even bits of x
        int even_bits = x & 0xAAAAAAAA;

        // Get all odd bits of x
        int odd_bits = x & 0x55555555;

        // Right shift even bits
        even_bits >>= 1;

        // Left shift even bits
        odd_bits <<= 1;

        // Combine even and odd bits
        return (even_bits | odd_bits);
    }


    public static void isKthBitSet(int n,
                                   int k)
    {
        if ((n & (1 << (k - 1))) >= 1)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }
    public static void binrep(int n){
        String answ="";
        int byteStr[]= new int[3];
        int i=0;
        while(n>0){
            byteStr[i]=n%2;
            i++;
            n=n/2;
        }
        for(int j=0;j<byteStr.length-1;j=j+2){
            int temp=0;
            temp=byteStr[j];
            byteStr[j]=byteStr[j+1];
            byteStr[j+1]=temp;

        }
        for(int z=0;z<byteStr.length;z++)
            System.out.print(byteStr[z]);

    }

    public static int swap(int x)
    {
        // Get all even bits of x
        int even_bits = x & 0xAAAAAAAA;
        System.out.println(even_bits);

        // Get all odd bits of x
        int odd_bits = x & 0x55555555;
        System.out.println(odd_bits);

        // Right shift even bits
        even_bits >>= 1;
        System.out.println(even_bits);


        // Left shift even bits
        odd_bits <<= 1;
        System.out.println(odd_bits);

        // Combine even and odd bits
        return (even_bits | odd_bits);
    }



    // Driver program to test above function
    public static void main(String[] args)
    {
        int x = 23; // 00010111
        //binrep(x);
        System.out.println();
        swap(x);
       // System.out.println(swap(x));




    }
}
