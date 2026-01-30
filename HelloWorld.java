public class HelloWorld{

    public static void main(String[] args){
        System.out.println("Hello World! You're awesome!!!");

        System.out.println("Args:");
        for(int i = 0; i < args.length; i++){
            System.out.print(i);
            System.out.print(": ");
            System.out.println(args[i]);
        }
    }

}