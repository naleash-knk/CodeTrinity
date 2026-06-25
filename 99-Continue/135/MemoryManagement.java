import java.util.*;

public class MemoryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        
        int left = 0;
        int right =n-1;
        
        while(true){
            String s = sc.nextLine();
            String[] srr = s.split(" ");
            
            int c = Integer.parseInt(srr[0]);
            
            
            if(c==1 && left<right){
                    arr[left]=Integer.parseInt(srr[1]);
                    left++;
            }
            else if(c==2 && left<right){
                    arr[right]=Integer.parseInt(srr[1]);
                    right--;
            }
            else if(c==3 && left>0){
                    left--;
                    System.out.println(arr[left]);
                    arr[left]=0;
                }
            else if(c==4 && right<n-1){
                    right++;
                    System.out.println(arr[right]);
                    arr[right]=0;
                }
             else if(c==-1){
                    break;
                }
            }

            char c = 'c';

            System.out.println(Cha)
            
        
            sc.close();
        }
    }
