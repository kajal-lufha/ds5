
package stack;

public class Stack_queue {
    int top;
    int a[];
    int max_size = 100;
      Stack_queue(){
         a = new int[max_size];
         top = -1;
      }
       boolean isEmpty(){ 
            return (top < 0); 
       } 
      boolean push(int data){
        if(top>max_size-1){
            System.out.println("Stack overflow");
            return false;
        }
        else{
          a[++top] = data;
          return true;
        }
      }
      
      int pop(){
        if(top<0){
            System.out.println("Stack inflow");
            return 0;
        }
        else{
           int x = a[top--];
           return x;
            }  
      }
      
      public static void inqueue(Stack_queue s2,Stack_queue s1,int data){
            while(!s1.isEmpty()){
               s2.push(s1.pop());
            }
                s1.push(data);
            while(!s2.isEmpty()){
              s1.push(s2.pop());
            }
      }
      
      public static int dequeue(Stack_queue s2,Stack_queue s1){
         if(s1.isEmpty()){
             System.out.println("Queuw is empty");
             return 0;
         }
         else{
           int x = s1.pop();
           return x;
         }
      }
   public static void main(String[] x){
      Stack_queue s1 = new Stack_queue();
      Stack_queue s2 = new Stack_queue();
         inqueue(s2,s1,10);
         System.out.println(dequeue(s2,s1));
   }
}
