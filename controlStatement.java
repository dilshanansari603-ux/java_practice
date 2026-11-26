public class controlStatement {
    public static void main(String[] args) {
        //Selection Statement ---> if,if-else,switch
        //Normal if ->
        int age=18;
        if(age>=18){
            System.out.println("Eligible for vote!");
       
        
          }else{ 
            System.out.println("Your are not eligible for vote!");
        }
        //Nested if ->
        int a=20;
        int b=10;
        if(a>b){
            if(b>a){
                System.out.println("Number:"+b);
            }else{
                System.out.println("Number is not sure! ");
        
        }    }else{System.out.println("Number is less then a:"+b);
    
    }
    //if-else-if ladder
    int i=10;
    if(i==5){
        System.out.println("Execute first ");
    }else if(i==6){
        System.out.println("Execute second");
    }else if(i==7){
        System.out.println("Execute third");
    }else if(i==0){
        System.out.println("Execute fourth");
    }else{
        System.out.println("Number not found!");
    }
}
    }





    
    

