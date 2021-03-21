package com.demo;

import com.demo.utils.TestPathUtil;
import com.github.houbb.markdown.toc.core.MarkdownToc;
import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;
import com.github.houbb.markdown.toc.vo.TocGen;

import org.junit.Test;

/**
 * AtxMarkdownToc 单个文件测试
 *
 * @author author
 * @version 1.0
 * @since 2018-01-30 15:11:47.256
 */
public class AtxMarkdownTocFileTest {

    /**
     * 普通-fluent 写法
     */
   // @Test
    public void commonFluentTest() {
        String path = System.getProperty("user.dir");
        TocGen tocGen = AtxMarkdownToc.newInstance()
                .genTocFile(path);
        System.out.println(tocGen);
    }

    /**
     * 普通-新建接口的方式
     */
    @Test
    public void commonInterfaceTest() {
        String path = TestPathUtil.getAppRootPath("test.md");

        MarkdownToc markdownToc = new AtxMarkdownToc();
        TocGen tocGen = markdownToc.genTocFile(path);
        System.out.println(tocGen);
    }

    /**
     * 中文名称测试
     */
   // @Test
    public void chineseFileNameTest() {
        String path = TestPathUtil.getAppRootPath("中文名称.md");
        AtxMarkdownToc.newInstance()
                .genTocFile(path);
    }

    /**
     * 特殊文件编码测试
     */
    //@Test
    public void charsetGbkTest() {
        String path = TestPathUtil.getAppRootPath("README-GBK.md");
        AtxMarkdownToc.newInstance()
                .charset("GBK")
                .genTocFile(path);
    }

    /**
     * 不写入文件测试
     */
   // @Test
    public void notWriteTest() {
        String path = TestPathUtil.getAppRootPath("common.md");

        TocGen tocGen = AtxMarkdownToc.newInstance()
                .subTree(false)
                .genTocFile(path);

        System.out.println(tocGen);
    }

    /**
     * 多层目录测试
     */
    //@Test
    public void nLevelTest() {
        String path = TestPathUtil.getAppRootPath("N-LEVEL.md");

        TocGen tocGen = AtxMarkdownToc.newInstance()
                .genTocFile(path);

        System.out.println(tocGen);
    }

    /**
     * 演示配置测试
     */
    //@Test
    public void justConfigTest() {
        AtxMarkdownToc.newInstance()
                .charset("UTF-8")
                .write(true)
                .subTree(true);
    }

}
