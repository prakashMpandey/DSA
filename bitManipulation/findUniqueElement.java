package bitManipulation;

public class findUniqueElement {
    public static void main(String[] args) {
        
        int []nums={1,2,1,2,3,4,5,5,4};

        int el=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            System.out.println("current element:"+el);
            el=el^nums[i];
        }

        System.out.println(el);
    }
}
