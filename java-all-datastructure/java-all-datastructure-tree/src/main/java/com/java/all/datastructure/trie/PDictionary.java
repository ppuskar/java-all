package com.java.all.datastructure.trie;

import java.util.ArrayList;
import java.util.List;

public class PDictionary {

	private static final int START_OF_TOKEN = 'a';
	private TrieNode[] dictionary = new TrieNode[26];

	public PDictionary() {
	}

	private int getIndex(char charToken) {
		int index = charToken;
		if (!isLower(charToken)) {
			index = (charToken ^ 32);
		}
		return index - START_OF_TOKEN;
	}

	private boolean isLower(char token) {
		return token >= START_OF_TOKEN;
	}

	public List<String> getWords(char[] tokens) {
		List<String> allWOrds = new ArrayList<String>();
		TrieNode trieNode = this.dictionary[getIndex(tokens[0])];
		searchWords(allWOrds, trieNode, tokens, 0);
		return allWOrds;
	}

	private void searchWords(List<String> words, TrieNode node, char[] tokens,
			int i) {
		if (i == tokens.length - 1) {
			// start searching for all possible words from here.
			node = node.getAlphabates()[getIndex(tokens[i])];
			scanTrieForWords(words, node);
		} else {
			node = node.getAlphabates()[getIndex(tokens[i])];
			searchWords(words, node, tokens, i + 1);
		}
	}

	/**
	 * Scan trie for words.
	 *
	 * @param words
	 *            the words
	 * @param node
	 *            the node
	 */
	private void scanTrieForWords(List<String> words, TrieNode node) {
		if (node == null) {
			return;
		}

		if (node.isWord()) {
			words.add(node.getMeaning());
		}

		for (TrieNode tempNode : node.getAlphabates()) {
			scanTrieForWords(words, tempNode);
		}
	}

	public static void main(String[] args) {
		PDictionary dictionary = new PDictionary();
		dictionary.addNewWord("a", "a");
		dictionary.addNewWord("an", "an");
		dictionary.addNewWord("ant", "anta");
		dictionary.addNewWord("ace", "ace");
		dictionary.addNewWord("aced", "aced");
		dictionary.addNewWord("ape", "ape");
		dictionary.addNewWord("apex", "apex");
		dictionary.addNewWord("apple", "apple");
		dictionary.addNewWord("applet", "applet");
		dictionary.addNewWord("application", "application");
		dictionary.addNewWord("pea", "pea");
		dictionary.addNewWord("peas", "peas");
		dictionary.addNewWord("peacock", "peacock");
		dictionary.addNewWord("peahen", "peahen");
		dictionary.addNewWord("people", "people");

		List<String> words = dictionary.getWords("ap".toCharArray());
		System.out.println(words);
		words = dictionary.getWords("pea".toCharArray());
		System.out.println(words);
		words = dictionary.getWords("pe".toCharArray());
		System.out.println(words);
		words = dictionary.getWords("peo".toCharArray());
		System.out.println(words);
	}

	public void addNewWord(String word, String meaning) {
		char[] tokens = word.toCharArray();
		int index = getIndex(tokens[0]);
		TrieNode node = dictionary[index];
		if (node == null) {
			node = createNewNode(tokens[0]);
			dictionary[index] = node;
		}
		addNewNode(node, tokens, 0, meaning);
	}

	private TrieNode createNewNode(char token) {
		TrieNode node = new TrieNode(token);
		return node;
	}

	private void addNewNode(TrieNode node, char[] tokens, int i, String meaning) {
		if (i == tokens.length) {
			return;
		}

		TrieNode newNode = node.getAlphabates()[getIndex(tokens[i])];
		if (newNode == null) {
			newNode = createNewNode(tokens[i]);
			node.getAlphabates()[getIndex(tokens[i])] = newNode;
		}

		if (i == tokens.length - 1) {
			// word has finalized its position, set metadata
			newNode.setWord(true);
			newNode.setMeaning(meaning);
		}
		addNewNode(newNode, tokens, i + 1, meaning);
	}
}