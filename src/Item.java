/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Item {
    
    String name;
    int rate;
    int qnty;

    public Item(String name, int rate, int qnty) {
        this.name = name;
        this.rate = rate;
        this.qnty = qnty;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }

    @Override
    public String toString() {
       return  String.format("%-20s",name+"("+rate+"/-)").replace(' ', '.') + String.format("%6d",qnty)+String.format("%10s",rate*qnty+"/-")+"\n\n";
    }
}
