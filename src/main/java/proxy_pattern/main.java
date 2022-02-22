package proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();

        for (int i = 0;i < 5;i++){
            int a = 0;
            System.out.println(a++);

            List<String> list = new ArrayList<String>();
            list.add("a");
            list.add("b");
            list.add("c");

            System.out.println(list.get(1));

            int b = 7;
            if (b == 7){
                System.out.println("OKKK");
                continue;
            }
            System.out.println("aaaaaaaaaaa");
        }

        try{
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);

        }catch(Exception ex){
            System.out.println("NO");
        }

    }
}
