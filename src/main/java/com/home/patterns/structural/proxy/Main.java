package com.home.patterns.structural.proxy;

public class Main {

//    Imagine that we are implementing a Viewer application, which will show a Microsoft Word
// document in read only mode.
//
//    The Viewer must open and load document quickly, but the problem is that during loading
// of the document, we don’t know if there are any “heavy” objects inside a document. A heavy
// object can be an image which is injected in a Word document on, let’s say, page 10 of the document.
//
//    So, a straight solution where we simply load everything that is inside the document can be slow.
//
//    Another solution would be that heavy objects are loaded on demand: in our example, an image
// will be loaded when the user is on the page 10 of the document. Meanwhile, the heavy object will
// be presented by another, “lighter” object, which acts as original.
//
//    That solution is a Proxy.
//
//    The Proxy pattern provides a surrogate or a placeholder for another object to control access
// to it.

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        // realSubject is not created yet, therefore we expect null
        System.out.println(proxy.getRealSubject());

        proxy.doOperation();

        System.out.println((proxy.getRealSubject()));
    }
}
