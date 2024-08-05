package org.lili.model;

/**
 * @packgeName: org.lili.model
 * @ClassName: PriceInformationModel
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:57
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PriceInformationModel {
    private String currency;
    private double value;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
