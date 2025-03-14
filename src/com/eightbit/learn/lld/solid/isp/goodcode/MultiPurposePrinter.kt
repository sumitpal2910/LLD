package com.eightbit.learn.lld.solid.isp.goodcode

class MultiPurposePrinter : Printer, Copier, Scanner {
    override fun print(document: Document) {
        println("Printing document...")
    }

    override fun copy(document: Document) {
        println("Copying document...")
    }

    override fun scan(document: Document) {
        println("Scanning document...")
    }
}