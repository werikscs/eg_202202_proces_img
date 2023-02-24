import ij.IJ;
import ij.plugin.PlugIn;
 
public class Another_Plugin  implements PlugIn {
	public void run(String arg) {
		IJ.error("Hello world!");
	}
}