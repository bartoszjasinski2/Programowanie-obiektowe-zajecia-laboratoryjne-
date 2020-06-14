public class AgeName {
    private final long id;
    private final int age;
    private final String imie;
    public AgeName(long id, int age, String imie){
        this.id = id;
        this.age = age;
        this.imie = imie;
    }
    public long getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getImie(){
        return imie;
    }
}

