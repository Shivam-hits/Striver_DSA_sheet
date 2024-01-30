import java.util.*;
class array_is_sorted {
    public boolean check(int[] nums) {
        Scanner sc = new Scanner(System.in);
        int n=nums.length;
        int x=-1;
        boolean flag=false;int t;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flag=false;
                x=i+1;
                break;
            }
        }
        if(flag==true)
            return true;
        else
        {
                
                for(int k=0;k<n-1;k++)
                {
                    if(nums[k]<nums[k+1])
                    {
                        flag=true;
                    }
                }
                if(flag==true)
                    return true; 
                else
                    return false;
            }
            if(flag==true)
                return true; 
            else
                return false;


         //-------------------------------------------------
            // for(int i = 0; i < x; i++)
            // {
            //     if(nums[i] > nums[i+1]){
            //         return false;
            //     }
            // }
            // if(nums[nums.length-1] <= nums[0])   
            //     return true;
            // else
            //     return false;
            
        }
    }
}