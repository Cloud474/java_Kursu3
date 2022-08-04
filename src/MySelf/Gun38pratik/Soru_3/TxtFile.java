package MySelf.Gun38pratik.Soru_3;

public class TxtFile implements IReadFile{
    @Override
    public String open() {
        return "opening.text";
    }
    @Override
    public String read() {
        return "reading.text";
    }
    @Override
    public String save() {
        return "saving.text";
    }
    @Override
    public String close() {
        return "closing.text";
    }
}
