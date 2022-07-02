package BitManipulation2;

public class twononrepeatingelement {
    static int[] twoNonrepeating(int a[])
    {
        int xor = 0;

        for(int e: a) {
            xor = xor ^ e;
        }

//		2, 1, 4, 1, 2, 3, 4, 7
//		xor = 3^7 = 4 (100)
//		mask = 4 (100)

        int temp = xor;
        int mask = xor & (~(xor-1));

        for(int e: a) {
            if((mask & e) == 0) {
                temp = temp ^ e;
            }
        }

        int firstNumber = temp;
        int secondNumber = xor ^ firstNumber;

        int res[] = new int[2];
        res[0] = firstNumber;
        res[1] = secondNumber;

        return res;

    }

    public static void main(String[] args) {
        int a[]={1,2,1,2,3,4,4,7};
        int res[]=twoNonrepeating(a);


		for(int e: res) {
		System.out.println(e);
		}

    }
}
