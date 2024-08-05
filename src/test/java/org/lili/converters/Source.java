package org.lili.converters;

/**
 * @packgeName: org.lili.converters
 * @ClassName: Source
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-1:04
 * @version: 1.0
 * @since: JDK 1.8
 */
public class Source {
    private String name;
    private int age;

    public Source(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
