import java.util.*;

class Stack{
    Stack next;
    int val;
    Stack(int val){
        this.val = val;
    }
}

public class StackUndo {
    
    static Stack peak = null;
    
    static void push(char val){
        if(peak==null){
            peak = new Stack(val);
            return;
        }
        Stack newEle = new Stack(val);
        newEle.next = peak;
        peak = newEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charr = str.toCharArray();
        for(int i=0;i<charr.length;i++){
            push(charr[i]);
        }
        Stack iter = peak;
        while(iter!=null){
            System.out.print((char)iter.val+"");
            iter=iter.next;
        }
        sc.close();
    }
}