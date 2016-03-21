package io.github.priom;

public class Link {
    public String bookName;
    public int millionsSold;
    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display() {
        System.out.println (bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }

    public static void main(String[] args) {
        LinkList theLinkedList = new LinkList ();

        theLinkedList.insertFirstLink ("Don Jon", 500);
        theLinkedList.insertFirstLink ("A B", 600);
        theLinkedList.insertFirstLink ("C D", 700);
        theLinkedList.insertFirstLink ("E F", 800);

       ;theLinkedList.removeFirst ();
        System.out.println (theLinkedList.find ("C D").bookName + " was found.\n");
        theLinkedList.removeLink ("C D");
        theLinkedList.display ();
    }
}

class LinkList {
    public Link firstLink;

    LinkList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return (firstLink == null);
    }

    public void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link (bookName, millionsSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirst() {
        Link linkReference = firstLink;

        if(!isEmpty ()) {
            firstLink = firstLink.next;
        }
        else {
            System.out.println ("Empty reference");
        }

        return linkReference;
    }

    public void display() {
        Link theLink = firstLink;

        while (theLink != null) {
            theLink.display ();
            System.out.println ("Next Link: " + theLink.next);

            theLink = theLink.next;
            System.out.println ();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;

        if (!isEmpty ()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                }
                else {
                    theLink = theLink.next;
                }
            }
        }
        else {
            System.out.println ("Empty LinkedList");
        }
        return theLink;
    }

    public Link removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while (currentLink.bookName != bookName) {
            if(currentLink.next == null) {
                return null;
            }
            else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }

        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        }
        else {
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}
