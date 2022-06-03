package javaBasicDay2;

public class sumofvaluesofarray {
    public static void main(String[] args)
    {
        int array[]={23,4,5,34};
        int sumOfArray=0;
        for (int i=0;i<array.length;i++)
        {
            sumOfArray+=array[i];
        }
        System.out.println(sumOfArray);
    }
}
