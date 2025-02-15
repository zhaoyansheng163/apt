package io.patamon.apt;

import io.patamon.apt.annotation.TestAnnotation;
import io.patamon.apt.annotation.TestJavaSource;

/**
 * Desc: {@link TestAnnotation} 的demo
 * <p>
 * Mail: chk19940609@gmail.com
 * Created by IceMimosa
 * Date: 2018/1/30
 */
@TestJavaSource
public class TestJavaSourceAnnotationDemo {

    public static void main(String[] args) throws Exception {
        com.sun.tools.javac.Main.main(new String[] {"-proc:only",
                "-processor", "io.patamon.apt.annotation.TestJavaSource",
                "E:\\work\\res\\git\\OpenSource\\github\\zhaoyansheng163\\apt\\apt-demo\\src\\main\\java\\io\\patamon\\apt\\TestJavaSourceAnnotationDemo.java"});

        System.out.println(TestJavaSourceGenerate.getTest());
    }

}
