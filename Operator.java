public class Operator {
    public static void main(String[]args){
        //Operators in java --->
            //Arithmetic Operator ---> +,-,*,/,%,+=,-=,*=
        int a=10;
        int b=4;
        int c=a+b;  //14
        int d=a-b;  //6
        int e=a*b;  //40
        int f=a/b;  //2
        int g=a%b;  //2
        System.out.println("Arithmetic Operator:"+c+","+d+","+e+","+f+","+g);
            // Operator ---> +,-,*,/,%,+=,-=,*=
        int h=5;
         h +=10; //15
        int i=6; 
         i-=4;  //2
        int j=7; 
         j*=6;  //42
       
        System.out.println("Arithmetic Operator:"+h+","+i+","+j);
        //Pre increment and post increment/decrement--->

        int k=7;
        int l=k++; //postfix increment
        System.out.println("Increment/Decrement:"+k+","+l);
        int m=++k; //prefix increment
        System.out.println("Increment/Decrement:"+k+","+m);

    //Relational Operator  ---> ==,!=,<,>,<=,>= 
    int n=5;
    int o=5;
    System.out.println(n==o);  //true
    System.out.println(n!=o);  //false

    //Bitwise Operators ---> &,|,^,~,>>,<<,>>>,&=,|=,^=,>>=,<<=,>>>= work on bits
    int p=2; // 10 ---> 00000000 00000000 00000000 00000010
    int q=3; // 11 ---> 00000000 00000000 00000000 00000011
    int r=p&q;
    int y_u=p|q;
    int u_y=p^q;
    int u__y=~p;
    System.out.println("Bitwise Operator : ---> AND(&)-> "+r+", " +"OR(|)-> "+y_u+", "+"Exclusive OR(^)-> "+u_y+", "+"NOT(~)-> "+u__y);
            //left shift <<  ----> means -> multiply by 2
            int v=1;
            v<<=32;
        System.out.println("Left Shift of 1 : "+v);
             //Right shift >>  ----> means -> divided by 2
            int w=8;
            w>>=4;
        System.out.println("Right Shift of 8 : "+w);
            //Shift Right with Zero ----> means -> change msb(most significent bit) 1 to 0  
             byte u=-128;
            u>>>=1;
        System.out.println("Right Shift with zero of 8 : "+u);
    //Logical Operator ---> &&,|| work on expresion 
        // AND(&&) --->
        int log=488;
        int log1=500;
        boolean result=(log>=400&&log1>=500);
        System.out.println("Logical AND(&&)---> "+result);
        // AND(||) --->
        int log_or=488;
        int log_or1=500;
        boolean result1=(log_or<=400||log_or1<=500);
        System.out.println("Logical OR(||)---> "+result1);
    //Assignment Operator ---> = Assign the value right to left 
        int assign=76;
        System.out.println("Assignment Operator : "+assign);
    }
    
}
