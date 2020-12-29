package com.oxx.Blog.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetFoldFileNames {

    /**
     *
     * @author zdz8207
     */
    public static void main(String[] args) {
        for (String map : getFileName("E:\\tool\\Blog\\src\\main\\resources\\static\\images\\category")) {
			System.out.println(map);
		}
    }

    public static List<String> getFileName(String path) {
    	List<String> list=new ArrayList<>(); 
        File f = new File(path);
        if (!f.exists()) {
            System.out.println(path + " not exists");
            return null;
        }

        File fa[] = f.listFiles();
        for (int i = 0; i < fa.length; i++) {
            File fs = fa[i];
            list.add(fs.getName());
        }
        return list;
    }
}