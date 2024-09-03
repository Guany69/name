public class demo {
    public static void main(String[] args) {
        System.out.print(ConsoleColors.CYAN_BOLD);
        System.out.println("test message");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        System.out.println("test2");
        System.out.print(ConsoleColors.RESET);
        System.out.println("test 3");
        System.out.println(ConsoleColors.BLUE + "first message"+ ConsoleColors.YELLOW +"second"+ConsoleColors.RESET);
        System.out.println("third message");


    }
}
