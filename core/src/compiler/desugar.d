import std.stdio;
import std.string;
import std.algorithm;

string desugar(string content) {
    string c = content.lineSplitter.map!strip.join("\n");
}