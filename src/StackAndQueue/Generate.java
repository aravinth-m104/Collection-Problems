package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Generate {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int n=10;
        queue.add("1");
        for (int i = 0; i <n; i++) {
            String num = queue.remove();
            //System.out.println(queue);
            System.out.println(num);
            queue.add(num+"0");
            queue.add(num+"1");
        }
    }
}
