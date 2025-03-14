package com.eightbit.learn.lld.solid.lsp.badcode

fun main() {
    val file: File = ReadOnlyFile();

    file.read();
    file.write();
}