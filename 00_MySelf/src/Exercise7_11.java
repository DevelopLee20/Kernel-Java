class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;
    int pre_channel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.volume = volume;
        }else{
            this.volume = MIN_VOLUME;
        }
    }

    public int getChannel(){
        return this.channel;
    }

    public void setChannel(int channel){
        if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL){
            this.pre_channel = this.channel;
            this.channel = channel;
        }
    }

    public void gotoPrevChannel(){
        int temp = this.channel;
        this.channel = this.pre_channel;
        this.pre_channel = temp;
    }
}

public class Exercise7_11 {
    public static void main(String args[]){
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
    }
}