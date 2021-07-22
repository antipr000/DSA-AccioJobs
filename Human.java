abstract class Human{
    public abstract void speakLanguage();
    public abstract void worshipGod();

    void walk(){
        System.out.println("Human is walking");
    }

    void smell(){
        System.out.println("Human is smelling");
        worshipGod();
    }
}

class Christian extends Human{
    public void speakLanguage(){
        System.out.println("Speaks in english");
    }

    public void worshipGod(){
        System.out.println("Worshipping Zesus");
    }

    void talk(){
        System.out.println("Christian is speaking in english");
    }
}

class Britisher extends Christian{
    public void speakLanguage(){
        System.out.println("Speaks in English-UK");
    }
}

class Hindu extends Human{
    public void speakLanguage(){
       System.out.println("Speaking in Hindi"); 
    }

    public void worshipGod() {
        System.out.println("Worshipping Shiva");
    }
}

class HumanImpl{
    public static void main(String[] args) {
        Christian chr = new Christian();
        // chr.smell();
        

        Christian chr2 = new Britisher();
    
        chr2.speakLanguage();

        chr2 = new Christian();

        chr2.speakLanguage();

        Hindu hi = new Hindu();
        // hi.smell();
    }
}