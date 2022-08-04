package MySelf.Gun29pratik.Soru2;

public class Student {
    String name;
    String surName;
    int clasroom;
    public Student(){
    }
    public Student( String name, String surName, int clasroom){
        this.name=name;
        this.surName=surName;
        this.clasroom=clasroom;
    }
    public Student( String name, String surName){
        this.name=name;
        this.surName=surName;
        this.clasroom=0;

    }
    public String toString(){

        return name+" "+surName+" "+clasroom;
    }
}
