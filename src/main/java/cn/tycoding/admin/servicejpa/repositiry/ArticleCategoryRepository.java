package cn.tycoding.admin.servicejpa.repositiry;

import cn.tycoding.admin.entity.ArticleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther Fys
 * @date 2019/5/1
 */
public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory,Long>
{
    List<ArticleCategory> findArticleCategoryByArticleIdAndAndCategoryId(long articleId, long categoryId);

    Boolean existsArticleCategoriesByArticleIdAndAndCategoryId(long articleId, long categoryId);

    void deleteArticleCategoriesByArticleId(long articleId);

    void deleteArticleCategoriesByCategoryId(long categoryId);
}
