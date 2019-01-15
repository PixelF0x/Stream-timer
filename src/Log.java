public class Log {
    public static void main(String[] args){
        new Thread1("1");
        new Thread2("2");

        try{
            Thread.sleep(7500);
        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
