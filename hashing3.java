import java.util.HashMap;

public class hashing3 {
    

    public static void main(String[] args) {
        
        //count occurance of each element


        int arr[]={1,2,3,1,2,1};

    //     HashMap <Integer,Integer> hashmap=new HashMap<>();

    //     for(int val :arr)
    //     {
    //         hashmap.put(val,hashmap.getOrDefault(val,0)+1);
    //     }

    //     System.out.println(hashmap);
    // }

    int hash[]=new int[100001];

    for(int val :arr)
    {
        hash[val]++;
    }

    boolean []isVisited=new boolean[100001];

   
    for(int i=0;i<arr.length;i++)
    {
        if(isVisited[arr[i]])
        {
            continue;
        }
        System.out.print(arr[i]+" " +hash[arr[i]]);
    
        isVisited[arr[i]]=true;
        System.out.println();

    }


}
}
