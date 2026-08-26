import std.array;

char[] stringToChar(string str) {
    return str.dup;
}

string charToString(char[] chars) {
    return chars.idup;
}

char[] replaceInString(string from, string toReplace, string into) {
    return from.replace(toReplace, into);
}