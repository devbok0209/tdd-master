package com.forest;

import com.trees.Tree;
import com.trees.TreeFactory;
import com.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType treeType = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

}
