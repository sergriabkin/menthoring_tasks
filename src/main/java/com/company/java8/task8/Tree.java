package com.company.java8.task8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

class Tree {
    private int value;
    private List<Tree> children = new LinkedList<>();

    public Tree(int value, List<Tree> children) {
        super();
        this.value = value;
        this.children.addAll(children);
    }

    public Tree(int value, Tree... children) {
        this(value, asList(children));
    }

    public int getValue() {
        return value;
    }

    public List<Tree> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public Stream<Tree> flattened() {
        return getSelfWithChildren(this);
    }

    private Stream<Tree> getSelfWithChildren(Tree tree) {
        Stream<Tree> treeStream = Stream.of(tree);
        if (tree.getChildren().isEmpty()){
            return treeStream;
        }
        return Stream.concat(treeStream, getChildrenRecursive(tree));
    }

    private Stream<Tree> getChildrenRecursive(Tree tree) {
        return tree.getChildren().stream().flatMap(this::getSelfWithChildren);
    }
}
