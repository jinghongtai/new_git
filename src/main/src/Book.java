import java.math.BigDecimal;

/**
 * 版权归公司所有
 * 项目名称： 应用支撑平台;
 * 创建者    :  jinghongtai;
 * 创建日期: 2018年08月13日 11:24;
 *
 * @version: 1.0
 */
public class Book {

    private String id;

    private String name;

    private String author;

    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
