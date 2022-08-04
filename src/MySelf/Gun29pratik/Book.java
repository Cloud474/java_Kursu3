package MySelf.Gun29pratik;

public class Book {
    String name;
    int publishyear;
    String autor;

    public Book(){

    }
public Book(String name, int publishyear, String autor){
    this.name=name;
    this.publishyear=publishyear;
    this.autor=autor;
}
public Book(String name, int publishyear) {
        this.name=name;
        this.publishyear=publishyear;
        this.autor="";

}
public void Yazdir(){
    System.out.println(name+" "+publishyear+" "+autor);
}
public Book(String name) {
this.name=name;
this.publishyear=0;
this.autor="";

}
public String toString(){
        return name+" "+publishyear+" "+autor;
}
}
