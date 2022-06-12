package com.trees;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public void draw(Graphics graphics) {
        treeType.draw(graphics, x, y);
    }
}
