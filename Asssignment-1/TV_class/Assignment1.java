package assignment1;
public class Assignment1 {
    public static void main(String[] args) {
        TV_class tv = new TV_class();
        tv.turnOn();
        tv.setChannel(12);
        tv.setVolume(4);
        System.out.println("TV channel is "+tv.channel+" and volume level is "+tv.volumelevel);
        tv.volumeDown();
        tv.channelDown();
        System.out.println("TV channel is "+tv.channel+" and volume level is "+tv.volumelevel);
    }
    
}
