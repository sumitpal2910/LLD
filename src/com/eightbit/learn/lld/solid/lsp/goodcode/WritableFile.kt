package com.eightbit.learn.lld.solid.lsp.goodcode

import java.util.Objects

open class WritableFile : ReadableFile(), Writable {
    override fun write(): Unit {
        println("Writing to file...");
    }
}