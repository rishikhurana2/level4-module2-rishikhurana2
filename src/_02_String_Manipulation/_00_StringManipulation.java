package _02_String_Manipulation;

public class _00_StringManipulation {
	// Complete the exercises at the following links
	// http://codingbat.com/java/String-1
	// http://codingbat.com/java/String-2
	// http://codingbat.com/java/String-3
	public static void main(String[] args) {
		_00_StringManipulation sm = new _00_StringManipulation();
		System.out.println(sm.helloName("Bob"));
		System.out.println(sm.extraFont("Hello"));
		System.out.println(sm.makeAbba("Bob", "John"));
		System.out.println(sm.makeTags("i","hello"));
		System.out.println(sm.makeOutWord("<<>>","word"));
		System.out.println(sm.extraEnd("Hey"));
		System.out.println(sm.firstTwo("Hello"));
		System.out.println(sm.firstHalf("WooHoo"));
		System.out.println(sm.withoutEnd("java"));
		System.out.println(sm.comboString("Bye", "Hi"));
		System.out.println(sm.nonStart("Hello", "There"));
		System.out.println(sm.left2("helloww"));
		System.out.println(sm.right2("Hello"));
		System.out.println(sm.theEnd("Hello", false));
		System.out.println(sm.withouEnd2("ab"));
	}
	public String extraFont(String str) {
		String j = null;
		if (str.length() > 2) {
			j = str.substring(0, 2);
			str = j + j + j;
		}
		if (str.length() == 1 || str.length() == 2) {
			str = str + str + str;
		}
		return str;
	}
	public String helloName(String name) {
		String greeting = "Hello " + name +"!";
		return greeting;
	}
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}
	public String makeOutWord(String out, String word) {
		String out1 = out.substring(0, 2);
		String out2 = out.substring(2,4);
		return out1 + word + out2;
	}
	public String extraEnd(String str) {
		String j = null;
		if (str.length() >= 2) {
			j = str.substring(str.length() - 2, str.length());
			str = j + j + j;
		}
		return str;
	}
	public String firstTwo(String str) {
		String j = str.substring(0, 2);
		return j;
	}
	public String firstHalf(String str) {
		String firstHalf = str.substring(0, str.length()/2);
		return firstHalf;
	}
	public String withoutEnd(String str) {
		String withoutEnd = str.substring(1, str.length() - 1);
		return withoutEnd;
	}
	public String comboString(String a, String b) {
		String combo = null;
		if (a.length() < b.length()) {
			combo = a + b + a;
		}
		if (b.length() < a.length()) {
			combo = b + a + b;
		}
		return combo;
	}
	public String nonStart(String a, String b) {
		String a1 = a.substring(1, a.length());
		String b1 = b.substring(1, b.length());
		return a1 + b1;
	}
	public String left2(String str) {
		String end = str.substring(0, 2);
		String start = str.substring(2, str.length());
		return start + end;
	}
	public String right2(String str) {
		String end = str.substring(0, str.length() - 2);
		String start = str.substring(str.length() - 2, str.length());
		return start + end;
	}
	public String theEnd(String str, boolean front) {
		String j = null;
		if (front) {
			j = str.substring(0, 1);
		}
		if (!front) {
			j = str.substring(str.length() - 1, str.length());
		}
		return j;
	}
	public String withouEnd2(String str) {
		String s = str.substring(1, str.length() - 1);
		return s;
	}
	public String middleTwo (String str) {
		char firstStr = str.charAt(str.length()/2 - 1);
		char secondStr = str.charAt(str.length()/2);
		return firstStr + secondStr;
	}
}
