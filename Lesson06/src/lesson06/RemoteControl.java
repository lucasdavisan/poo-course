package lesson06;
public class RemoteControl implements Controller {
    private int volume;
    private boolean on;
    private boolean playing;
    
    public RemoteControl() {
        this.setVolume(50);
        this.setOn(true);
        this.setPlaying(false);
    }
    
    private int getVolume() {
        return this.volume;
    }
    
    private void setVolume(int v) {
        this.volume = v;
    }
    
    private boolean getOn() {
        return this.on;
    }
    
    private void setOn(boolean o) {
        this.on = o;
    }
    
    private boolean getPlaying() {
        return this.playing;
    }
    
    private void setPlaying(boolean p) {
        this.playing = p;
    }

    // Abstract Methods
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        if(this.getOn()) {
            System.out.println("Está ligado? " + this.getOn());
            System.out.println("Está tocando? " + this.getPlaying());
            System.out.print("Volume: " + this.getVolume() + " ");
            for(int i = 0; i < this.getVolume(); i+=10) {
                System.out.print("|");
            }
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void moreVolume() {
        if(this.getOn()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume!");
        }
    }

    @Override
    public void lessVolume() {
        if(this.getOn()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume!");
        }
    }

    @Override
    public void mute() {
        if(this.getOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void unmute() {
        if(this.getOn() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getOn() && !(this.getPlaying())) {
            this.setPlaying(true);
        } else {
            System.out.println("ERRO! Não foi possível reproduzir!");
        }
    }

    @Override
    public void pause() {
        if(this.getOn() && this.getPlaying()) {
            this.setPlaying(false);
        } else {
            System.out.println("ERRO! Não foi possível pausar!");
        }
    }
}
