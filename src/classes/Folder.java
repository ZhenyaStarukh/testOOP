package classes;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Object{

    private List<File> files = new ArrayList<>();
    private List<Folder> folders = new ArrayList<>();

    @Override
    public void get_info() {
    }

    @Override
    public void open() {
        showComponents();
    }

    public void showComponents(){

    }

    public void makeNew(){

    }

}
