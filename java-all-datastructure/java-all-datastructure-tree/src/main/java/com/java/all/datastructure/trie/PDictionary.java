package com.java.all.datastructure.trie;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class PDictionary.
 */
public class PDictionary {

	/** The Constant START_OF_TOKEN. */
	private static final int START_OF_TOKEN = 'a';

	/** The dictionary. */
	private TrieNode[] dictionary = new TrieNode[26];

	/**
	 * Translates the character into dictionary specific index.
	 *
	 * @param charToken
	 *            the char token
	 * @return the index
	 */
	private int getIndex(char charToken) {
		int index = charToken;
		if (!isLower(charToken)) {
			index = (charToken ^ 32);
		}
		return index - START_OF_TOKEN;
	}

	/**
	 * Checks if is lower case alphabet.
	 *
	 * @param token
	 *            the token
	 * @return true, if is lower
	 */
	private boolean isLower(char token) {
		return token >= START_OF_TOKEN;
	}

	/**
	 * Gets the words.
	 *
	 * @param tokens
	 *            the tokens
	 * @return the words
	 */
	public List<String> getWordMeaning(char[] tokens) {
		List<String> allWOrds = new ArrayList<String>();
		TrieNode trieNode = this.dictionary[getIndex(tokens[0])];
		searchWords(allWOrds, trieNode, tokens, 0);
		return allWOrds;
	}

	/**
	 * Search words.
	 *
	 * @param words
	 *            the words
	 * @param node
	 *            the node
	 * @param tokens
	 *            the tokens
	 * @param i
	 *            the i
	 */
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

	/**
	 * Adds the new word.
	 *
	 * @param word
	 *            the word
	 * @param meaning
	 *            the meaning
	 */
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

	/**
	 * Creates the new node.
	 *
	 * @param token
	 *            the token
	 * @return the trie node
	 */
	private TrieNode createNewNode(char token) {
		TrieNode node = new TrieNode(token);
		return node;
	}

	/**
	 * Adds the new node.
	 *
	 * @param node
	 *            the node
	 * @param tokens
	 *            the tokens
	 * @param i
	 *            the i
	 * @param meaning
	 *            the meaning
	 */
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

	/**
	 * The main method. Driver for the API.
	 *
	 * @param args
	 *            the arguments
	 */
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

		List<String> words = dictionary.getWordMeaning("ap".toCharArray());
		System.out.println(words);
		words = dictionary.getWordMeaning("pea".toCharArray());
		System.out.println(words);
		words = dictionary.getWordMeaning("pe".toCharArray());
		System.out.println(words);
		words = dictionary.getWordMeaning("peo".toCharArray());
		System.out.println(words);
	}
}