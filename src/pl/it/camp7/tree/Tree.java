package pl.it.camp7.tree;

import com.sun.jdi.Value;
import com.sun.source.tree.BinaryTree;

public class Tree {

    private static Node root = null;


    public void add(int Value) {
        if (this.root == null) {
            this.root = new Node();
            this.root.setValue(Value);
        } else {
            addNewValue(Value, this.root);
        }
    }

    public boolean contains(int value) {
        return containsValue();
    }

    public int maximum() {
        return maxValue(this.root);
    }

    public int minimum() {
        return minValue(this.root);
    }


    public void addNewValue(int value, Node node) {
        if (node.getRightNode() == value) {
            return value;
        }
        if (node.getValue() < value) {
            if (node.getRightNode() == null) ;
            node.setRightNode(new Node());
            node.getRightNode().setValue(value);
        } else {
            addNewValue(value, node.getRightNode());
        } else{
            (node.getLeftNode() == null) {
                node.setLeftNode(new Node());
                node.getLeftNode().setValue(value);
            } else{
                addNewValue(value, node.getLeftNode());
            }
        }
    }

    priviat int minValue(Node node) {
        if (node.getLeftNode() == null) {
            return node.getValue();
        } else {
            return minValue(node.getLeftNode());
        }
    }

    priviat int maxValue(Node node) {
        if (node.getRightNode() == null) {
            return node.getValue();
        } else {
            return minValue(node.getRightNode());
        }
    }
    private boolean containsValue(int value, Node node) {
        if (node == null) {
            return false;
        } if (value == node.getValue()) {
            return containsValue(value, node.getRightNode());
        } else {
            return containsValue(value, node.getLeftNode());
        }
    }
}