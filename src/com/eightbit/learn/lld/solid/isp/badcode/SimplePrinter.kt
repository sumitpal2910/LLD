package com.eightbit.learn.lld.solid.isp.badcode

class SimplePrinter : Printer {
    override fun print(document: Document) {
        println("Printing document...");
    }

    override fun scan(document: Document) {
        throw UnsupportedOperationException("Scanning not supported");
    }

    override fun copy(document: Document) {
        throw UnsupportedOperationException("Copying not supported");
    }
}