package ArrayPractice;

public class MajorityElement {



    static int Major(int a[]){
        int key=0;
        int count=0;
        int k=0;

        key=a[k];
        for (int i = 1; i <a.length ; i++) {
            //key=a[i];
            if(a[i]==key){
                count++;
            }else {
                count--;
            }
            if(count==0){
                key=a[i];
            }

        }
        return key;
    }

    public static void main(String[] args) {
        int a[]={2,2,1,1,1,1,2};
        System.out.println(Major(a));

    }
}
