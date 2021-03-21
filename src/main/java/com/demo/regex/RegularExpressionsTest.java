package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTest {

    /**
     * @param args
     * boolean matches(String regex): 告知此字符串是否匹配给定的正则表达式。
     */
    public static void main(String[] args) {

        testHelloWorld();
        /**
         * 简单认识正则表达式概念
         * 将字符串a8729a中所有的数字替换成-,用正则表达式实现起来非常方便
         * \d代表的是一位数字，为什么要敲两个反斜杠呢？
         * 在java里一个反斜杠表示转义，正则表达式要求的是\d，两个\才能满足
         * static Pattern compile(String regex)  将给定的正则表达式编译到模式中
         * 为什么要提前编译呢？
         * 提前编译避免了使用的时候再编译，提高了速度
         * [a-z]表示单个字母,要想表示多个字母可以在后面加上{2}(此处表示两个字母)
         * 注意以下两种书写的方式，"s".matches("[a-z]")相对简单
         * 但是分开写是有好处的：1.效率高,2.功能多
         * Pattern 正则表达式的编译表示形式
         * Matcher 通过解释 Pattern 对 character sequence 执行匹配操作的引擎
         */




        //以下两种写法达到的目的是一样的
		/*
		p("abc".matches("..."));// outputs:true
		p(Pattern.matches("...", "abc"));
		*/

        //方法replaceAll的第一个参数传正则表达式,第二个传将要被替换的字符
		/*p("a8729a".replaceAll("\\d", "-"));
		Pattern p = Pattern.compile("[a-z]{3}");
		Matcher m = p.matcher("sf");
		Matcher m1 = p.matcher("sdf");

		p("m.matches : " + m.matches());
		p("m1.matches : " + m1.matches());
		p("s".matches("[a-z]"));
		p("d".matches("[d-e]"));
		p("sss".matches("[a-z]"));//默认表示一个字母
		p("abc".matches("[a-d]{3}"));
		*/

        /**
         * 初步认识. * + ?
         * 忘记意思可以查看JAVA API Pattern类
         * 1. .代表任意字符
         * Greedy 数量词
         * X? X，一次或一次也没有
         * X* X，零次或多次
         * X+ X，一次或多次
         * X{n} X，恰好 n 次
         * X{n,} X，至少 n 次
         * X{n,m} X，至少 n 次，但是不超过 m 次
         */
		/*
		p("aa".matches(".."));
		p("a".matches("a"));
		p("a".matches("a?"));
		p("".matches("a?"));
		p("".matches("a*"));
		p("aaaa".matches("a*"));
		p("a".matches("a+"));
		p("aaaa".matches("a+"));
		p("aaa".matches("a{3}"));
		p("aaa".matches("a{2,}"));
		p("aaaa".matches("a{3,6}"));
		p("214523d145234532".matches("\\d{3,6}.\\d{6,}"));
		p("192.168.0.a".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\D{1,3}"));
		p("192".matches("[0-2][0-9][0-9]"));

		*/
        /**
         * 范围
         * []表示范围
         */
	/*
		p("a".matches("[abc]"));
		p("a".matches("[^abc]"));
		p("d".matches("[^abc]"));
		p("A".matches("[a-zA-Z]"));
		p("A".matches("[a-z]|[A-Z]"));
		p("A".matches("[a-z[A-Z]]"));
		p("R".matches("[A-Z&&[RFG]]"));
		*/
		/*
		  认识\s \w \d \
		  预定义字符类
	  	. 任何字符（与行结束符可能匹配也可能不匹配）
		\d 数字：[0-9]
		\D 非数字： [^0-9]
		\s 空白字符：[ \t\n\x0B\f\r]
		\S 非空白字符：[^\s]
		\w 单词字符：[a-zA-Z_0-9]
		\W 非单词字符：[^\w]
		 */

		/*
		p("\n\r\t\r".matches("\\s{4}"));
		p(" ".matches("\\S"));
		p("a_8".matches("\\w{3}"));
		p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
		p("\\".matches("\\\\"));
		*/

		/*
		 * POSIX STYLE
		 * \p{Lower} 小写字母字符：[a-z]
			\p{Upper} 大写字母字符：[A-Z]
			\p{ASCII} 所有 ASCII：[\x00-\x7F]
			\p{Alpha} 字母字符：[\p{Lower}\p{Upper}]
			\p{Digit} 十进制数字：[0-9]
			\p{Alnum} 字母数字字符：[\p{Alpha}\p{Digit}]
			\p{Punct} 标点符号：!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
			\p{Graph} 可见字符：[\p{Alnum}\p{Punct}]
			\p{Print} 可打印字符：[\p{Graph}\x20]
			\p{Blank} 空格或制表符：[ \t]
			\p{Cntrl} 控制字符：[\x00-\x1F\x7F]
			\p{XDigit} 十六进制数字：[0-9a-fA-F]
			\p{Space} 空白字符：[ \t\n\x0B\f\r]

		 */
/*
		p("a".matches("\\p{Lower}"));
		p("a".matches("\\p{Upper}"));
		p("A".matches("\\p{Upper}"));
		p("x".matches("\\p{ASCII}"));
	*/
		/*
		 边界匹配器
		^ 行的开头
		$ 行的结尾
		\b 单词边界
		\B 非单词边界
		\A 输入的开头
		\G 上一个匹配的结尾
		\Z 输入的结尾，仅用于最后的结束符（如果有的话）
		\z 输入的结尾
		 */
		/*
		p("hello sir".matches("^h.*"));
		p("hello sir".matches(".*ir$"));
		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
		p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
		*/
        /*
         * white lines 空白行
         */
		/*
		p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
		*/
		/*
		p("aaa 8888c".matches(".*\\d{4}."));
		p("aaa 8888c".matches(".*\\b\\d{4}."));
		p("aaa8888c".matches(".*\\d{4}."));
		p("aaa8888c".matches(".*\\b\\d{4}."));
		*/

        //email
		/*
		p("asdfasdfsafsf@dsdfsdf.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		*/

		/*
		 matches find lookingAt
		 looking每次从头上开始找
		 start 找到子串起始位置，end找结束位置
		 lookingAt()是从头开始查找
		 */
		
		/*Pattern p1 = Pattern.compile("\\d{3,5}");
		String s = "123-34345-234-00";
		Matcher m1 = p1.matcher(s);
		p(m1.matches());
		m1.reset();
		p(m1.find());
		p(m1.start() + "-" + m.end());
		p(m1.find());
		p(m1.start() + "-" + m.end());
		p(m1.find());
		p(m1.start() + "-" + m.end());
		p(m1.find());
		//p(m.start() + "-" + m.end());
		
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());
		*/
    }

    public static void testHelloWorld() {

        Pattern pattern = Pattern.compile("HelloWorld");
        Matcher matcher = pattern.matcher("HelloWorld");
        boolean b = matcher.matches();

        System.out.println("pattern : " + pattern);

        System.out.println(b);
        System.out.println("HelloWorld".matches("H*d"));
    }
}
