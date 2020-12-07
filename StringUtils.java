
class StringUtils {

	/*
	 *	Concatenates the given array of strings.
	 */

	static String	concat(String[] strings) {
		String str = "";
		for (String s : strings) {
			str = str.concat(s);
		}
		return str;
	}

	public static void main(String[] args) {
		String strings[] = {"Hello ", "World ", "!!"};
		String res = StringUtils.concat(strings);
		System.out.println(res);
	}
}
