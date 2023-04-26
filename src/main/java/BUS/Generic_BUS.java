package BUS;

import DAO.Generic_Implement;

import java.util.ArrayList;
import java.util.List;

public class Generic_BUS {

    private static ArrayList list;
    public static<Thing> ArrayList<Thing> getAll(Class<Thing> instance){
        list=new ArrayList();
        List<Thing> tempList= Generic_Implement.getAll(instance);
        tempList.forEach(e->{
            list.add(e);
        });
        return list;
    }
    public static ArrayList getList() {
        return list;
    }
}
