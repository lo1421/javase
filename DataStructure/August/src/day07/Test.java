package day07;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public void  generate(int numRows){
        List<List<Integer>> ret =new  ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ret.add(list);
        for (int i=0;i<numRows;i++){
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for (int j = 1;j<i;j++){

            }
        }
    }
}
