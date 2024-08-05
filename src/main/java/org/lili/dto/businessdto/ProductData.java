package org.lili.dto.businessdto;

/**
 * @packgeName: org.lili.dto.businessdto
 * @ClassName: ProductData
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:37
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ProductData {
    private String code;
    private String name;
    private String description;
    private String pictureUrl;
    private PriceData price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public PriceData getPrice() {
        return price;
    }

    public void setPrice(PriceData price) {
        this.price = price;
    }
}
