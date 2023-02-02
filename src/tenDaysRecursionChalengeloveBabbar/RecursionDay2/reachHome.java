package tenDaysRecursionChalengeloveBabbar.RecursionDay2;

public class reachHome {

    static void reachhome(int src,int dest)
    {
        System.out.println("Source -> "+src+"Destination -> "+dest);

        //Base case
        if (src==dest)
        {
            System.out.println("Pahuch gaya");
            return;
        }
        //processing
        src++;

        //recursive call
        reachhome(src,dest);

    }

    public static void main(String[] args) {
        reachhome(1,10);
    }

}
