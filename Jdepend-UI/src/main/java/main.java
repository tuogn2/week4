

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import jdepend.xmlui.JDepend;

public class main {
	public static void main(String[] args) throws IOException {
		PrintWriter printWriter = new PrintWriter(new FileOutputStream("result.xml"));
		JDepend depend = new JDepend(printWriter);
		depend.addDirectory("T:\\Jdepend\\Jdepend-UI");
		depend.analyze();
	}

}
