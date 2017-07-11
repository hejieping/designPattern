package com.learn.composite;

/**
 * Created by jieping.hjp on 2017/7/11.
 */
public class CompositeMain {
    public static void main(String[] args){
        Composite composite = new Composite("composite x");
        composite.add(new Leaf("leaf xa"));
        composite.add(new Leaf("leaf xb"));
        Component root = new Composite("root");
        root.add(new Leaf("leaf a"));
        root.add(new Leaf("leaf b"));

        root.add(composite);

        Composite component2 = new Composite("composite xx");
        component2.add(new Leaf("leaf xxa"));
        component2.add(new Leaf("leaf xxb"));
        composite.add(component2);

        root.add(new Leaf("leaf c"));
        Leaf leaf = new Leaf("leaf d");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
