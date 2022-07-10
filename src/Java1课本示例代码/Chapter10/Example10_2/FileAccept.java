package Java1课本示例代码.Chapter10.Example10_2;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter {
    private String extendName;

    public void setExtendName(String extendName) {
        this.extendName = "." + extendName;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extendName);
    }
}
