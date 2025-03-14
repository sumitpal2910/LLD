package com.eightbit.learn.lld.solid.lsp.badcode

class ReadOnlyFile : File() {

    public override fun write() {
        throw UnsupportedOperationException("Can't write to a readonly file");
    }

}