
package stack;

public class Stack {
    int top;
    int a[];
      Stack(int size){
         a = new int[size];
         top = -1;
      }
      
      void push(int data,int size){
        if(top>size-1){
            System.out.println("Stack overflow");
            return;
        }
        else{
          a[++top] = data;
          return;
        }
      }
      
      void pop(){
        if(top<0){
            System.out.println("Stack inflow");
            return;
        }
        else{
            System.out.println(a[top]+" ");
            top--;
            }  
      }
    public static void main(String[] args) {
        Stack s = new Stack(5);
         for(int i = 0;i<5;i++){
           s.push(i*10, 5);
         }
          for(int i = 0;i<5;i++){
           s.pop();
         }
    }
    
}
