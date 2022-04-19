package isp.lab5.exercise2;

interface Playable {
    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}

class ProxyVideo implements Playable {

    private Playable video;
    private String fileName;

    public ProxyVideo(String fileName,String type){
        this.fileName = fileName;
        if(type.equals("color"))
            this.video=new ColorVideo(this.fileName);
        else 
            this.video=new BlackandWhite(this.fileName);
    }

    @Override
    public void play() {
        if(video != null)
            video.play();
        
    }
}

class BlackandWhite implements Playable {

    private String fileName;

    public BlackandWhite(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play black and white video " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}

public class Exercise2 {
    
    public static void main(String[] args){
        ProxyVideo v=new ProxyVideo("Laguna Albasta","black");
        ProxyVideo v1=new ProxyVideo("Transformers","color");
        v.play();
        v1.play();
    }
}

