import std.stdio;
import std.file;
import std.path;

// entry point for compilation
int main(String[] args) {
    if(!exists(src) || !isDir(src)) {
        return(2); // the file could not be found or is not a directory
    }

    string src = args[0];
    string out = args[1] == null || !exists(src) || !isDir(src) ? dirName(src): args[1];
}