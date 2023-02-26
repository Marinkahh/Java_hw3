package Seminar3.hw.task1;

import Seminar3.hw.task1.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Хлеб высший сорт", 60, 1);
        Item item2 = new Item("Багет высший сорт", 45,  1 );
        Item item3 = new Item("Ржаной",  60 , 2 );
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);
        String searchName = "высший";
        Integer minPrice = 0 ;
        List<Integer> price = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).getName().contains(searchName) && itemList.get(i).getSort()<3){
                price.add(itemList.get(i).getPrice());
            }
        }
        System.out.println(Collections.max(price));
    }

}
