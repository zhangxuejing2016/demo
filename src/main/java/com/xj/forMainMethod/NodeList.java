package com.xj.forMainMethod;

/**
 * Created by Administrator on 2018/10/12.
 */
public class NodeList {
    static class Node{
        private Integer data;
        private Node next;

        public Node(Integer data) {
            this.data = data;
        }

        public Node() {
        }
    }
    static Node readyNode() {
        Node linkNode_1 = new Node(1);
        Node linkNode_2 = new Node(2);
        Node linkNode_3 = new Node(3);
        Node linkNode_4 = new Node(4);
        Node linkNode_5 = new Node(5);
        Node linkNode_6 = new Node(6);
        Node linkNode_7 = new Node(7);
        Node linkNode_8 = new Node(8);
        linkNode_1.next = linkNode_2;
        linkNode_2.next = linkNode_3;
        linkNode_3.next = linkNode_4;
        linkNode_4.next = linkNode_5;
        linkNode_5.next = linkNode_6;
        linkNode_6.next = linkNode_7;
        linkNode_7.next = linkNode_8;
        return linkNode_1;
    }

    public static Node reverseNodeList (Node currentNode){
        if(currentNode == null || currentNode.next == null){
            return currentNode;
        }
        Node node = reverseNodeList(currentNode.next);
        currentNode.next.next = currentNode;
        currentNode.next = null;
        return node;
    }

    public static void main(String[] args) {
        Node reverse = reverseNodeList(readyNode());
        System.out.println(reverse);
    }
}
