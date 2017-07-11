package com.learn.composite;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class Leaf extends Component {
    public Leaf(String name){
        super(name);
    }
    @Override
    public void remove(Component c) {
        System.out.print("cannot add to a leaf");
    }

    @Override
    public void add(Component c) {
        System.out.print("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<depth;i++)
        {
            stringBuilder.append("-");
        }
        stringBuilder.append(name);
        System.out.println(stringBuilder.toString());
    }
}
