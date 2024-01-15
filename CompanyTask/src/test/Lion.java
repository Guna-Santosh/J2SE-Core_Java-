package test;

import java.io.*;
import java.util.ArrayList;

public class Lion {
	static ArrayList ar1, ar2, ar3, ar4, ar5 = null;

	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) throws Exception {
		ar1 = new ArrayList();
		ar2 = new ArrayList();
		ar3 = new ArrayList();
		ar4 = new ArrayList();
		ar5 = new ArrayList();
		System.out.println("package " + (new Lion().getClass() + "").substring(6, 10) + ";\n" + "public "
				+ (new Lion().getClass() + "").substring(0, 5) + " " + (new Lion().getClass() + "").substring(11)
				+ "\n {");
		BufferedReader omj = new BufferedReader(new InputStreamReader(
				new BufferedInputStream(new FileInputStream("C:\\Users\\SANTOSH\\OneDrive\\Desktop\\javaof.ts"))));
		String ii;
		while ((ii = omj.readLine()) != null) {
			String[] o = ii.split(" ");
			for (int i = 0; i < o.length; i++) {
				if (o[i].contains("private"))
					ar1.add(o[i].replaceAll("[' ','\t','\r','\n' ]", ""));
				if (o[i].startsWith("") && o[i].endsWith(":"))
					ar2.add((o[i].substring(1, o[i].length() - 1) + "").replaceAll("", ""));
				if ((o[i].startsWith(":") || o[i].endsWith(";")) && (o[i].contains("string") || o[i].contains("any")
						|| o[i].contains("Array<string>") || o[i].contains("Arrays<number>")
						|| o[i].contains("Arrays<any>") || o[i].contains("Date") || o[i].contains("number"))) {
					String hj = "";
					switch (o[i].substring(0, o[i].length() - 1)) {
					case "string" -> hj = "String";
					case "any" -> hj = "Object";
					case "Array<string>" -> hj = "List<String>";
					case "Array<number>" -> hj = "List<Interger>";
					case "Array<any>" -> hj = "List<Object>";
					case "number" -> hj = "int";
					case "Date" -> hj = "Date";
					}
					ar3.add(hj);
				}
				if (o[i].startsWith("'") || o[i].endsWith("'"))
					ar4.add(o[i].substring(1, o[i].length() - 2));
			}
		}
		new Lion().instanceVariable().forEach(p -> {
			System.out.println(p);
		});
		new Lion().getSet();
		System.out.println("}");
	}

	@SuppressWarnings({ "unchecked" })
	public ArrayList instanceVariable() {
		for (int i = 0; i < ar1.size(); i++)
			ar5.add("\t@Jsonproperty(\"" + ar4.get(i) + "\")" + "\n" + "\t" + ar1.get(i) + " " + ar3.get(i) + " "
					+ ar2.get(i) + ";\n");
		return ar5;
	}

	public void getSet() {
		for (int i = 0; i < ar1.size(); i++)
			System.out.println("\n" + "\tpublic  " + ar3.get(i) + " get" + ar2.get(i) + "() { return " + ar2.get(i)
					+ ";}" + "\n" + "\tpublic  void " + "set" + ar2.get(i) + "(" + ar3.get(i) + " " + ar2.get(i) + ")"
					+ "{ this." + ar2.get(i) + " = " + ar2.get(i) + "; }");
	}
}
