public class MoreThanOneCharacterDemo {
    public static void main(String[] args)
    {
        String x="Hello World.Computer Science is Amazing!";
        char target[]=new char[15];
        target[0]='I';
        target[1]='O';
        x.getChars(0,10,target,2);
        System.out.println(target);
    }
    
}
