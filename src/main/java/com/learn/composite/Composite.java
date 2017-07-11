package com.learn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();
    public Composite(String name){
        super(name);
    }
    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for(Component component : children){
            component.display(depth+2);
        }
    }
}
