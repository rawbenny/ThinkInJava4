package exec.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Exec1 {
	
	  public static void main(String[] args) {
	    File path = new File(".");
	    String[] list;
	    if(args.length == 0)
	      list = path.list();
	    else
	      list = path.list(new DirFilter(args[0]));
	    Pattern pattern = Pattern.compile(args[0]);
	    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
	    for(String dirItem : list){
	    	String text = TextFile.read(dirItem).toString();
	    	System.out.println(text);
	    	if(pattern.matcher(text).matches()){
	    		System.out.println(dirItem);
	    	}
	    }
	  }
	}

	class DirFilter implements FilenameFilter {
//	  private Pattern pattern;
	  public DirFilter(String regex) {
//	    pattern = Pattern.compile(regex);
	  }
	  public boolean accept(File dir, String name) {
		  
	    return dir.isFile() ;
//	    		&& pattern.matcher(name).matches() ;
	  }
	}
