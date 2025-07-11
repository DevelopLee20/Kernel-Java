class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    MyTv(){
        this.isPowerOn = false;
        this.channel = 1;
        this.volume = 0;
    }

    void turnOnOff(){
        this.isPowerOn = !this.isPowerOn;
    }

    void volumeUp(){
        this.volume = this.volume < MAX_VOLUME ? this.volume + 1 : this.volume;
    }

    void volumeDown(){
        this.volume = this.volume > MIN_VOLUME ? this.volume - 1 : this.volume;
    }

    void channelUp(){
        this.channel = ++this.channel != MAX_CHANNEL + 1 ? this.channel : MIN_CHANNEL;
    }

    void channelDown(){
        this.channel = --this.channel != MIN_CHANNEL - 1 ? this.channel : MAX_CHANNEL;
    }
}

class Exercuse6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:" + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:" + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:" + t.volume);
    }
}