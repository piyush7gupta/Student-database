/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;

/**
 *
 * @author piyush
 */
public class LinkedList<T> implements LinkedList_<T> {
    class listiter implements Iterator<Position_<T>>{
        Node<T> instart;
        listiter(Node<T> s){
        instart=s;
        }
        @Override
        public boolean hasNext() {
         if(instart==null)
             return false;
        return true;
        }

        @Override
        public Position_<T> next() {
        Node<T> instart2=instart;
        instart=instart.next;
        return instart2;
        }
    
    }
    class listiter2 implements Iterator<T>{
        Node<T> instart;
        listiter2(Node<T> s){
        instart=s;
        }
        @Override
        public boolean hasNext() {
         if(instart==null)
             return false;
        return true;
        }
        
        @Override
        public T next() {
        Node<T> instart2=instart;
        instart=instart.next;
        return instart2.val;
        }
    
    }
    Node<T> start;
    Node<T> last;
    int countval=0;
    @Override
    public Node<T> add(T e) {
        if(start==null){
        start=new Node<T>(e);
        last=start;
        countval++;
        }
        else{
        Node<T> n=new Node<T>(e);
        last.next=n;
        last=n;
        countval++;
        }
        return last;
    }

    @Override
    public Iterator<Position_<T>> positions() {
        listiter n=new listiter(start);
        return n;
    }
    public Iterator<T> positions2(){
    listiter2 n=new listiter2(start);
    return n;
    }
    @Override
    public int count() {
    return countval;
    }
    
    
}
