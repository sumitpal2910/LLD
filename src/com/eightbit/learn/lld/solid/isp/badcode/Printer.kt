package com.eightbit.learn.lld.solid.isp.badcode

interface Printer {

    fun print(document: Document)

    fun scan(document: Document);

    fun copy(document: Document);
}