package trie;

import java.util.HashMap;

public class TrieNode {

  public TrieNode(char ch) {
    value = ch;
    children = new HashMap<>();
    bIsEnd = false;
  }

  public HashMap<Character, TrieNode> getChildren() {
    return children;
  }

  public char getValue() {
    return value;
  }

  public void setIsEnd(boolean val) {
    bIsEnd = val;
  }

  public boolean isEnd() {
    return bIsEnd;
  }

  private char value;
  private HashMap<Character, TrieNode> children;
  private boolean bIsEnd;

}