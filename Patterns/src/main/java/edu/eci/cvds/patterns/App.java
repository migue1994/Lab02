package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length == 0)
        {
            System.out.println( "Hello World!" );
        }
        else
        {
            String name = "";
            for(String a: args)
            {
                name +=  " "+a;
            }
            System.out.println( "Hello "+name+"!");
        }
    }
}
