package com.eightbit.learn.lld.solid.lsp.goodcode

fun main(args: Array<String>) {

    val readableFile: ReadableFile = ReadableFile();
    readableFile.read();


    val writableFile: WritableFile = WritableFile();
    writableFile.read();
    writableFile.write();

    readFromFile(writableFile);
}

fun readFromFile(readableFile: Readable): Unit {

    readableFile.read();

}