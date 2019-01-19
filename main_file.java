package java_oop_multimethods;

//definition main_file .class with same filename
public class main_file
{
    public static void main(String[] args)
    {
        //definition main_file msg .String
        String msg;

        //definition content in msg .String
        msg="this is msg .String from main_file .class";

        //main_file msg .string output
        System.out.println(msg);

        //request from data .class -> greeting .method
        data.greeting();

        //request from draw .class -> line .method
        draw.line();
    }
}