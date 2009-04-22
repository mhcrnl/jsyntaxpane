/*
 * Copyright 2008 Ayman Al-Sairafi ayman.alsairafi@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License
 *       at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsyntaxpane;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Two comparators to compare Tokens.
 * @author Ayman Al-Sairafi
 */
public class TokenComparators {

	public static Comparator<Token> longestFirst = new LongestFirst();
	public static Comparator<Token> ShortestFirst = new ShortestFirst();

	private static class LongestFirst implements Comparator<Token> {

		@Override
		public int compare(Token t1, Token t2) {
			if (t1.start != t2.start) {
				return (t1.start - t2.start);
			} else if (t1.length != t2.length) {
				return (t2.length - t1.length);
			} else {
				return t1.type.compareTo(t2.type);
			}
		}
	}

	private static class ShortestFirst implements Comparator<Token> {

		@Override
		public int compare(Token t1, Token t2) {
			if (t1.start != t2.start) {
				return (t1.start - t2.start);
			} else if (t1.length != t2.length) {
				return (t1.length - t2.length);
			} else {
				return t1.type.compareTo(t2.type);
			}
		}
	}
}
