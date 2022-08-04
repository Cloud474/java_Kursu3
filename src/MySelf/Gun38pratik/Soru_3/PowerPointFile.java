package MySelf.Gun38pratik.Soru_3;

public class PowerPointFile implements IReadFile{
    @Override
    public String open() {
        return "opening.ppt";
    }
    @Override
    public String read() {
        return "reading.ppt";
    }
    @Override
    public String save() {
        return "saving.ppt";
    }
    @Override
    public String close() {
        return "closing.ppt";
    }
}
