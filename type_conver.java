//type conversation in java 
public class type_conver {
    public static void main(String[] args) {
        //Implicit(widening conversion) ---> change data type to another data type automatically by java compiler is called implicit. 
            // Rule -> Destination data type should be wider then source data type .
        byte by=30;
        int in=by;
        System.out.println("Implicit(Widening Conversion) : "+in);
        //Explicit(Narrowing Conversion) ---> change data type to another data type  by user if required to change is called explicit.
        int exp=300; // here data terncate 
        byte byt;
        byt=(byte)exp;
        System.out.println("Explicit(Narrowing Conversion) : "+byt);

        
    }
    
}
