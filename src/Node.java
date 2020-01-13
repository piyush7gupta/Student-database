/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyush
 */
public class Node<T> implements Position_<T> {
    T val;
    public Node<T> next=null;
    Node(T e){
    val=e;
    }
    @Override
    public T value() {
        return val;
    }

    @Override
    public Position_<T> after() {
    return next;
    }

    
    
}
