package org.lili.dto.businessdto;

/**
 * @packgeName: org.lili.dto.businessdto
 * @ClassName: PriceData
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:38
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PriceData {
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
