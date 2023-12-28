package AskedByAsif;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class intersectionofsortedarray {


    static void in(int a[],int b[]){

        ArrayList<Integer>al=new ArrayList<>();
       /* int alength=a.length;
        int blength=b.length;
        int anslength=0;
        if (alength>blength){
            anslength=blength;
            for (int i = 0; i <a.length-1 &&i<b.length; i++) {
                if (a[i]==b[i]){
//                    al.add(a[i]);


                }

            }


        }else {
            anslength=alength;

            for (int i = 0; i <blength -1&&i<a.length; i++) {
                if (b[i]==a[i]){
//                    al.add(b[i]);


                }

            }
        }
        for (int i = 0; i <anslength ; i++) {

        }





        int i=0;
        int j=0;
        while (i<a.length){

        }*/


      /*  int alength=a.length;
        int blength=b.length;
        int badalength=0;
        int chota=0;
        if (alength>blength){
            badalength=alength;
            chota=blength;


            for (int k = 0; k < badalength-1; k++) {
                System.out.println("here");
                for (int l = 0; l < chota-1; l++) {

                    if (a[k]==b[l]){
                        al.add(a[k]);
                    }

                }

            }
        }else{
            badalength=blength;
            chota=alength;

            for (int k = 0; k < badalength-1; k++) {
                System.out.println("here");
                for (int l = 0; l < chota-1; l++) {

                    if (b[k]==a[l]){
                        System.out.println(b[k]);
//                        System.out.println(a[l]);
                        al.add(b[k]);
                    }

                }

            }
        }*/


      /*  System.out.println(badalength+""+chota);
        for (int k = 0; k < badalength-1; k++) {
            System.out.println("here");
            for (int l = 0; l < chota-1; l++) {

                if (a[k]==b[l]){
                    al.add(a[k]);
                }

            }

        }*/
        System.out.println(al);

        int alength=a.length;
        int blength=b.length;
        int badalength=0;
        int chota=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        if (alength>blength){
            badalength=alength;
            chota=blength;
            for (int i = 0; i < badalength; i++) {
                if (hm.containsKey(a[i])){
                    hm.put(a[i],hm.get(a[i])+1);
                }else {
                    hm.put(a[i],1);
                }

            }
            System.out.println(hm);

            int i=0;
            for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            {
                if (hm.containsKey(a[i])){

                    System.out.println("a"+b[i]);
                    System.out.println(entry.getKey() + " " + entry.getValue());

                    al.add(b[i]);

                }
                i++;
            }

        }else {
            badalength=blength;
            chota=alength;
            for (int i = 0; i < badalength; i++) {
                if (hm.containsKey(b[i])){
                    hm.put(b[i],hm.get(b[i])+1);
                }else {
                    hm.put(b[i],1);
                }

            }
            System.out.println(hm);

            int i=0;
            for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            {
                if (hm.containsKey(a[i])){

                    System.out.println("a"+a[i]);
                    System.out.println(entry.getKey() + " " + entry.getValue());

                    al.add(a[i]);

                }
                i++;
            }




        }
        System.out.println(al);



    }


    public static void main(String[] args) {
       /* int a[]={4,9,5};
        int b[]={9,4,9,8,4};*/
        int a[]={1,1};
        int b[]={1};
        in(a,b);

    }
}
