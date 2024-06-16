//Establish custom exception
public class BinaryFormatException extends RuntimeException
{ 
    public BinaryFormatException() 
    {
        super("Not a binary number");
    }
}
    
class Main
{
    //convert binary number to decimal number
    public static int bin2Dec(String binaryString)
    {
        try {return(Integer.parseInt(binaryString, 2));}
        catch(NumberFormatException error) {throw new BinaryFormatException();}
    }

    //Main body program
    public static void main(String []args)
    {
        //make a binary string equal to 120 for easy testing
        String binString = "1111000";
        
        //test normal conversion
        System.out.println(binString + "-->" + bin2Dec(binString));

        //change binString to something that'll cause an error
        binString = "1111002";
        
        //test again with the bad string
        System.out.println(binString + "-->" + bin2Dec(binString));

    }
};
