import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhinnag on 5/19/2015.
 */
public class PandaXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the number of the elements in an Array.");
        int T = Integer.parseInt(bfr.readLine());
        //System.out.print("Number of elements in the array is : " + T);
        //System.out.print("The number of elements in the array is : ");
        String[] data = bfr.readLine().split(" ");
        //for(int i =0;i<data.length;i++)
        //{
        //    System.out.println("The Value of element at index " + i + " is " + data[i]);
        //}

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int hm_size = T*T;
        int k = 0;
        while (k<hm_size)
        {
            for(int i = 0;i<data.length;i++)
            {
                for(int j =0;j<data.length;j++)
                {
                    hm.put(k,(Integer.parseInt(data[i]))^(Integer.parseInt(data[j])));
                    k++;
                }
            }
        }

        int max = 0 ;
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer key=entry.getKey();
            if(key > max)
            {
                max = key;
            }
            else
                continue;
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer key=entry.getKey();
            if(key == max)
            {
                count++;
            }
            else
                continue;
        }
        System.out.println(count + 2);
    }
}
