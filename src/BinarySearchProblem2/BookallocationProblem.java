package BinarySearchProblem2;

public class BookallocationProblem {
    static boolean isSafe(int a[],int k,int pages)
    {
        //maine student ko 1 se intialize kar diye
        int student=1;
        // aur student ko pahli book de di ,ki le bhai tereko ek toh padhni hi hai
        int curr=a[0];
        for (int i = 1; i < a.length; i++) {
            //agr kis bhi book ke no of pages hai wo mere maximum allocated pages se jada aa rahe hai
            //toh is matlab ye bahut kam pages hogaye toh return kar doo false
            if (a[i]>pages) return false;
            //agr current book ka pagecount  kam hoga total pages se toh isko current count ke andar add kar duga
            //
            curr+=a[i];
            // aur phir check karunga agr ye add karne ke baad jada aa raha hai toh student ko add karo

            if (curr>pages)
            {
                student++;
                curr=a[i];
            }

        }
        return student<=k;
    }


    static int allocateBooks(int a[],int k)
    {
        if (a.length<k) return -1;
        int l=0;
        int r=0;
       int ans=-1;
        for (int e:a
             ) {
            r+=e;

        }
        while (l<=r)
        {
            int mid=l+(r-l)/2;
            if (isSafe(a,k,mid))
            {
               ans=mid;
                r=mid-1;
            }
            else {
                l=mid+1;
            }

        }
        return ans;
        //return l;

    }

    public static void main(String[] args) {
        int a[]={4,9,3,6,5,2};
        int k=3;
        System.out.println(allocateBooks(a,k));
    }
}
