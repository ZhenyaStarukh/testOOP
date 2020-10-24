package classes;

import java.util.List;

public class Folder extends Object{

    private List<File> files;
    private List<Folder> folders;

    @Override
    public void get_info() {
    }

    @Override
    public void open() {
        showComponents();
    }

    private void showComponents(){

    }
}
