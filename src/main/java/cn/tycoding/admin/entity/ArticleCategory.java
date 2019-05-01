package cn.tycoding.admin.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @auther TyCoding
 * @date 2018/10/22
 */
@Data
@Entity
@Table(name = "tb_article_category")
public class ArticleCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment",strategy = "increment")
    private long id; //编号

    @NotNull
    @Column(name = "article_id")
    private long articleId; //文章ID

    @NotNull
    @Column(name = "category_id")
    private long categoryId; //分类ID

    public ArticleCategory() {
    }

    public ArticleCategory(long articleId, long categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }
}
