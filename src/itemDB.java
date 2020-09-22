
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class itemDB {
    private ArrayList<Item> itemList = new ArrayList<Item>();
    itemDB()
            {
               
                itemList.add(new Item("Anjir",45,0));
                itemList.add(new Item("ButterScotch",30,0));
                itemList.add(new Item("Chocolate",35,0));
                itemList.add(new Item("Gulkand",35,0));
                itemList.add(new Item("Mango",35,0));
                itemList.add(new Item("Pineapple",35,0));
                itemList.add(new Item("Sitafal",50,0));
                itemList.add(new Item("Strawberry",35,0));
                itemList.add(new Item("Vanilla",30,0));
            }
    ArrayList<Item>getItemList()
    {
        return this.itemList;
    }
    Item getItem(int index)
    {
        return this.itemList.get(index);
    }
    void  setItem(int index, Item item)
    {
        this.itemList.set(index,item);
    }
    void addItem(Item item)
    {
        this.itemList.add(item);
    }
    void removeItem(int index )
    {
        this.itemList.remove(index);
    }
    int search(String target)
    {
            for(int i=0;i<this.itemList.size();i++)
            {
                if(this.itemList.get(i).getName().equals(target))
                    return i;       //found
            }
            return -1;      // not found
    }
    void clearItems()
    {
        this.itemList.clear();
    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < itemList.size(); i++) {
            s=s+itemList.get(i)+"\n";
        }
        return s;
    }
}
