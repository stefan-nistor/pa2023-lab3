package org.example;

import org.example.models.Node;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Network {
    private List<Node> nodes= new LinkedList<>();


    public void addNode(Node node){
        nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }

    public List<Node> order(){
        return nodes.stream()
                .sorted(Comparator.comparing(Node::getImportance).reversed())
                .collect(Collectors.toList());
    }

}
