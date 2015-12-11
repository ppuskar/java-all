package com.java.all.datastructure.trie;

/**
 * The Class TrieNode.
 */
public class TrieNode {

	/** The value. */
	private char value;

	/** The is word. */
	private boolean isWord;

	/** The meaning. */
	private String meaning;

	/** The alphabates. */
	private TrieNode[] alphabates;

	public TrieNode(char value) {
		this.value = value;
		this.alphabates = new TrieNode[26];
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isWord() {
		return isWord;
	}

	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public TrieNode[] getAlphabates() {
		return alphabates;
	}

	public void setAlphabates(TrieNode[] alphabates) {
		this.alphabates = alphabates;
	}

}
