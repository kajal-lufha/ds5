
package stack;

public class queue {
      int a[];
      int top = -1;
      int bottom = 0;
      queue(int size){
         a = new int[size];
      }
    
      void push(int data,int size){
         if(top>size-1){
             System.out.println("Overflow");
             return;
         }
         else{
          a[++top] = data;
          return;
         }
      }
      
      void pop(){
        if(top<0){
            System.out.println("InFlow");
            return;
        }
        else{
            System.out.print(a[bottom]+" ");
            bottom++;
            return;
        }
      }
    
    public static void main(String[] x){
       queue q = new queue(5);
       q.push(0, 5);
       q.push(1, 5);
       q.push(2, 5);
       q.push(3, 5);
       q.push(4, 5);
       
       for(int i = 0;i<5;i++){
           q.pop();
         }
    }
}
