package com.demo.algorism;


//利用递归列出磁盘上文件夹的目录树，程序运行时可手动建立文件夹目录
import java.io.File;

public class FileTree {

	public static void main(String[] args) {
		File f = new File("d:/A");
		System.out.println(f.getName());
		tree(f,1);
	}
	public static void tree(File f,int level) {
		String preStr = "";
		for(int i=0;i<=level;i++) {
			preStr += "    ";
		}

		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++) {
			System.out.println(preStr + childs[i].getName());
			if(childs[i].isDirectory()) {
				tree(childs[i],level + 1);
			}
		}
	}
}
