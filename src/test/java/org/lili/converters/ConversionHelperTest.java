package org.lili.converters;

import org.junit.Test;

/**
 * @packgeName: org.lili.converters
 * @ClassName: ConversionHelperTest
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-13:02
 * @version: 1.0
 * @since: JDK 1.8
 */
class Person{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PersonData{
    private int id;
    private String name;
    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:"+id+" name:"+name;
    }
}




public class ConversionHelperTest {
    @Test
    public void copyProperties() throws Exception {
        //如果没有get方法，那么全部为属性默认值
//        Person p = new Person();
//        PersonData pd = new PersonData();
//        p.setId(1);
//        p.setName("lili");
//        ConversionHelper.copyProperties(p,pd);
//        System.out.println(pd);
    }

}