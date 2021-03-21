package com.demo.io.processingstream;
import java.io.*;

public class BufferedReaderDemo {


	/**
	 * 读取键盘输入的内容
	 * @param args
	 */
	public static void main(String [] args) {
		System.out.println("enter something...");
		while(true) {
			/**
			 * System.in “标准”输入流。 该流已经打开，准备提供输入数据。
			 * 通常，该流对应于键盘输入或由主机环境或用户指定的另一个输入源。
 			 */
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new  BufferedReader(in);
			/**
			 * 读一行文字。 一行被视为由换行符（'\ n'），
			 * 回车符（'\ r'）中的任何一个或随后的换行符终止。
			 */
			String  temp = null;
			try {
				temp = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(temp.equalsIgnoreCase("exit")) {
				System.out.println("bye...");

				// 终结当前运行的Java虚拟机
				System.exit(-1);
			}
			System.out.println(temp);
		}
	}

	/**
	 * 使用BufferedReader读取文件
	 * @param filePath
	 * @throws FileNotFoundException
	 */
	public static void readFile(String filePath)
			throws FileNotFoundException {

		File file = new File(filePath);

		// 此处要注意，抛出FileNotFoundException必须要在方法上声明该异常
		if (!file.exists()) {
			throw new FileNotFoundException("File is not exists");
		}

		Reader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			String str = "";
			while((str = bufferedReader.readLine()) != null) {
				System.out.println("filename " + str);
			}
			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
