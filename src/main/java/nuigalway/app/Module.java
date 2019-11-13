package nuigalway.app;

/**
 * Author: Aaron McCormack
 * ID: 16492186
 */

import java.util.ArrayList;

public class Module {

    //instance variable
    private String modName;
    private int id;
    private ArrayList listStudent;

    public Module(String name, int id, ArrayList listStudent){
        this.modName = name;
        this.id = id;
        this.listStudent = listStudent;
    }

    //Getters and Setters
    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }
}
